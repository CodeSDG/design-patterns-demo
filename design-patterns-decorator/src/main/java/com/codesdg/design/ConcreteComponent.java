package com.codesdg.design;

/**
 * @author shandeguo
 * @version V1.0
 * @date 2024/6/26 下午11:32
 * @description
 * @Copyright
 */
public class ConcreteComponent implements Component{
    @Override
    public void operation() {
        System.out.println("ConcreteComponent Operation");
    }
}
