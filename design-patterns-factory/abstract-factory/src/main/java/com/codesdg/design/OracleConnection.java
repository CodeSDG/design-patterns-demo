package com.codesdg.design;

/**
 * @author shandeguo
 * @version V1.0
 * @date 2024/5/15 下午7:44
 * @description
 * @Copyright
 */
public class OracleConnection implements Connection{
    @Override
    public void connect() {
        System.out.println("OracleConnection connect");
    }
}
