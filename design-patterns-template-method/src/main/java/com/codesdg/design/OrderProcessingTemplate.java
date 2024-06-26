package com.codesdg.design;

/**
 * @author shandeguo
 * @version V1.0
 * @date 2024/6/26 下午9:00
 * @description
 * @Copyright
 */
public abstract class OrderProcessingTemplate {

    public final void processOrder() {
        checkStock();
        calculateTotalPrice();
        handlePayment();
        shipGoods();
        notifyCustomer();
    }
    protected abstract void checkStock(); // 子类实现库存验证

    protected abstract void calculateTotalPrice(); // 子类实现价格计算

    private void handlePayment() {
        System.out.println("Handling payment...");
    }

    private void shipGoods() {
        System.out.println("Shipping goods...");
    }

    protected abstract void notifyCustomer(); // 子类实现用户通知

}
