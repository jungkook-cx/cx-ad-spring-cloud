package com.cx.ad.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cx.ad.entity.AdUnit;
import com.cx.ad.exception.AdException;
import com.cx.ad.vo.*;

/**
 * 推广单元表(AdUnit)表服务接口
 *
 * @author makejava
 * @since 2021-01-20 15:23:42
 */
public interface AdUnitService extends IService<AdUnit> {
    /**
     *
     * @param request
     * @return
     * @throws AdException
     */
    AdUnitResponse createUnit(AdUnitRequest request) throws AdException;

    /**
     *
     * @param request
     * @return
     * @throws AdException
     */
    AdUnitKeywordResponse createUnitKeyword(AdUnitKeywordRequest request)
            throws AdException;

    /**
     *
     * @param request
     * @return
     * @throws AdException
     */
    AdUnitItResponse createUnitIt(AdUnitItRequest request)
            throws AdException;

    /**
     *
     * @param request
     * @return
     * @throws AdException
     */
    AdUnitDistrictResponse createUnitDistrict(AdUnitDistrictRequest request)
            throws AdException;

    /**
     *
     * @param request
     * @return
     * @throws AdException
     */
    CreativeUnitResponse createCreativeUnit(CreativeUnitRequest request)
            throws AdException;
}