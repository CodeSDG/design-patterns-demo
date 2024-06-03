package com.codesdg.design.service;


import com.codesdg.design.patterns.PaymentServiceAbstract;

/**
 * @author shandeguo
 * @version V1.0
 * @date 2024/6/3 下午6:39
 * @description
 * @Copyright
 */
public class AliPaymentServiceAbstractImpl extends PaymentServiceAbstract {
    /**
     * 真实支付
     *
     */
    @Override
    public void realPay() {
        System.out.println("支付宝支付中，请等待............");
    }
}
