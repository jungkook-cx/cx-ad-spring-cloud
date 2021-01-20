package com.cx.ad.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.cx.ad.constant.CommonStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * @description:
 * @author: ChenXi
 * @time: 2021/1/20 13:51
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("ad_user")
public class AdUser {

    @TableId(value = "id",type = IdType.AUTO)
    @NotNull
    private Long id;

    @TableField(value = "username",exist = true)
    @NotNull
    private String username;

    @TableField(value = "token",exist = true)
    @NotNull
    private String token;

    @TableField(value = "user_status",exist = true)
    @NotNull
    private Integer userStatus;

    @TableField(value = "create_time",exist = true)
    @NotNull
    private Date createTime;

    @NotNull
    @TableField(value = "update_time",exist = true)
    private Date updateTime;

    public AdUser(String username,String token){
        this.username=username;
        this.token=token;
        this.userStatus= CommonStatus.VALID.getStatus();
        this.createTime=new Date();
        this.updateTime=this.createTime;
    }
}
