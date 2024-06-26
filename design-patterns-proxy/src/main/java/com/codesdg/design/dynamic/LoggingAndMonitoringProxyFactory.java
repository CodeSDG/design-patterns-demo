package com.codesdg.design.dynamic;

import java.lang.reflect.Proxy;

/**
 * @author shandeguo
 * @version V1.0
 * @date 2024/6/26 下午9:53
 * @description
 * @Copyright
 */
public class LoggingAndMonitoringProxyFactory {

    public static <T> T createProxy(T target, Class<T> clazz) {
        return (T) Proxy.newProxyInstance(
                clazz.getClassLoader(),
                new Class<?>[]{clazz},
                new LoggingAndMonitoringHandler<>(target)
        );
    }
}
