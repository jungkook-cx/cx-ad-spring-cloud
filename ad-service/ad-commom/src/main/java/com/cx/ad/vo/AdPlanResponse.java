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
public class AdPlanResponse implements Serializable {

    private static final long serialVersionUID = 5664110598399013173L;
    private Long id;
    private String planName;
}
