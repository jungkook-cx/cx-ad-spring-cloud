package com.cx.ad.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.util.StringUtils;

import java.io.Serializable;

/**
 *
 * @author xi.chen
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdUnitRequest implements Serializable {

    private static final long serialVersionUID = 1159129403660051249L;
    private Long planId;
    private String unitName;

    private Integer positionType;
    private Long budget;

    public boolean createValidate() {

        return null != planId && !StringUtils.isEmpty(unitName)
                && positionType != null && budget != null;
    }
}
