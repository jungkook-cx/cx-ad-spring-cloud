package com.cx.ad.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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
public class AdUnitServiceImpl extends ServiceImpl<AdUnitMapper,AdUnit> implements AdUnitService {
    @Resource
    private AdUnitMapper adUnitMapper;


    @Override
    public AdUnit queryById(Long id) {
        return null;
    }

    @Override
    public List<AdUnit> queryAllByLimit(int offset, int limit) {
        return null;
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

    @Override
    public AdUnit update(AdUnit adUnit) {
        return null;
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