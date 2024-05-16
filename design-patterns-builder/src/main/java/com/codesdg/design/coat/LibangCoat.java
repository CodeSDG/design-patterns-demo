package com.codesdg.design.coat;

import com.codesdg.design.Matter;

import java.math.BigDecimal;

/**
 * @author shandeguo
 * @version V1.0
 * @date 2024/5/15 下午9:51
 * @description
 * @Copyright
 */
public class LibangCoat implements Matter {
    @Override
    public String scene() {
        return "涂料";
    }

    @Override
    public String brand() {
        return "立邦";
    }

    @Override
    public String model() {
        return "默认级别";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(650);
    }

    @Override
    public String desc() {
        return "⽴立邦始终以开发绿⾊色产品、注᯿⾼高科技、⾼高品质为⽬目标，以技术⼒力力量量不不断推进科研和开发，满⾜足消费者需求。";
    }
}
