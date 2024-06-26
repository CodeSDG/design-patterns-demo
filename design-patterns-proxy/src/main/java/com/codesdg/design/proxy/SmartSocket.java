package com.codesdg.design.proxy;

/**
 * @author shandeguo
 * @version V1.0
 * @date 2024/6/26 下午9:30
 * @description Subject（智能插座接口）：定义智能插座的基本操作接口，如打开插座、关闭插座。
 * @Copyright
 */
public interface SmartSocket {

    /**
     * 打开插座
     */
    void rurnOn();

    /**
     * 关闭插座
     */
    void turnOff();
}
