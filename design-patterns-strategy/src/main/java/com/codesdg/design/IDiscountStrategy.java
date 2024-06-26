package com.codesdg.design;

/**
 * @author shandeguo
 * @version V1.0
 * @date 2024/6/26 下午6:07
 * @description 优惠策略接口
 * @Copyright
 */
public interface IDiscountStrategy {

    /**
     * 计算优惠价格
     * @param originalPrice 原价
     * @return 折扣后价格
     */
    double calculateDiscount(double originalPrice);
}
