package com.cx.ad.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cx.ad.entity.AdUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @description:
 * @author: ChenXi
 * @time: 2021/1/20 16:55
 */
@Mapper
public interface AdUserMapper extends BaseMapper<AdUser> {
    /**
     * 根据用户名查找
     * @param username
     * @return
     */
    AdUser findByUsername(@Param("username") String username);


}
