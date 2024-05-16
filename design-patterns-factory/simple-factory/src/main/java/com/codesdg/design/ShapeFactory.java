package com.codesdg.design;

import com.codesdg.design.enums.ShapeEnum;
import com.codesdg.design.shape.Circle;
import com.codesdg.design.shape.Rectangle;
import com.codesdg.design.shape.Shape;
import com.codesdg.design.shape.Triggle;


/**
 * @author shandeguo
 * @version V1.0
 * @date 2024/5/15 下午5:37
 * @description 工厂类
 * @Copyright
 */
public class ShapeFactory {

    public static Shape createShape(ShapeEnum shapeEnum) {
        if (shapeEnum == null) {
            throw new RuntimeException("图形无效");
        } else if (shapeEnum == ShapeEnum.CIRCLE) {
            return new Circle();
        } else if (shapeEnum == ShapeEnum.RECTANGLE) {
            return new Rectangle();
        } else if (shapeEnum == ShapeEnum.TRIGGLE) {
            return new Triggle();
        } else {
            throw new RuntimeException("无效图形");
        }
    }
}
