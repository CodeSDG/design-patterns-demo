package com.codesdg.design;

/**
 * @author shandeguo
 * @version V1.0
 * @date 2024/6/26 下午9:02
 * @description
 * @Copyright
 */
public class RegularOrder extends OrderProcessingTemplate {
    @Override
    protected void checkStock() {
        System.out.println("Checking stock for regular order...");
    }

    @Override
    protected void calculateTotalPrice() {
        System.out.println("Calculating total price for regular order...");
    }

    @Override
    protected void notifyCustomer() {
        System.out.println("Sending email notification for regular order...");
    }
}
