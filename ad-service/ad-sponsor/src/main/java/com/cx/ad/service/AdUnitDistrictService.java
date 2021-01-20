package com.cx.ad.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cx.ad.entity.unit_condition.AdUnitDistrict;
import java.util.List;

/**
 * 推广单元地域 Feature(AdUnitDistrict)表服务接口
 *
 * @author makejava
 * @since 2021-01-20 15:41:53
 */
public interface AdUnitDistrictService extends IService<AdUnitDistrict> {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    AdUnitDistrict queryById(Integer id);


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