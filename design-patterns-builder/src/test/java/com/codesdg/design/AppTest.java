package com.codesdg.design;

import com.codesdg.design.builder.Builder;
import com.codesdg.design.builder.DecorationPackageMenu;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase {
    public void test_Builder() {
        Builder menu = new Builder();
       // 豪华欧式
        System.out.println(menu.levelOne(132.52).getDetail());
        // 轻奢田园
        System.out.println(menu.levelTwo(98.25).getDetail());
        // 现代简约
        System.out.println(menu.levelThree(85.43).getDetail());
    }

    public void test_StudentBuilder() {
        Student student = new Student.StudentBuilder()
                .setName("小明")
                .setAge("12")
                .setNumber("1")
                .setAddress("学院路")
                .setSchool("第一小学")
                .build();
        System.out.println(student);
    }

}
