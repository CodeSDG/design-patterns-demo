package com.codesdg.design.floor;

import com.codesdg.design.Matter;

import java.math.BigDecimal;

/**
 * @author shandeguo
 * @version V1.0
 * @date 2024/5/15 下午9:55
 * @description
 * @Copyright
 */
public class DerFloor implements Matter {
    @Override
    public String scene() {
        return "地板";
    }

    @Override
    public String brand() {
        return "德尔";
    }

    @Override
    public String model() {
        return "A+";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(119);
    }

    @Override
    public String desc() {
        return "DER德尔集团是全球领先的专业⽊木地板制造商，北北京2008年年奥运会家装和公装地板供应商";
    }
}
