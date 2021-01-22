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
public class AdUnitKeywordResponse implements Serializable {

    private static final long serialVersionUID = 2430560570982806262L;
    private List<Long> id;
}
