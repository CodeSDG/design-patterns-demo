package com.codesdg.design.demo2;

/**
 * @author shandeguo
 * @version V1.0
 * @date 2024/6/26 下午4:52
 * @description
 * @Copyright
 */

public interface IFactory<T>{

    /**
     * 获取具体产品实例
     * @return 返场创建的实例对象
     */
    T product();
}
