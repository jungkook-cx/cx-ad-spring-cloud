package com.cx.ad.controller;

import com.cx.ad.entity.unit_condition.AdUnitIt;
import com.cx.ad.service.AdUnitItService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 推广单元兴趣 Feature(AdUnitIt)表控制层
 *
 * @author makejava
 * @since 2021-01-20 15:42:06
 */
@RestController
@RequestMapping("adUnitIt")
public class AdUnitItController {
    /**
     * 服务对象
     */
    @Resource
    private AdUnitItService adUnitItService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public AdUnitIt selectOne(Integer id) {
        return this.adUnitItService.queryById(id);
    }

}