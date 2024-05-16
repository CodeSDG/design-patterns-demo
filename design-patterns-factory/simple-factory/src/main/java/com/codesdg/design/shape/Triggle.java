package com.codesdg.design.shape;

/**
 * @author shandeguo
 * @version V1.0
 * @date 2024/5/15 下午5:36
 * @description
 * @Copyright
 */
public class Triggle implements Shape{
    @Override
    public void draw() {
        System.out.println("绘制三角形");
    }

    @Override
    public void erase() {
        System.out.println("擦除三角形");
    }
}
