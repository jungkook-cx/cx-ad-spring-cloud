package com.cx.ad.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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
public class AdUnitDistrictServiceImpl extends ServiceImpl<AdUnitDistrictMapper,AdUnitDistrict> implements AdUnitDistrictService {
    @Resource
    private AdUnitDistrictMapper adUnitDistrictMapper;

    @Override
    public AdUnitDistrict queryById(Integer id) {
        return null;
    }

    @Override
    public AdUnitDistrict insert(AdUnitDistrict adUnitDistrict) {
        return null;
    }

    @Override
    public AdUnitDistrict update(AdUnitDistrict adUnitDistrict) {
        return null;
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