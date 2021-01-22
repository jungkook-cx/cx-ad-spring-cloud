package com.cx.ad.controller;

import com.cx.ad.R;
import com.cx.ad.annotation.IgnoreResponseAdvice;
import com.cx.ad.client.SponsorClient;
import com.cx.ad.entity.AdPlan;
import com.cx.ad.vo.AdPlanGetRequest;
import com.cx.ad.vo.AdPlanRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

/**
 * @description:
 * @author: ChenXi
 * @time: 2021/1/22 15:28
 */
@Slf4j
@RestController
public class SearchController {
    @Resource
    private SponsorClient sponsorClient;

    private static final String PAYMENT_URL="http://EUREKA-CLIENT-AD-SPONSOR";

    @Resource
    private RestTemplate restTemplate;

    @IgnoreResponseAdvice
    @GetMapping("/getByRib/{id}")
    R<AdPlan> getAdPlanByFeign1(@PathVariable("id") Long id){
        return    restTemplate.getForObject(PAYMENT_URL+"/ad-sponsor/adPlan/get/"+id,R.class);
    }


    @GetMapping(value = "/get/{id}")
    R<AdPlan> getAdPlanByFeign(@PathVariable("id") Long id){
         return    sponsorClient.getAdPlanByFeign(id);
    }
}
