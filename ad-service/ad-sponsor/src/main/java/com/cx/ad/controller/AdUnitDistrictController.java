package com.cx.ad.controller;

import com.cx.ad.entity.unit_condition.AdUnitDistrict;
import com.cx.ad.service.AdUnitDistrictService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 推广单元地域 Feature(AdUnitDistrict)表控制层
 *
 * @author makejava
 * @since 2021-01-20 15:41:53
 */
@RestController
@RequestMapping("adUnitDistrict")
public class AdUnitDistrictController {
    /**
     * 服务对象
     */
    @Resource
    private AdUnitDistrictService adUnitDistrictService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public AdUnitDistrict selectOne(Integer id) {
        return this.adUnitDistrictService.queryById(id);
    }

}