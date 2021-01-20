package com.cx.ad.service.impl;

import com.cx.ad.entity.AdUnit;
import com.cx.ad.dao.AdUnitMapper;
import com.cx.ad.service.AdUnitService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 推广单元表(AdUnit)表服务实现类
 *
 * @author makejava
 * @since 2021-01-20 15:23:42
 */
@Service("adUnitService")
public class AdUnitServiceImpl implements AdUnitService {
    @Resource
    private AdUnitMapper adUnitMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public AdUnit queryById(Long id) {
        return this.adUnitMapper.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<AdUnit> queryAllByLimit(int offset, int limit) {
        return this.adUnitMapper.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param adUnit 实例对象
     * @return 实例对象
     */
    @Override
    public AdUnit insert(AdUnit adUnit) {
        this.adUnitMapper.insert(adUnit);
        return adUnit;
    }

    /**
     * 修改数据
     *
     * @param adUnit 实例对象
     * @return 实例对象
     */
    @Override
    public AdUnit update(AdUnit adUnit) {
        this.adUnitMapper.update(adUnit);
        return this.queryById(adUnit.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.adUnitMapper.deleteById(id) > 0;
    }
}