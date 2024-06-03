package com.codesdg.design.service;


import com.codesdg.design.patterns.PaymentServiceAbstract;

/**
 * @author shandeguo
 * @version V1.0
 * @date 2024/6/3 下午6:37
 * @description
 * @Copyright
 */
public class WxPaymentServiceAbstractImpl extends PaymentServiceAbstract {
    /**
     * 真实支付
     */
    @Override
    public void realPay() {
        System.out.println("微信支付中，请等待.................");
    }
}
