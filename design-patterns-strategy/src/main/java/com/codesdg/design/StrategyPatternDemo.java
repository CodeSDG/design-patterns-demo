package com.codesdg.design;

/**
 * @author shandeguo
 * @version V1.0
 * @date 2024/6/26 下午6:05
 * @description
 * @Copyright
 */
public class StrategyPatternDemo {
    public static void main(String[] args) {

        OrderContext context;

        context = new OrderContext(new FullReductionStrategy());
        System.out.println("满减后的价格:" + context.calculateDiscount(180));
        System.out.println("满减后的价格（未满足条件）:" + context.calculateDiscount(98));

        context = new OrderContext(new DirectReductionStrategy());
        System.out.println("直接减后的价格:" + context.calculateDiscount(180));

        context = new OrderContext(new DiscountStrategy());
        System.out.println("折扣后的价格:" + context.calculateDiscount(180));
    }
}