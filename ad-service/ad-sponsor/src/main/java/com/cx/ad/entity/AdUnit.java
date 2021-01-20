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
 * 推广单元表(AdUnit)实体类
 *
 * @author makejava
 * @since 2021-01-20 15:23:41
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "ad_unit")
public class AdUnit implements Serializable {
    private static final long serialVersionUID = -66540251718850536L;
    /**
    * 自增主键
    */
    @TableId(value = "id",type = IdType.AUTO)
    @NotNull
    private Long id;
    /**
    * 关联推广计划 id
    */
    @TableField(value = "plan_id")
    @NotNull
    private Long planId;
    /**
    * 推广单元名称
    */
    @TableField(value = "unit_name")
    @NotNull
    private String unitName;
    /**
    * 推广单元状态
    */
    @TableField(value = "unit_status")
    @NotNull
    private Integer unitStatus;
    /**
    * 广告位类型(开屏, 贴片, 中贴, 暂停帖, 后贴)
    */
    @TableField(value = "unit_status")
    @NotNull
    private Integer positionType;
    /**
    * 预算
    */
    @TableField(value = "budget")
    @NotNull
    private Long budget;
    /**
    * 创建时间
    */
    @TableField(value = "create_time")
    @NotNull
    private Date createTime;
    /**
    * 更新时间
    */
    @TableField(value = "update_time")
    @NotNull
    private Date updateTime;

    public AdUnit(Long planId,String unitName,Integer positionType,Long budget){
        this.planId=planId;
        this.unitName=unitName;
        this.unitStatus= CommonStatus.VALID.getStatus();
        this.positionType=positionType;
        this.budget=budget;
        this.createTime=new Date();
        this.updateTime=this.createTime;
    }

}