package com.codesdg.design;

/**
 * @author shandeguo
 * @version V1.0
 * @date 2024/6/26 下午10:53
 * @description
 * @Copyright
 */
public class ConcreteObserver implements Observer{

    private String name;
    private String subjectState;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    /**
     * 更新
     *
     * @param state
     */
    @Override
    public void update(String state) {
        subjectState = state;
        System.out.println(name + " 收到通知，状态为：" + subjectState);
    }
}
