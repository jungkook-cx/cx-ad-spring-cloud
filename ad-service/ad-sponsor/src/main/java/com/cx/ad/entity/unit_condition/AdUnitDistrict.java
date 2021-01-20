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
 * 推广单元地域 Feature(AdUnitDistrict)实体类
 *
 * @author makejava
 * @since 2021-01-20 15:41:53
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "ad_unit_district")
public class AdUnitDistrict implements Serializable {
    private static final long serialVersionUID = -56822710212471772L;

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
    * 省
    */
    @TableField(value = "province")
    @NotNull
    private String province;
    /**
    * 市
    */
    @TableField(value = "city")
    @NotNull
    private String city;


    public AdUnitDistrict(Long unitId,String province,String city){
        this.unitId=unitId;
        this.city=city;
        this.province=province;
    }

}