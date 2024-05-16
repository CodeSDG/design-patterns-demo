package com.codesdg.design;

/**
 * @author shandeguo
 * @version V1.0
 * @date 2024/5/15 下午6:06
 * @description
 * @Copyright
 */
public class DatabaseLogFactory extends LogFactory{
    @Override
    public BaseLog createLog() {
        System.out.println("创建数据库日志记录器");
        return new DatabaseLog();
    }
}
