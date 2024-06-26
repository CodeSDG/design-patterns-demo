package com.codesdg.design.demo2;

/**
 * @author shandeguo
 * @version V1.0
 * @date 2024/6/26 下午4:56
 * @description
 * @Copyright
 */
public class PhoneFactory implements IFactory<PhoneProduct>{
    /**
     * 获取具体产品实例
     *
     * @return 返场创建的实例对象
     */
    @Override
    public PhoneProduct product() {
        return new PhoneProduct();
    }
}
