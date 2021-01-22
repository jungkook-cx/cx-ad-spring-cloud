package com.cx.ad;

import com.cx.ad.entity.AdPlan;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @description:
 * @author: ChenXi
 * @time: 2021/1/19 17:06
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class R<T> implements Serializable {

    private static final long serialVersionUID = 3029617628022567229L;

    private Integer code;
    private String message;

    private T data;

    public R(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public R(T data) {
    this.data=data;
    }
}
