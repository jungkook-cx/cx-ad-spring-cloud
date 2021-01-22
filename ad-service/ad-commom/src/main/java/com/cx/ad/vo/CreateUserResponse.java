package com.cx.ad.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Qinyi.
 * @author xi.chen
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateUserResponse implements Serializable {

    private static final long serialVersionUID = -4307028986912277237L;
    private Long userId;
    private String username;
    private String token;
    private Date createTime;
    private Date updateTime;
}
