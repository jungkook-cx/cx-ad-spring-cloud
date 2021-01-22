package com.cx.ad.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author xi.chen
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdUnitDistrictResponse implements Serializable {

    private static final long serialVersionUID = 5572495951501684698L;

    private List<Long> ids;
}
