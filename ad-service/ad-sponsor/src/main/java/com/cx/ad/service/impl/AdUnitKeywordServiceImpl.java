package com.cx.ad.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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
public class AdUnitKeywordServiceImpl extends ServiceImpl<AdUnitKeywordMapper
        ,AdUnitKeyword> implements AdUnitKeywordService {
    @Resource
    private AdUnitKeywordMapper adUnitKeywordMapper;


    @Override
    public AdUnitKeyword queryById(Integer id) {
        return null;
    }

    @Override
    public List<AdUnitKeyword> queryAllByLimit(int offset, int limit) {
        return null;
    }

    @Override
    public AdUnitKeyword insert(AdUnitKeyword adUnitKeyword) {
        return null;
    }

    @Override
    public AdUnitKeyword update(AdUnitKeyword adUnitKeyword) {
        return null;
    }

    @Override
    public boolean deleteById(Integer id) {
        return false;
    }
}