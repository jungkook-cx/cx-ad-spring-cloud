package com.cx.ad.vo;

import io.micrometer.core.instrument.util.StringUtils;
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
public class CreateUserRequest implements Serializable {

    private static final long serialVersionUID = 1888345104259127901L;
    private String username;

    public boolean validate() {

        return !StringUtils.isEmpty(username);
    }
}
