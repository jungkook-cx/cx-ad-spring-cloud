package com.cx.ad.service;

import com.cx.ad.entity.AdUnit;
import java.util.List;

/**
 * 推广单元表(AdUnit)表服务接口
 *
 * @author makejava
 * @since 2021-01-20 15:23:42
 */
public interface AdUnitService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    AdUnit queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<AdUnit> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param adUnit 实例对象
     * @return 实例对象
     */
    AdUnit insert(AdUnit adUnit);

    /**
     * 修改数据
     *
     * @param adUnit 实例对象
     * @return 实例对象
     */
    AdUnit update(AdUnit adUnit);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}