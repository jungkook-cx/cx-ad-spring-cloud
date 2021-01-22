package com.cx.ad.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cx.ad.entity.AdPlan;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 推广计划表(AdPlan)表数据库访问层
 *
 * @author makejava
 * @since 2021-01-20 15:07:47
 */
@Mapper
public interface AdPlanMapper extends BaseMapper<AdPlan> {

    /**
     * 根据id和userId查找推广计划
     * @param id 主键
     * @param userId
     * @return
     */
    AdPlan findByIdAndUserId(@Param("id") long id, @Param("userId") Long userId);

    /**
     * 根据多个id返回一个List集合
     * @param ids
     * @param userId
     * @return
     */
    List<AdPlan> findByIdsAndUserId(List<Long> ids,Long userId);

    /**
     * 根据userId和计划名称查找
     * @param userId
     * @param planName
     * @return
     */
    AdPlan findByUserAndPlanName(Long userId,String planName);

    /**
     *根据状态查找
     * @param status
     * @return
     */
    List<AdPlan> findAllByPlanStatus(Integer status);

    AdPlan findById(@Param("id") Long id);
}