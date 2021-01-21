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

}