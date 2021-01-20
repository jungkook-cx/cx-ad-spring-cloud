package com.cx.ad.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cx.ad.entity.unit_condition.AdUnitIt;
import java.util.List;

/**
 * 推广单元兴趣 Feature(AdUnitIt)表服务接口
 *
 * @author makejava
 * @since 2021-01-20 15:42:06
 */
public interface AdUnitItService extends IService<AdUnitIt> {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    AdUnitIt queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<AdUnitIt> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param adUnitIt 实例对象
     * @return 实例对象
     */
    AdUnitIt insert(AdUnitIt adUnitIt);

    /**
     * 修改数据
     *
     * @param adUnitIt 实例对象
     * @return 实例对象
     */
    AdUnitIt update(AdUnitIt adUnitIt);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}