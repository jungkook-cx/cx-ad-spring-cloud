package com.cx.ad.filter;

import org.apache.commons.lang.time.DateUtils;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.result.view.RequestContext;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.net.URI;

/**
 * @description:
 * @author: ChenXi
 * @time: 2021/1/19 16:07
 */
@Component
public class PreRequestFilter implements GlobalFilter, Ordered {
    private static final String ELAPSED_TIME_BEGIN = "elapsedTimeBegin";
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        exchange.getAttributes().put(ELAPSED_TIME_BEGIN,System.currentTimeMillis());
        return chain.filter(exchange).then(Mono.fromRunnable(()->{
            Long startTime = exchange.getAttribute(ELAPSED_TIME_BEGIN);
            if (startTime!=null){
                System.out.println(exchange.getRequest().getURI().getRawPath()+" 方法耗时 : "+ (System.currentTimeMillis()-startTime)+"毫秒");
            }
        }));
    }

    @Override
    public int getOrder() {
        return Ordered.HIGHEST_PRECEDENCE;
    }
}
