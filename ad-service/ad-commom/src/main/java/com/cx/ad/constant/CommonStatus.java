package com.cx.ad.constant;

import lombok.Getter;

/**
 * @author xi.chen
 */

@Getter
public enum CommonStatus {

    VALID(1, "有效状态"),
    INVALID(0, "无效状态");

    private Integer status;
    private String desc;

    CommonStatus(Integer status, String desc) {
        this.desc = desc;
        this.status = status;
    }
}
