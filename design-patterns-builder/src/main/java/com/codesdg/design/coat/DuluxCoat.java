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
public class DuluxCoat implements Matter {
    @Override
    public String scene() {
        return "涂料";
    }

    @Override
    public String brand() {
        return "多乐士（Dulux）";
    }

    @Override
    public String model() {
        return "第二代";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(719);
    }

    @Override
    public String desc() {
        return "多乐⼠士是阿克苏诺⻉贝尔旗下的著名建筑装饰油漆品牌，产品畅销于全球100个国家，每年年全球有5000万户家庭使⽤用多乐⼠士油漆。";
    }
}
