package com.codesdg.design.demo2;

/**
 * @author shandeguo
 * @version V1.0
 * @date 2024/6/26 下午4:55
 * @description
 * @Copyright
 */
public class ComputerProduct implements IProduct{
    /**
     * 产品类型的公共方法
     *
     * @return 获取产品信息
     */
    @Override
    public String getInformation() {
        return "华为电脑也是遥遥领先！";
    }
}
