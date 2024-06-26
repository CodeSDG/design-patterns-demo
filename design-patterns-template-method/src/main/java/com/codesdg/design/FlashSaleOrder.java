package com.codesdg.design;

/**
 * @author shandeguo
 * @version V1.0
 * @date 2024/6/26 下午9:02
 * @description
 * @Copyright
 */
public class FlashSaleOrder extends OrderProcessingTemplate{
    @Override
    protected void checkStock() {
        System.out.println("Checking stock for flash sale, considering high demand...");
    }

    @Override
    protected void calculateTotalPrice() {
        System.out.println("Calculating total price for flash sale with discounts...");
    }

    @Override
    protected void notifyCustomer() {
        System.out.println("Sending SMS and push notification for flash sale order...");
    }
}
