package com.cx.ad.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cx.ad.entity.AdUser;

/**
 * @description:
 * @author: ChenXi
 * @time: 2021/1/20 16:55
 */
public interface AdUserMapper extends BaseMapper<AdUser> {
    /**
     * 根据用户名查找
     * @param username
     * @return
     */
    AdUser findByUsername(String username);
}
