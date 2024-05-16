package com.codesdg.design.builder;

import com.codesdg.design.Matter;

/**
 * @author shandeguo
 * @version V1.0
 * @date 2024/5/15 下午10:02
 * @description
 * @Copyright
 */
public interface IMenu {
    IMenu appendCeiling(Matter matter); // 吊顶
    IMenu appendCoat(Matter matter);    // 涂料料
    IMenu appendFloor(Matter matter);   // 地板
    IMenu appendTile(Matter matter);    // 地砖
    String getDetail();                 // 明细
}
