package com.codesdg.design;

/**
 * @author shandeguo
 * @version V1.0
 * @date 2024/6/26 下午6:12
 * @description 打折策略
 * @Copyright
 */
public class DiscountStrategy implements IDiscountStrategy{
    /**
     * 计算优惠价格
     *
     * @param originalPrice 原价
     * @return 折扣后价格
     */
    @Override
    public double calculateDiscount(double originalPrice) {
        // 打八折
        return originalPrice * 0.8;
    }
}
