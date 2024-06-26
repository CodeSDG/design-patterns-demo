package com.codesdg.design.demo2;

/**
 * @author shandeguo
 * @version V1.0
 * @date 2024/6/26 下午4:54
 * @description
 * @Copyright
 */
public class PhoneProduct implements IProduct{
    /**
     * 产品类型的公共方法
     *
     * @return 获取产品信息
     */
    @Override
    public String getInformation() {
        return "华为手机，遥遥领先！";
    }
}
