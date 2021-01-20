package com.cx.ad.controller;

import com.cx.ad.entity.AdPlan;
import com.cx.ad.service.AdPlanService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 推广计划表(AdPlan)表控制层
 *
 * @author makejava
 * @since 2021-01-20 15:07:53
 */
@RestController
@RequestMapping("adPlan")
public class AdPlanController {
    /**
     * 服务对象
     */
    @Resource
    private AdPlanService adPlanService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public AdPlan selectOne(Long id) {
        return this.adPlanService.queryById(id);
    }

}