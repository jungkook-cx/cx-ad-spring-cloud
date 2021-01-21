package com.cx.ad.controller;

import com.cx.ad.constant.Constants;
import com.cx.ad.exception.AdException;
import com.cx.ad.service.AdUserService;
import com.cx.ad.vo.CreateUserRequest;
import com.cx.ad.vo.CreateUserResponse;
import com.cx.ad.vo.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
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
    @PutMapping("/create")
    public CreateUserResponse createUser(@RequestParam("username") CreateUserRequest username) throws AdException {
        if (Objects.isNull(username)){
            throw new AdException(Constants.ErrorMsg.REQUEST_PARAM_ERROR);
        }
        CreateUserResponse user = adUserService.createUser(username);
        return user;
    }

    @ApiOperation("批量增加")
    @PutMapping("/saveall")
    public R saveAll(@RequestBody  List<CreateUserRequest> list) throws AdException {
        int i = adUserService.saveAll(list);
        if (i>0){
            return new R(200,"插入成功");
        }else {
            throw new AdException("插入失败");
        }
    }
}
