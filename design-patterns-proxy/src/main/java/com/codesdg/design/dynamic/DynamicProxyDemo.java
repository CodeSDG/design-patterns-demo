package com.codesdg.design.dynamic;

/**
 * @author shandeguo
 * @version V1.0
 * @date 2024/6/26 下午10:19
 * @description
 * @Copyright
 */
public class DynamicProxyDemo {
    public static void main(String[] args) {
        BusinessLogic businessLogic = new BusinessLogicImpl();
        BusinessLogic proxy = LoggingAndMonitoringProxyFactory.createProxy(businessLogic, BusinessLogic.class);
        proxy.performTaskA();
        System.out.println(proxy.performTaskB("Sample Input"));
    }
}
