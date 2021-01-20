package com.cx.ad.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cx.ad.entity.AdPlan;
import java.util.List;

/**
 * 推广计划表(AdPlan)表服务接口
 *
 * @author makejava
 * @since 2021-01-20 15:07:52
 */
public interface AdPlanService extends IService<AdPlan> {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    AdPlan queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<AdPlan> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param adPlan 实例对象
     * @return 实例对象
     */
    AdPlan insert(AdPlan adPlan);

    /**
     * 修改数据
     *
     * @param adPlan 实例对象
     * @return 实例对象
     */
    AdPlan update(AdPlan adPlan);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}