package com.codesdg.design.patterns;

import com.codesdg.design.common.PayMethodEnum;
import com.codesdg.design.service.*;

import java.util.Objects;

/**
 * @author shandeguo
 * @version V1.0
 * @date 2024/6/3 下午6:43
 * @description
 * @Copyright
 */
public class PaymentFactory {

    public static PaymentService getPaymentService(PayMethodEnum payMethodEnum) {
        return switch (payMethodEnum) {
            case ALI_PAY -> new AliPaymentServiceAbstractImpl();
            case WECHAT_PAY -> new WxPaymentServiceAbstractImpl();
            case UNION_PAY -> new UnionPaymentServiceAbstractImpl();
            case JD_PAY -> new JdPaymentServiceAbstractImpl();
        };
    }
}
