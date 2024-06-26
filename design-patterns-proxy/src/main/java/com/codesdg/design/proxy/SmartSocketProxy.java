package com.codesdg.design.proxy;

/**
 * @author shandeguo
 * @version V1.0
 * @date 2024/6/26 下午9:32
 * @description
 * @Copyright
 */
public class SmartSocketProxy implements SmartSocket{

    private RealSmartSocket realSmartSocket;

    private User user;

    public SmartSocketProxy(User user) {
        this.user = user;
        this.realSmartSocket = new RealSmartSocket();
    }

    /**
     * 打开插座
     */
    @Override
    public void rurnOn() {
        if (authenticateUser(user)) {
            realSmartSocket.rurnOn();
            logAction("turned on");
        }else {
            System.out.println("Access denied. User is not authenticated.");
        }
    }

    /**
     * 关闭插座
     */
    @Override
    public void turnOff() {
        if (authenticateUser(user)) {
            realSmartSocket.turnOff();
            logAction("turned off");
        }else {
            System.out.println("Access denied. User is not authenticated.");
        }
    }

    private boolean authenticateUser(User user) {
        // Simplified authentication logic
        return user.isAuthenticated();
    }

    private void logAction(String action) {
        System.out.println("Log: Socket was " + action + " by user " + user.getName());
    }

}
