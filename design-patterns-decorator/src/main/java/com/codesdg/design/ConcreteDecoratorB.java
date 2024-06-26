package com.codesdg.design;

/**
 * @author shandeguo
 * @version V1.0
 * @date 2024/6/26 下午11:35
 * @description
 * @Copyright
 */
public class ConcreteDecoratorB extends Decorator{

    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        addedFunctionalityB();
    }

    private void addedFunctionalityB() {
        System.out.println("ConcreteDecoratorB adds functionality B.");
    }
}
