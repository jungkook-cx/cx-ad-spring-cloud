package com.cx.ad.controller;

import com.alibaba.druid.support.json.JSONUtils;
import com.cx.ad.exception.AdException;
import com.cx.ad.service.AdCreativeService;
import com.cx.ad.vo.CreativeRequest;
import com.cx.ad.vo.CreativeResponse;
import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: ChenXi
 * @time: 2021/1/22 10:33
 */
@Slf4j
@RestController
@AllArgsConstructor
@Api("创意接口")
@RequestMapping("/creative")
public class CreativeController {
    private AdCreativeService creativeService;


    @PostMapping("/create")
    public CreativeResponse createCreative(
            @RequestBody CreativeRequest request
    ) throws AdException {
        log.info("ad-sponsor: createCreative -> {}",
                JSONUtils.toJSONString(request));
        return creativeService.createCreative(request);
    }
}
