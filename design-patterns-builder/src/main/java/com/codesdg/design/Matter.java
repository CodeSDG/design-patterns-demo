package com.codesdg.design;

import java.math.BigDecimal;

/**
 * @author shandeguo
 * @version V1.0
 * @date 2024/5/15 下午9:44
 * @description 物料接口
 * @Copyright
 */

public interface Matter {
    // 场景： 地板 地砖 涂料 吊顶 地砖等
    String scene();

    // 品牌
    String brand();

    // 型号
    String model();

    //价格
    BigDecimal price();

     /* 描述信息 */
    String desc();

}
