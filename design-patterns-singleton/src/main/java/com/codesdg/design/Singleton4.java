package com.codesdg.design;

import java.util.Objects;

/**
 * @author shandeguo
 * @version V1.0
 * @date 2024/5/16 下午3:26
 * @description
 * @Copyright
 */
public class Singleton4 {

    /**
     * 双层校验机制 加volatile禁止指令重排
     */
    private static volatile Singleton4 instance;

    private Singleton4() {
    }

    public static Singleton4 getInstance() {
        if (Objects.isNull(instance)) {
            synchronized (Singleton4.class) {
                if (Objects.isNull(instance)) {
                    instance = new Singleton4();
                }
            }
        }
        return instance;
    }
}
