package com.cx.ad.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cx.ad.entity.AdPlan;
import com.cx.ad.dao.AdPlanMapper;
import com.cx.ad.service.AdPlanService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 推广计划表(AdPlan)表服务实现类
 *
 * @author makejava
 * @since 2021-01-20 15:07:52
 */
@Service("adPlanService")
public class AdPlanServiceImpl extends ServiceImpl<AdPlanMapper,AdPlan> implements AdPlanService {
    @Resource
    private AdPlanMapper adPlanMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public AdPlan queryById(Long id) {
        return this.adPlanMapper.selectById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<AdPlan> queryAllByLimit(int offset, int limit) {
        return this.adPlanMapper.selectList(null);
    }

    /**
     * 新增数据
     *
     * @param adPlan 实例对象
     * @return 实例对象
     */
    @Override
    public AdPlan insert(AdPlan adPlan) {
        this.adPlanMapper.insert(adPlan);
        return adPlan;
    }

    /**
     * 修改数据
     *
     * @param adPlan 实例对象
     * @return 实例对象
     */
    @Override
    public AdPlan update(AdPlan adPlan) {
        this.adPlanMapper.updateById(adPlan);
        return this.queryById(adPlan.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.adPlanMapper.deleteById(id) > 0;
    }
}