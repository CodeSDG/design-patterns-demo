package com.codesdg.design;

/**
 * @author shandeguo
 * @version V1.0
 * @date 2024/5/15 下午7:49
 * @description
 * @Copyright
 */
public class MySQLFactory implements DBFactory{
    @Override
    public Connection createConnection() {
        return new MySQLConnection();
    }

    @Override
    public Statement createStatement() {
        return new MySQLStatement();
    }
}
