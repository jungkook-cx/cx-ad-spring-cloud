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
 * 推广单元关键词 Feature(AdUnitKeyword)实体类
 *
 * @author makejava
 * @since 2021-01-20 15:36:41
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "ad_unit_keyword")
public class AdUnitKeyword implements Serializable {
    private static final long serialVersionUID = -66844402727543822L;

    @TableId(value = "id",type = IdType.AUTO)
    @NotNull
    private Long id;
    /**
    * 推广单元 id
    */
    @NotNull
    @TableField(value = "unit_id")
    private Long unitId;
    /**
    * 关键词
    */
    @NotNull
    @TableField(value = "keyword")
    private String keyword;

    public AdUnitKeyword(Long unitId,String keyword){
        this.unitId=unitId;
        this.keyword=keyword;
    }


}