package com.codesdg.design;

/**
 * @author shandeguo
 * @version V1.0
 * @date 2024/6/26 下午11:34
 * @description
 * @Copyright
 */
public class ConcreteDecoratorA extends Decorator{

    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        addedFunctionalityA();
    }

    private void addedFunctionalityA() {
        System.out.println("ConcreteDecoratorA adds functionality A.");
    }
}
