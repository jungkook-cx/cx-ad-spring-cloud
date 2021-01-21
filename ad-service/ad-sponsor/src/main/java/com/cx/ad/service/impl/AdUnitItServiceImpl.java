package com.cx.ad.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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
public class AdUnitItServiceImpl extends ServiceImpl<AdUnitItMapper,AdUnitIt> implements AdUnitItService {

}