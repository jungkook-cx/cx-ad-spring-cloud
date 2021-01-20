package com.cx.ad.controller;

import com.cx.ad.entity.unit_condition.AdUnitKeyword;
import com.cx.ad.service.AdUnitKeywordService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 推广单元关键词 Feature(AdUnitKeyword)表控制层
 *
 * @author makejava
 * @since 2021-01-20 15:36:41
 */
@RestController
@RequestMapping("adUnitKeyword")
public class AdUnitKeywordController {
    /**
     * 服务对象
     */
    @Resource
    private AdUnitKeywordService adUnitKeywordService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public AdUnitKeyword selectOne(Integer id) {
        return this.adUnitKeywordService.queryById(id);
    }

}