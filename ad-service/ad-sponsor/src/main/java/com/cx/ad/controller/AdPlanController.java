package com.cx.ad.controller;

import com.cx.ad.R;
import com.cx.ad.entity.AdPlan;
import com.cx.ad.exception.AdException;
import com.cx.ad.service.AdPlanService;
import com.cx.ad.vo.AdPlanGetRequest;
import com.cx.ad.vo.AdPlanRequest;
import com.cx.ad.vo.AdPlanResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;


import java.util.List;

/**
 * 推广计划表(AdPlan)表控制层
 *
 * @author makejava
 * @since 2021-01-20 15:07:53
 */
@Api("推广计划管理")
@RestController
@RequestMapping("/adPlan")
@AllArgsConstructor
@Slf4j
public class AdPlanController {
    private AdPlanService planService;

    @PostMapping("/create")
    @ApiOperation("增加一个计划")
    public AdPlanResponse createAdPlan(
            @RequestBody AdPlanRequest request) throws AdException {
      /*  log.info("ad-sponsor: createAdPlan -> {}",
                JSONUtils.toJSONString(request));*/
        return planService.createAdPlan(request);
    }

    @PostMapping("/get")
    @ApiOperation("查询计划")
    public List<AdPlan> getAdPlanByIds(
            @RequestBody AdPlanGetRequest request) throws AdException {
       /* log.info("ad-sponsor: getAdPlanByIds -> {}",
                JSONUtils.toJSONString(request));*/
        return planService.getAdPlanByIds(request);
    }

    @GetMapping("/get/{id}")
    public R<AdPlan> getById(@PathVariable("id") Long id){
        AdPlan adPlan = planService.selectById(id);
        return new R(adPlan);
    }

    @PutMapping("/update")
    @ApiOperation("更新计划")
    public AdPlanResponse updateAdPlan(
            @RequestBody AdPlanRequest request) throws AdException {
       /* log.info("ad-sponsor: updateAdPlan -> {}",
                JSONUtils.toJSONString(request));*/
        return planService.updateAdPlan(request);
    }

    @DeleteMapping("/delete")
    @ApiOperation("删除计划")
    public void deleteAdPlan(
            @RequestBody AdPlanRequest request) throws AdException {
      /*  log.info("ad-sponsor: deleteAdPlan -> {}",
                JSONUtils.toJSONString(request));*/
        planService.deleteAdPlan(request);
    }
}