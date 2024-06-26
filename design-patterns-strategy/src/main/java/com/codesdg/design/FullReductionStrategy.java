package com.codesdg.design;

/**
 * @author shandeguo
 * @version V1.0
 * @date 2024/6/26 下午6:13
 * @description 满减策略
 * @Copyright
 */
public class FullReductionStrategy implements IDiscountStrategy{
    /**
     * 计算优惠价格
     *
     * @param originalPrice 原价
     * @return 折扣后价格
     */
    @Override
    public double calculateDiscount(double originalPrice) {
        // 满减
        double resultPrice = originalPrice >= 168 ? originalPrice - 50 : originalPrice;
        System.out.println("满168减50元，原价格：" + originalPrice + " 折扣后价格：" + resultPrice);
        return resultPrice;
    }
}
