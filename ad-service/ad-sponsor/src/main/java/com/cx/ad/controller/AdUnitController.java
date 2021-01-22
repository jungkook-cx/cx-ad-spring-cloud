package com.cx.ad.controller;

import com.alibaba.druid.support.json.JSONUtils;
import com.cx.ad.exception.AdException;
import com.cx.ad.service.AdUnitService;
import com.cx.ad.vo.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * 推广单元表(AdUnit)表控制层
 *
 * @author makejava
 * @since 2021-01-20 15:23:42
 */
@Api("推广单元")
@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping("/adUnit")
public class AdUnitController {
    private  AdUnitService adUnitService;

    @ApiOperation("创建一个推广单元")
    @PostMapping("/create")
    public AdUnitResponse createUnit(
            @RequestBody AdUnitRequest request) throws AdException {
        log.info("ad-sponsor: createUnit -> {}",
                JSONUtils.toJSONString(request));
        return adUnitService.createUnit(request);
    }

    @ApiOperation("创建关键字")
    @PostMapping("/create/unitKeyword")
    public AdUnitKeywordResponse createUnitKeyword(
            @RequestBody AdUnitKeywordRequest request
    ) throws AdException {
        log.info("ad-sponsor: createUnitKeyword -> {}",
                JSONUtils.toJSONString(request));
        return adUnitService.createUnitKeyword(request);
    }

    @PostMapping("/create/unitIt")
    public AdUnitItResponse createUnitIt(
            @RequestBody AdUnitItRequest request
    ) throws AdException {
        log.info("ad-sponsor: createUnitIt -> {}",
                JSONUtils.toJSONString(request));
        return adUnitService.createUnitIt(request);
    }

    @PostMapping("/create/unitDistrict")
    public AdUnitDistrictResponse createUnitDistrict(
            @RequestBody AdUnitDistrictRequest request
    ) throws AdException {
        log.info("ad-sponsor: createUnitDistrict -> {}",
                JSONUtils.toJSONString(request));
        return adUnitService.createUnitDistrict(request);
    }

    @PostMapping("/create/creativeUnit")
    public CreativeUnitResponse createCreativeUnit(
            @RequestBody CreativeUnitRequest request
    ) throws AdException {
        log.info("ad-sponsor: createCreativeUnit -> {}",
                JSONUtils.toJSONString(request));
        return adUnitService.createCreativeUnit(request);
    }
}