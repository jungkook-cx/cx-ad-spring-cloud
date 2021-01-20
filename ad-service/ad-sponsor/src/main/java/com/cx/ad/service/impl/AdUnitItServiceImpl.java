package com.cx.ad.service.impl;

import com.cx.ad.entity.unit_condition.AdUnitIt;
import com.cx.ad.dao.unit_condition.AdUnitItMapper;
import com.cx.ad.service.AdUnitItService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 推广单元兴趣 Feature(AdUnitIt)表服务实现类
 *
 * @author makejava
 * @since 2021-01-20 15:42:06
 */
@Service("adUnitItService")
public class AdUnitItServiceImpl implements AdUnitItService {
    @Resource
    private AdUnitItMapper adUnitItMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public AdUnitIt queryById(Integer id) {
        return this.adUnitItMapper.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<AdUnitIt> queryAllByLimit(int offset, int limit) {
        return this.adUnitItMapper.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param adUnitIt 实例对象
     * @return 实例对象
     */
    @Override
    public AdUnitIt insert(AdUnitIt adUnitIt) {
        this.adUnitItMapper.insert(adUnitIt);
        return adUnitIt;
    }

    /**
     * 修改数据
     *
     * @param adUnitIt 实例对象
     * @return 实例对象
     */
    @Override
    public AdUnitIt update(AdUnitIt adUnitIt) {
        this.adUnitItMapper.update(adUnitIt);
        return this.queryById(adUnitIt.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.adUnitItMapper.deleteById(id) > 0;
    }
}