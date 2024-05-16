package com.codesdg.design;


/**
 * @author shandeguo
 * @version V1.0
 * @date 2024/5/15 下午6:03
 * @description
 * @Copyright
 */
public class FileLogFactory extends LogFactory{
    @Override
    public BaseLog createLog() {
        System.out.println("使用文件工厂");
        return new FileLog();
    }
}
