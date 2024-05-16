package com.codesdg.design;

/**
 * @author shandeguo
 * @version V1.0
 * @date 2024/5/16 下午2:37
 * @description 饿汉式 单例模式  线程安全
 * @Copyright
 */
public class Singleton1 {

    private static final Singleton1 SINGLETON = new Singleton1();

    private Singleton1()
    {
    }

    public static Singleton1 getInstance()
    {
        return SINGLETON;
    }
}
