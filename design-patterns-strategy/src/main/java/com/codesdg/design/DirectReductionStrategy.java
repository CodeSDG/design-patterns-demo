package com.codesdg.design;

/**
 * @author shandeguo
 * @version V1.0
 * @date 2024/6/26 下午6:08
 * @description 直减优惠策略
 * @Copyright
 */
public class DirectReductionStrategy implements IDiscountStrategy{
    /**
     * 计算优惠价格
     *
     * @param originalPrice 原价
     * @return 折扣后价格
     */
    @Override
    public double calculateDiscount(double originalPrice) {
        // 直减优惠 假设直减10元
        return originalPrice - 10;
    }
}
