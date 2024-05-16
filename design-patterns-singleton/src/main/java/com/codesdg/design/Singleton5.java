package com.codesdg.design;

/**
 * @author shandeguo
 * @version V1.0
 * @date 2024/5/16 下午3:43
 * @description
 * @Copyright
 */
public class Singleton5 {

    /**
     * 静态内部类方式构建单例对象，todo 非常推荐
     * todo ：由于静态内部类的特点，只有当外部调用时才会创建内部类，从而创建单例对象
     */
    private static class SingletonHolder {
        private static final Singleton5 INSTANCE = new Singleton5();
    }

    private Singleton5() {}

    public static Singleton5 getInstance() {
        return SingletonHolder.INSTANCE;
    }

}

