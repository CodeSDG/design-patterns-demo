package com.codesdg.design.ceiling;

import com.codesdg.design.Matter;

import java.math.BigDecimal;

/**
 * @author shandeguo
 * @version V1.0
 * @date 2024/5/15 下午9:47
 * @description
 * @Copyright
 */
public class LevelOneCeiling implements Matter {

    @Override
    public String scene() {
        return "吊顶";
    }
    @Override
    public String brand() {
        return "装修公司⾃自带";
    }
    @Override
    public String model() {
        return "一级顶";
    }
    @Override
    public BigDecimal price() {
        return new BigDecimal(260);
    }
    @Override
    public String desc() {
        return "造型只做低⼀一级，只有⼀一个层次的吊顶，⼀一般离顶120-150mm";
    }
}
