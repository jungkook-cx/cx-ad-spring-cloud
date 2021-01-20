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
import java.io.Serializable;

/**
 * 推广计划表(AdPlan)实体类
 *
 * @author makejava
 * @since 2021-01-20 15:07:47
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "ad_user")
public class AdPlan implements Serializable {
    private static final long serialVersionUID = -86335554774125555L;
    /**
    * 自增主键
    */
    @TableId(value = "id",type = IdType.AUTO)
    @NotNull
    private Long id;

    /**
    * 标记当前记录所属用户
    */
    @TableField(value = "user_id",exist = true)
    @NotNull
    private Long userId;

    /**
    * 推广计划名称
    */
    @NotNull
    @TableField(value = "plan_name",exist = true)
    private String planName;

    /**
    * 推广计划状态
    */
    @NotNull
    @TableField(value = "plan_status",exist = true)
    private Integer planStatus;

    /**
    * 推广计划开始时间；
    */
    @NotNull
    @TableField(value = "start_date",exist = true)
    private Date startDate;

    /**
    * 推广计划结束时间；
    */
    @NotNull
    @TableField(value = "end_date",exist = true)
    private Date endDate;

    /**
    * 创建时间
    */
    @NotNull
    @TableField(value = "create_date",exist = true)
    private Date createTime;

    /**
    * 更新时间
    */
    @NotNull
    @TableField(value = "update_date",exist = true)
    private Date updateTime;


    public AdPlan(Long userId,String planName,Date startDate,Date endDate){
            this.userId=userId;
            this.planName=planName;
            this.planStatus= CommonStatus.VALID.getStatus();
            this.createTime=new Date();
            this.startDate=startDate;
            this.endDate=endDate;
            this.updateTime=this.createTime;
    }
}