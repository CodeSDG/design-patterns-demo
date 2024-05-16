package com.codesdg.design;

import com.codesdg.design.enums.ShapeEnum;
import com.codesdg.design.shape.Shape;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.nio.charset.CoderMalfunctionError;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{

    public void test_ShapeFactory()
    {
        Shape shape = ShapeFactory.createShape(ShapeEnum.TRIGGLE);
        shape.draw();
        shape.erase();
        shape = ShapeFactory.createShape(ShapeEnum.CIRCLE);
        shape.draw();
        shape.erase();
        shape = ShapeFactory.createShape(ShapeEnum.RECTANGLE);
        shape.draw();
        shape.erase();
        shape = ShapeFactory.createShape(null);
        /**
         *结果展示：
         * 绘制三角形
         * 擦除三角形
         * 绘制圆形
         * 擦除圆形
         * 绘制方形
         * 擦除方形
         *
         * java.lang.RuntimeException: 图形无效
         */
    }
}
