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
public class AdUnitItResponse implements Serializable {

    private static final long serialVersionUID = 4303465166117552747L;
    private List<Long> ids;
}
