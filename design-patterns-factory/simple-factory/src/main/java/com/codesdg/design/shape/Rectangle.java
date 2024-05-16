package com.codesdg.design.shape;

/**
 * @author shandeguo
 * @version V1.0
 * @date 2024/5/15 下午5:34
 * @description
 * @Copyright
 */
public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("绘制方形");
    }

    @Override
    public void erase() {
        System.out.println("擦除方形");
    }
}
