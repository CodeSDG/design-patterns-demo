package com.codesdg.design;

/**
 * @author shandeguo
 * @version V1.0
 * @date 2024/6/26 下午10:54
 * @description
 * @Copyright
 */
public class ObserverPatternDemo {

    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();

        ConcreteObserver observer1 = new ConcreteObserver("observer 1");
        ConcreteObserver observer2 = new ConcreteObserver("observer 2");

        subject.registerObserver(observer1);
        subject.registerObserver(observer2);

        subject.setState("new state");
    }
}
