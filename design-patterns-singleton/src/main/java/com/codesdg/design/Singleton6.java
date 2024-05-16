package com.codesdg.design;

import java.util.concurrent.atomic.AtomicReference;

/**
 * @author shandeguo
 * @version V1.0
 * @date 2024/5/16 下午3:54
 * @description
 * @Copyright
 */
public class Singleton6 {

    /**
     * todo 借助自旋锁 cas实现线程安全
     */
    private static final AtomicReference<Singleton6> INSTANCE = new AtomicReference<>();

    private Singleton6() {
    }

    public static Singleton6 getInstance() {
        // 使用AtomicReference的compareAndSet方法来确保线程安全的创建实例
        for (;;) {
            Singleton6 current = INSTANCE.get();
            if (current != null) {
                return current;
            }
            // 尝试创建新的实例，如果INSTANCE中的引用已经非空，则失败
            if (INSTANCE.compareAndSet(null, new Singleton6())) {
                return INSTANCE.get();
            }
        }
    }
}


