package com.cx.ad.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 *
 * @author xi.chen
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdUnitResponse implements Serializable {

    private static final long serialVersionUID = 1605100188360886395L;
    private Long id;
    private String unitName;
}
