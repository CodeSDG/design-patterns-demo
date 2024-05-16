package com.codesdg.design;

/**
 * @author shandeguo
 * @version V1.0
 * @date 2024/5/15 下午10:22
 * @description
 * @Copyright
 */
public class Student {

    private String name;
    private String age;
    private String number;
    private String address;
    private String school;

    public Student(StudentBuilder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.number = builder.number;
        this.address = builder.address;
        this.school = builder.school;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Override
    public String toString()
    {
        return "姓名：" + name + "，年龄：" + age + "，学号：" + number + "，地址：" + address + "，学校：" + school;
    }

    /**
     * 使用静态内部类作为创建者
     *      将具体的业务类 及其 创建者 定义在一个类中
     * 使用链式调用 , 每个 build 步骤都返回创建者本身
     */
    public static class StudentBuilder {
        private String name;
        private String age;
        private String number;
        private String address;
        private String school;

        public StudentBuilder setName(String name)
        {
            this.name = name;
            return this;
        }
        public StudentBuilder setAge(String age)
        {
            this.age = age;
            return this;
        }
        public StudentBuilder setNumber(String number)
        {
            this.number = number;
            return this;
        }
        public StudentBuilder setAddress(String address)
        {
            this.address = address;
            return this;
        }
        public StudentBuilder setSchool(String school)
        {
            this.school = school;
            return this;
        }
        public Student build()
        {
            return new Student(this);
        }

}
}
