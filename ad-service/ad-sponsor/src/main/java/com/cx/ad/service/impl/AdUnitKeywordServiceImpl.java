package com.cx.ad.service.impl;

import com.cx.ad.entity.unit_condition.AdUnitKeyword;
import com.cx.ad.dao.unit_condition.AdUnitKeywordMapper;
import com.cx.ad.service.AdUnitKeywordService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 推广单元关键词 Feature(AdUnitKeyword)表服务实现类
 *
 * @author makejava
 * @since 2021-01-20 15:36:41
 */
@Service("adUnitKeywordService")
public class AdUnitKeywordServiceImpl implements AdUnitKeywordService {
    @Resource
    private AdUnitKeywordMapper adUnitKeywordMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public AdUnitKeyword queryById(Integer id) {
        return this.adUnitKeywordMapper.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<AdUnitKeyword> queryAllByLimit(int offset, int limit) {
        return this.adUnitKeywordMapper.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param adUnitKeyword 实例对象
     * @return 实例对象
     */
    @Override
    public AdUnitKeyword insert(AdUnitKeyword adUnitKeyword) {
        this.adUnitKeywordMapper.insert(adUnitKeyword);
        return adUnitKeyword;
    }

    /**
     * 修改数据
     *
     * @param adUnitKeyword 实例对象
     * @return 实例对象
     */
    @Override
    public AdUnitKeyword update(AdUnitKeyword adUnitKeyword) {
        this.adUnitKeywordMapper.update(adUnitKeyword);
        return this.queryById(adUnitKeyword.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.adUnitKeywordMapper.deleteById(id) > 0;
    }
}