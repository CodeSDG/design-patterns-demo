package com.codesdg.design.proxy;

/**
 * @author shandeguo
 * @version V1.0
 * @date 2024/6/26 下午9:40
 * @description
 * @Copyright
 */
public class ProxyMain
{
    public static void main(String[] args) {
        User user = new User("Alex", true);
        SmartSocket socket = new SmartSocketProxy(user);

        socket.rurnOn();
        socket.turnOff();
    }
}
