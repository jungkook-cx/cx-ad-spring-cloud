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
public class CreativeResponse implements Serializable {

    private static final long serialVersionUID = -2409455664824544428L;
    private Long id;
    private String name;
}
