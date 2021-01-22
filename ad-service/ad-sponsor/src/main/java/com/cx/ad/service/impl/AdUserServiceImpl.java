package com.cx.ad.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cx.ad.constant.Constants;
import com.cx.ad.dao.AdUserMapper;
import com.cx.ad.entity.AdUser;
import com.cx.ad.exception.AdException;
import com.cx.ad.service.AdUserService;
import com.cx.ad.utils.CommonUtils;
import com.cx.ad.vo.CreateUserRequest;
import com.cx.ad.vo.CreateUserResponse;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Objects;

/**
 * @description:
 * @author: ChenXi
 * @time: 2021/1/20 17:41
 */
@Slf4j
@AllArgsConstructor
@Service
public class AdUserServiceImpl extends ServiceImpl<AdUserMapper, AdUser> implements AdUserService{

    private AdUserMapper adUserMapper;


    /**
     *
     * @param request
     * @return
     * @throws AdException
     */
    @Override
    @Transactional
    public CreateUserResponse createUser(CreateUserRequest request) throws AdException {
        if(!request.validate()){
            throw new AdException(Constants.ErrorMsg.REQUEST_PARAM_ERROR);
        }
        AdUser oldUser = adUserMapper.findByUsername(request.getUsername());
            if (!Objects.isNull(oldUser)){
                throw new AdException(Constants.ErrorMsg.SAME_NAME_ERROR);
            }
         AdUser user=new AdUser(request.getUsername(),CommonUtils.md5(request.getUsername()));
        int count = adUserMapper.insert(user);
        if (count<1){
            throw new AdException("创建失败");
        }
        return  new CreateUserResponse(user.getId(),user.getUsername(),user.getToken(),user.getCreateTime(),user.getUpdateTime()) ;
    }



}
