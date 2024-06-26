package com.codesdg.design;

/**
 * @author shandeguo
 * @version V1.0
 * @date 2024/6/26 下午11:36
 * @description
 * @Copyright
 */
public class DecoratorPatternDemo {
    public static void main(String[] args) {

        /*

          在这个示例中，Component接口定义了基本的操作方法，ConcreteComponent是具体组件，实现了Component接口。
          Decorator是装饰器的基类，持有一个Component对象的引用，并重写了operation方法，以便在调用原有组件方法的基础上添加新功能。
          ConcreteDecoratorA和ConcreteDecoratorB是具体装饰器类，分别添加了不同的功能。客户端代码通过层层装饰，动态地增强了组件的功能。
         */
        ConcreteComponent component = new ConcreteComponent();
        ConcreteDecoratorA decoratorA = new ConcreteDecoratorA(component);
        ConcreteDecoratorB decoratorB = new ConcreteDecoratorB(component);

        decoratorA.operation();
    }
}
