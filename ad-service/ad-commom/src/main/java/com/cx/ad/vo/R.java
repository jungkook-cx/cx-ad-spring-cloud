package com.cx.ad.vo;

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
    private Integer code;
    private String message;

    private T data;

    public R<T> R(Integer code,String message){
        this.code=code;
        this.message=message;
        return this;
    }
}
