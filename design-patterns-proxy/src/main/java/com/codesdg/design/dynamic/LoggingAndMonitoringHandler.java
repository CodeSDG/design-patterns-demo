package com.codesdg.design.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.UndeclaredThrowableException;

/**
 * @author shandeguo
 * @version V1.0
 * @date 2024/6/26 下午10:18
 * @description
 * @Copyright
 */
public class LoggingAndMonitoringHandler<T> implements InvocationHandler {

    private final T target;

    public LoggingAndMonitoringHandler(T target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long start = System.currentTimeMillis();
        System.out.println("Logging: Calling " + method.getName());
        Object result = method.invoke(target, args);
        long end = System.currentTimeMillis();
        System.out.println("Monitoring: Method " + method.getName() + " took " + (end - start) + "ms");
        return result;
    }
}
