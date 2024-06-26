package com.codesdg.design;

/**
 * @author shandeguo
 * @version V1.0
 * @date 2024/6/26 下午11:33
 * @description
 * @Copyright
 */
public abstract class Decorator implements Component{
    protected Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation();
    }
}
