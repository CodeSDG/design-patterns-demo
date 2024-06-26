package com.codesdg.design.demo2;

/**
 * @author shandeguo
 * @version V1.0
 * @date 2024/6/26 下午4:58
 * @description
 * @Copyright
 */
public class TestMain {
    public static void main(String[] args) {
        // 创建工厂
        IFactory<PhoneProduct> phoneFactory = new PhoneFactory();
        //创建产品
        PhoneProduct phoneProduct = phoneFactory.product();
        System.out.println(phoneProduct.getInformation());

        // 创建工厂
        IFactory<ComputerProduct> computerFactory = new ComputerFactory();
        //创建产品
        ComputerProduct computerProduct = computerFactory.product();
        System.out.println(computerProduct.getInformation());

    }
}
