package com.codesdg.design.proxy;

/**
 * @author shandeguo
 * @version V1.0
 * @date 2024/6/26 下午9:31
 * @description
 * @Copyright
 */
public class RealSmartSocket implements SmartSocket{
    /**
     * 打开插座
     */
    @Override
    public void rurnOn() {
        System.out.println("RealSmartSocket: Turning on the socket.");
    }

    /**
     * 关闭插座
     */
    @Override
    public void turnOff() {
        System.out.println("RealSmartSocket: Turning off the socket.");
    }
}
