package com.cx.ad.vo;


import com.cx.ad.constant.CommonStatus;
import com.cx.ad.entity.AdCreative;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author xi.chen
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreativeRequest implements Serializable {

    private static final long serialVersionUID = 1300778095533646851L;
    private String name;
    private Integer type;
    private Integer materialType;
    private Integer height;
    private Integer width;
    private Long size;
    private Integer duration;
    private Long userId;
    private String url;

    public AdCreative convertToEntity() {

        AdCreative creative = new AdCreative();
        creative.setName(name);
        creative.setType(type);
        creative.setMaterialType(materialType);
        creative.setHeight(height);
        creative.setWidth(width);
        creative.setSize(size);
        creative.setDuration(duration);
        creative.setAuditStatus(CommonStatus.VALID.getStatus());
        creative.setUserId(userId);
        creative.setUrl(url);
        creative.setCreateTime(new Date());
        creative.setUpdateTime(creative.getCreateTime());

        return creative;
    }
}
