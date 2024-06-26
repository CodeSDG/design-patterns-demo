package com.codesdg.design;

/**
 * @author shandeguo
 * @version V1.0
 * @date 2024/6/26 下午6:14
 * @description 订单上下文
 * @Copyright
 */
public class OrderContext {

    private IDiscountStrategy strategy;

    public OrderContext(IDiscountStrategy strategy)
    {
        this.strategy = strategy;
    }

    public double calculateDiscount(double price)
    {
        return strategy.calculateDiscount(price);
    }
}
