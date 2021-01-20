package com.cx.ad.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cx.ad.entity.unit_condition.AdUnitKeyword;
import java.util.List;

/**
 * 推广单元关键词 Feature(AdUnitKeyword)表服务接口
 *
 * @author makejava
 * @since 2021-01-20 15:36:41
 */
public interface AdUnitKeywordService extends IService<AdUnitKeyword> {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    AdUnitKeyword queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<AdUnitKeyword> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param adUnitKeyword 实例对象
     * @return 实例对象
     */
    AdUnitKeyword insert(AdUnitKeyword adUnitKeyword);

    /**
     * 修改数据
     *
     * @param adUnitKeyword 实例对象
     * @return 实例对象
     */
    AdUnitKeyword update(AdUnitKeyword adUnitKeyword);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}