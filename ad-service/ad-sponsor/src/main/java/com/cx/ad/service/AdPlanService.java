package com.cx.ad.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cx.ad.entity.AdPlan;
import com.cx.ad.exception.AdException;
import com.cx.ad.vo.AdPlanGetRequest;
import com.cx.ad.vo.AdPlanRequest;
import com.cx.ad.vo.AdPlanResponse;

import java.util.List;

/**
 * 推广计划表(AdPlan)表服务接口
 *
 * @author makejava
 * @since 2021-01-20 15:07:52
 */
public interface AdPlanService extends IService<AdPlan> {
    /**
     * 创建推广计划
     * @param request
     * @return
     * @throws AdException
     */
        AdPlanResponse createAdPlan(AdPlanRequest request)throws AdException;

    /**
     * 获取计划
     * @param request
     * @return
     * @throws AdException
     */
        List<AdPlan> getAdPlanByIds(AdPlanGetRequest request) throws AdException;

    /**
     *更新推广计划
     * @param request
     * @return
     * @throws AdException
     */
        AdPlanResponse updateAdPlan(AdPlanRequest request) throws AdException;

    /**
     *删除计划
     * @param request
     * @return
     * @throws AdException
     */
    void deleteAdPlan(AdPlanRequest request)throws AdException;

    AdPlan selectById(Long id);
}