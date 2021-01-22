package com.cx.ad.client;

import com.cx.ad.R;
import com.cx.ad.entity.AdPlan;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: ChenXi
 * @time: 2021/1/22 17:24
 */
@Component
@DefaultProperties(defaultFallback = "payment_global_FallbackMethod")
public class SponsorClientHystrix implements SponsorClient {
    @Override
    public R<AdPlan> getAdPlanByFeign(Long id) {
        return new R<AdPlan>(-1,"eureka client error",null);
    }

    /**
     * 全局统一的降级处理方法
     * @return
     */
    public String payment_global_FallbackMethod(){
        return "Global异常处理信息,请稍后再试";
    }
}
