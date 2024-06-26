package com.codesdg.design.dynamic;

/**
 * @author shandeguo
 * @version V1.0
 * @date 2024/6/26 下午9:52
 * @description
 * @Copyright
 */
public class BusinessLogicImpl implements BusinessLogic{
    @Override
    public void performTaskA() {
        System.out.println("Executing Task A");
    }

    @Override
    public String performTaskB(String input) {
        System.out.println("Executing Task B with input: " + input);
        return "Task B result";
    }
}
