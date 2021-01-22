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
public class CreativeUnitResponse implements Serializable {

    private static final long serialVersionUID = -3260814148931258780L;
    private List<Long> ids;
}
