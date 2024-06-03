package com.codesdg.design.common;

import lombok.Getter;

/**
 * @author shandeguo
 * @version V1.0
 * @date 2024/6/3 下午6:19
 * @description
 * @Copyright
 */

@Getter
public enum PayMethodEnum {
    /**
     * 支付
     */
    ALI_PAY("支付宝", "ALI_PAY"),
    WECHAT_PAY("微信", "WECHAT_PAY"),
    UNION_PAY("银联", "UNION_PAY"),
    JD_PAY("京东", "JD_PAY"),
    ;

    /**
     * 名称
     */
    private final String name;

    /**
     * 支付代码
     */
    private final String code;

    PayMethodEnum(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public static PayMethodEnum getPayEnum(String code) {
        for (PayMethodEnum payMethodEnum : PayMethodEnum.values()) {
            if (payMethodEnum.getCode().equals(code)) {
                return payMethodEnum;
            }
        }
        return null;
    }


}
