package com.codesdg.design;

/**
 * @author shandeguo
 * @version V1.0
 * @date 2024/5/15 下午7:48
 * @description
 * @Copyright
 */
public class OracleFactory implements DBFactory{
    @Override
    public Connection createConnection() {
        return new OracleConnection();
    }

    @Override
    public Statement createStatement() {
        return new OracleStatement();
    }
}
