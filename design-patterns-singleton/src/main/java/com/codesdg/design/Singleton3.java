package com.codesdg.design;

import java.util.Objects;

/**
 * @author shandeguo
 * @version V1.0
 * @date 2024/5/16 下午3:19
 * @description
 * @Copyright
 */
public class Singleton3 {

    /**
     * todo 懒汉模式  线程安全    eg：不建议，性能较差
     */
    private static Singleton3 instance;

    private Singleton3() {
    }

    public static synchronized Singleton3 getInstance() {
        if (Objects.isNull(instance)) {
            instance = new Singleton3();
        }
        return instance;
    }
}
