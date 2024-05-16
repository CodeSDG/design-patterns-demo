package com.codesdg.design;

/**
 * @author shandeguo
 * @version V1.0
 * @date 2024/5/15 下午7:45
 * @description
 * @Copyright
 */
public class MySQLConnection implements Connection{
    @Override
    public void connect() {
        System.out.println("MySQLConnection connect");
    }
}
