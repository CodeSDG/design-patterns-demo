package com.codesdg.design;

/**
 * @author shandeguo
 * @version V1.0
 * @date 2024/6/26 下午11:15
 * @description
 * @Copyright
 */
public class AdapterDemo {
    public static void main(String[] args) {

        /**
         * 在这个示例中，Target接口代表客户期望的接口，Adaptee类有一个不符合客户需求的接口specificRequest，
         * 而Adapter类通过持有Adaptee的实例，并实现了Target接口，将Adaptee的接口适配为客户所需的接口。
         */
        Adaptee adaptee = new Adaptee();
        Target target = new Adapter(adaptee);
        target.request();
    }
}
