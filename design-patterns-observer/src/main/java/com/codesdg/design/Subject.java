package com.codesdg.design;



/**
 * @author shandeguo
 * @version V1.0
 * @date 2024/6/26 下午10:48
 * @description 被观察者接口
 * @Copyright
 */
public interface Subject {
    /**
     * 注册观察者
     */
    void registerObserver(Observer observer);

    /**
     * 移除观察者
     */
    void removeObserver(Observer observer);

    /**
     * 通知观察者
     */
    void notifyObservers();
}
