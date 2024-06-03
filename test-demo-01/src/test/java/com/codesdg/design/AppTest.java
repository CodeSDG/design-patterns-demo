package com.codesdg.design;

import com.codesdg.design.common.PayMethodEnum;
import com.codesdg.design.patterns.PaymentFactory;
import com.codesdg.design.service.PaymentService;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void test() {
        PaymentService paymentService = PaymentFactory.getPaymentService(PayMethodEnum.ALI_PAY);
        paymentService.pay();
    }
}