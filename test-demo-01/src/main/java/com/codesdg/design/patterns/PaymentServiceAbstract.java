package com.codesdg.design.patterns;

import com.codesdg.design.service.PaymentService;

/**
 * @author shandeguo
 * @version V1.0
 * @date 2024/6/3 下午6:26
 * @description
 * @Copyright
 */
public abstract class PaymentServiceAbstract implements PaymentService {

    /**
     * 支付方法
     *
     */
    @Override
    public void pay() {
        parameterValidation();
        realPay();
        paymentNotify();
    }

    /**
     * 真实支付
     */
    public abstract void realPay();


    public void parameterValidation() {
        System.out.println("参数校验完成，等待支付");
    }

    public void paymentNotify() {
        System.out.println("支付成功，下发通知");
    }


}
