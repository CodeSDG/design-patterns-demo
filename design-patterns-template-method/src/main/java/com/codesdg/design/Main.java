package com.codesdg.design;

/**
 * @author shandeguo
 * @version V1.0
 * @date 2024/6/26 下午8:49
 * @description
 * @Copyright
 */
public class Main {
    public static void main(String[] args) {
        OrderProcessingTemplate regyularOrder = new RegularOrder();
        regyularOrder.processOrder();
        System.out.println("------------------------");
        OrderProcessingTemplate flashSaleOrder = new FlashSaleOrder();
        flashSaleOrder.processOrder();
    }
}