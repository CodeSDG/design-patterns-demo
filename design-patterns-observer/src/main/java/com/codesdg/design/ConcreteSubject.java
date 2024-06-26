package com.codesdg.design;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shandeguo
 * @version V1.0
 * @date 2024/6/26 下午10:51
 * @description
 * @Copyright
 */
public class ConcreteSubject implements Subject{
    private String state;

    private List<Observer> observers = new ArrayList<>();

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        notifyObservers();
    }

    /**
     * 注册观察者
     *
     * @param observer
     */
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * 移除观察者
     *
     * @param observer
     */
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * 通知观察者
     */
    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(state);
        }
    }
}
