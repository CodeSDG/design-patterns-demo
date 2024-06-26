package com.codesdg.design.dynamic;

/**
 * @author shandeguo
 * @version V1.0
 * @date 2024/6/26 下午9:51
 * @description 首先，定义一个业务接口，代表需要被代理的业务逻辑。
 * @Copyright
 */
public interface BusinessLogic {

    /**
     * 业务逻辑
     */
    void performTaskA();

    /**
     * 业务逻辑
     */
    String performTaskB(String input);
}
