package com.cx.ad.service.impl;

import com.cx.ad.entity.unit_condition.AdUnitDistrict;
import com.cx.ad.dao.unit_condition.AdUnitDistrictMapper;
import com.cx.ad.service.AdUnitDistrictService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 推广单元地域 Feature(AdUnitDistrict)表服务实现类
 *
 * @author makejava
 * @since 2021-01-20 15:41:53
 */
@Service("adUnitDistrictService")
public class AdUnitDistrictServiceImpl implements AdUnitDistrictService {
    @Resource
    private AdUnitDistrictMapper adUnitDistrictMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public AdUnitDistrict queryById(Integer id) {
        return this.adUnitDistrictMapper.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<AdUnitDistrict> queryAllByLimit(int offset, int limit) {
        return this.adUnitDistrictMapper.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param adUnitDistrict 实例对象
     * @return 实例对象
     */
    @Override
    public AdUnitDistrict insert(AdUnitDistrict adUnitDistrict) {
        this.adUnitDistrictMapper.insert(adUnitDistrict);
        return adUnitDistrict;
    }

    /**
     * 修改数据
     *
     * @param adUnitDistrict 实例对象
     * @return 实例对象
     */
    @Override
    public AdUnitDistrict update(AdUnitDistrict adUnitDistrict) {
        this.adUnitDistrictMapper.update(adUnitDistrict);
        return this.queryById(adUnitDistrict.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.adUnitDistrictMapper.deleteById(id) > 0;
    }
}