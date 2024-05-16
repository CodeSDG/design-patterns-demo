package com.codesdg.design;

/**
 * @author shandeguo
 * @version V1.0
 * @date 2024/5/16 下午2:37
 * @description 懒汉模式  线程不安全
 * @Copyright
 */
public class Singleton2 {

    /**
     *  todo 懒汉模式  线程不安全
     */
    private static Singleton2 instance;

    private Singleton2(){}

    public static Singleton2 getInstance()
    {
        if(null != instance) {
            return instance;
        }
        instance = new Singleton2();
        return instance;
    }

}
