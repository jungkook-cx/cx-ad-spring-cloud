package com.cx.ad.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cx.ad.entity.AdUser;
import com.cx.ad.exception.AdException;
import com.cx.ad.vo.CreateUserRequest;
import com.cx.ad.vo.CreateUserResponse;

/**
 * @author xi.chen
 */
public interface AdUserService extends IService<AdUser> {
    /**
     * 创建用户
     * @param request
     * @return
     * @throws AdException
     */
    CreateUserResponse createUser(CreateUserRequest request) throws AdException;

    /**
     * 批量插入
     * @param request
     * @return
     */

}
