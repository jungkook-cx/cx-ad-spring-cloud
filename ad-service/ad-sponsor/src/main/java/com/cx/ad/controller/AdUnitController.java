package com.cx.ad.controller;

import com.cx.ad.entity.AdUnit;
import com.cx.ad.service.AdUnitService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 推广单元表(AdUnit)表控制层
 *
 * @author makejava
 * @since 2021-01-20 15:23:42
 */
@RestController
@RequestMapping("adUnit")
public class AdUnitController {
    /**
     * 服务对象
     */
    @Resource
    private AdUnitService adUnitService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public AdUnit selectOne(Long id) {
        return this.adUnitService.queryById(id);
    }

}