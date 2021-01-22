package com.cx.ad.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.util.Date;
import java.io.Serializable;

/**
 * 创意表(AdCreative)实体类
 *
 * @author makejava
 * @since 2021-01-20 15:55:13
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "ad_creative")
public class AdCreative implements Serializable {
    private static final long serialVersionUID = 372253963453770960L;
    /**
    * 自增主键
    */
    @TableId(value = "id",type = IdType.AUTO)
    @NotNull
    private Long id;
    /**
    * 创意名称
    */
    @TableField(value = "name")
    @NotNull
    private String name;
    /**
    * 物料类型(图片, 视频)
    */
    @TableField(value = "type")
    @NotNull
    private Integer type;
    /**
    * 物料子类型(图片: bmp, jpg 等等)
    */
    @TableField(value = "material_type")
    @NotNull
    private Integer materialType;
    /**
    * 高度
    */
    @TableField(value = "height")
    @NotNull
    private Integer height;
    /**
    * 宽度
    */
    @TableField(value = "width")
    @NotNull
    private Integer width;
    /**
    * 物料大小, 单位是 KB
    */
    @TableField(value = "size")
    @NotNull
    private Long size;
    /**
    * 持续时长, 只有视频才不为 0
    */
    @TableField(value = "duration")
    private Integer duration;
    /**
    * 审核状态
    */
    @TableField(value = "audit_status")
    @NotNull
    private Integer auditStatus;
    /**
    * 标记当前记录所属用户
    */
    @TableField(value = "user_id")
    @NotNull
    private Long userId;
    /**
    * 物料地址
    */
    @TableField(value = "url")
    @NotNull
    private String url;
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


}