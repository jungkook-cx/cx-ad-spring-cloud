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
 * 创意和推广单元关联表(CreativeUnit)实体类
 *
 * @author makejava
 * @since 2021-01-20 16:31:29
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "creative_unit")
public class CreativeUnit implements Serializable {
    private static final long serialVersionUID = 272854495359557843L;
    @TableId(value = "id",type = IdType.AUTO)
    @NotNull
    private Long id;
    /**
    * 创意 id
    */
    @TableField(value = "creative_id")
    @NotNull
    private Long creativeId;
    /**
    * 推广单元 id
    */
    @TableField(value = "unit_id")
    @NotNull
    private Long unitId;

    public CreativeUnit(Long creativeId,Long unitId){
        this.creativeId=creativeId;
        this.unitId=unitId;
    }
}