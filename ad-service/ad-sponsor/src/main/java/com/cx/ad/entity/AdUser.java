package com.cx.ad.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.cx.ad.constant.CommonStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

/**
 * @description:
 * @author: ChenXi
 * @time: 2021/1/20 13:51
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("用户实体类")
@TableName("ad_user")
public class AdUser implements Serializable {

    @TableId(value = "id",type = IdType.AUTO)
    @NotNull
    @ApiModelProperty("用户id")
    private Long id;

    @TableField(value = "username",exist = true)
    @ApiModelProperty("用户姓名")
    @NotNull
    private String username;

    @TableField(value = "token",exist = true)
    @ApiModelProperty("用户登录携带的token")
    @NotNull
    private String token;

    @TableField(value = "user_status",exist = true)
    @ApiModelProperty("用户状态")
    @NotNull
    private Integer userStatus;

    @TableField(value = "create_time",exist = true)
    @ApiModelProperty("用户创建时间")
    @NotNull
    private Date createTime;

    @NotNull
    @TableField(value = "update_time",exist = true)
    @ApiModelProperty("用户更新时间")
    private Date updateTime;

    public AdUser(String username,String token){
        this.username=username;
        this.token=token;
        this.userStatus= CommonStatus.VALID.getStatus();
        this.createTime=new Date();
        this.updateTime=this.createTime;
    }
}
