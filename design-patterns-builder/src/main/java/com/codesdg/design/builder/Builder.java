package com.codesdg.design.builder;

import com.codesdg.design.ceiling.LevelOneCeiling;
import com.codesdg.design.ceiling.LevelTwoCeiling;
import com.codesdg.design.coat.DuluxCoat;
import com.codesdg.design.coat.LibangCoat;
import com.codesdg.design.floor.ShengXiangFloor;
import com.codesdg.design.tile.DongPengTile;
import com.codesdg.design.tile.MarcoPoloTile;

/**
 * @author shandeguo
 * @version V1.0
 * @date 2024/5/15 下午10:08
 * @description
 * @Copyright
 */

/**
 * 建造者的使⽤用中就已经⾮非常容易易了了，统⼀一的建造⽅方式，通过不不同物料料填充出不不同的装修⻛风格；
 * 豪华欧式 、 轻奢⽥田园 、 现代简约 ，如果将来业务扩展也可以将这部分内容配置到数据库⾃自动⽣生成。
 * 但整体的思想还可以使⽤用创建者模式进⾏行行搭建。
 */
public class Builder {
    public IMenu levelOne(Double area) {
        return new DecorationPackageMenu(area, "豪华欧式")
                .appendCeiling(new LevelTwoCeiling())    // 吊顶，⼆二级顶
                .appendCoat(new DuluxCoat())             // 涂料料，多乐⼠士
                .appendFloor(new ShengXiangFloor());     // 地板，圣象    }

    }

    public IMenu levelTwo(Double area) {
        return new DecorationPackageMenu(area, "轻奢田园")
                .appendCeiling(new LevelTwoCeiling())    // 吊顶，二级顶
                .appendCoat(new LibangCoat())             // 涂料料，立邦
                .appendFloor(new MarcoPoloTile());     // 地板，马可波罗
    }

    public IMenu levelThree(Double area) {
        return new DecorationPackageMenu(area, "现代简约")
                .appendCeiling(new LevelOneCeiling())    // 吊顶，一级顶
                .appendCoat(new LibangCoat())             // 涂料料，立邦
                .appendFloor(new DongPengTile());     // 地板，东鹏
    }
}
