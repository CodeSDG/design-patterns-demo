package com.codesdg.design.tile;

import com.codesdg.design.Matter;

import java.math.BigDecimal;

/**
 * @author shandeguo
 * @version V1.0
 * @date 2024/5/15 下午9:58
 * @description
 * @Copyright
 */
public class DongPengTile implements Matter {
    @Override
    public String scene() {
        return "地砖";
    }

    @Override
    public String brand() {
        return "东鹏";
    }

    @Override
    public String model() {
        return "10001";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(102);
    }

    @Override
    public String desc() {
        return "东鹏瓷砖以品质铸就品牌，科技推动品牌，⼝口碑碑传播品牌为宗旨，2014年年品牌价值132.35亿元，位列列建陶⾏行行业榜⾸首。";
    }
}
