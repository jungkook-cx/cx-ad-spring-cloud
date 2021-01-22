package com.cx.ad.client;

import com.cx.ad.R;
import com.cx.ad.entity.AdPlan;
import org.apache.ibatis.annotations.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @description:
 * @author: ChenXi
 * @time: 2021/1/22 16:23
 */
@FeignClient(value = "EUREKA-CLIENT-AD-SPONSOR",fallback = SponsorClientHystrix.class)
public interface SponsorClient {

    @RequestMapping(value = "/ad-sponsor/adPlan/get/{id}",method = RequestMethod.GET)
    R<AdPlan> getAdPlanByFeign(@PathVariable("id") Long id);
}
