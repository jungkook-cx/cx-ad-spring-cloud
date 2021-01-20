package com.cx.ad.service;

import com.cx.ad.entity.unit_condition.AdUnitDistrict;
import java.util.List;

/**
 * 推广单元地域 Feature(AdUnitDistrict)表服务接口
 *
 * @author makejava
 * @since 2021-01-20 15:41:53
 */
public interface AdUnitDistrictService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    AdUnitDistrict queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<AdUnitDistrict> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param adUnitDistrict 实例对象
     * @return 实例对象
     */
    AdUnitDistrict insert(AdUnitDistrict adUnitDistrict);

    /**
     * 修改数据
     *
     * @param adUnitDistrict 实例对象
     * @return 实例对象
     */
    AdUnitDistrict update(AdUnitDistrict adUnitDistrict);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}