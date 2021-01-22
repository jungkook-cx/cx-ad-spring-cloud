package com.cx.ad.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cx.ad.entity.AdUnit;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 推广单元表(AdUnit)表数据库访问层
 *
 * @author makejava
 * @since 2021-01-20 15:23:42
 */
@Mapper
public interface AdUnitMapper extends BaseMapper<AdUnit> {
    /**
     * 根据planId和单元名称查找
     * @param planId
     * @param unitName
     * @return
     */
    AdUnit findByPlanIdAndUnitName(Long planId,String unitName);

    /**
     * 根据状态查询
     * @param unitStatus
     * @return
     */
    List<AdUnit> findAllByUnitStatus(Integer unitStatus);
}