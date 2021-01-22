package com.cx.ad.controller;

import com.cx.ad.constant.Constants;
import com.cx.ad.exception.AdException;
import com.cx.ad.service.AdUserService;
import com.cx.ad.vo.CreateUserRequest;
import com.cx.ad.vo.CreateUserResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Objects;

/**
 * @description:
 * @author: ChenXi
 * @time: 2021/1/21 10:05
 */
@RestController
@Api("用户管理接口")
@RequestMapping("/user")
public class AdUserController {
    @Resource
    private AdUserService adUserService;

    @ApiOperation("新增用户")
    @PostMapping("/create")
    public CreateUserResponse createUser(@RequestParam("username") CreateUserRequest username) throws AdException {
        if (Objects.isNull(username)){
            throw new AdException(Constants.ErrorMsg.REQUEST_PARAM_ERROR);
        }
        CreateUserResponse user = adUserService.createUser(username);
        return user;
    }
}
