package com.codesdg.design;

/**
 * @author shandeguo
 * @version V1.0
 * @date 2024/5/15 下午7:47
 * @description
 * @Copyright
 */
public interface DBFactory {
    Connection createConnection();
    Statement createStatement();
}
