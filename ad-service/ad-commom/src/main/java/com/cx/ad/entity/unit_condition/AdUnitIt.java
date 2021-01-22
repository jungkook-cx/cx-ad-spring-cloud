package com.cx.ad.entity.unit_condition;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * 推广单元兴趣 Feature(AdUnitIt)实体类
 *
 * @author makejava
 * @since 2021-01-20 15:42:05
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "ad_unit_it")
public class AdUnitIt implements Serializable {
    private static final long serialVersionUID = 610194899977813266L;

    @TableId(value = "id",type = IdType.AUTO)
    @NotNull
    private Long id;
    /**
    * 推广单元 id
    */
    @TableField(value = "unit_id")
    @NotNull
    private Long unitId;
    /**
    * 兴趣标签
    */
    @NotNull
    @TableField(value = "it_tag")
    private String itTag;

    public AdUnitIt(Long unitId,String itTag){
        this.unitId=unitId;
        this.itTag=itTag;
    }
}