package com.itheima.oopextendstest4;

public class BachelorStudent extends Student{
    public BachelorStudent() {
    }

    public BachelorStudent(String name, int age, String grade) {
        super(name, age, grade);
    }

    @Override
    public void study() {
        System.out.println("研究生学习研究生知识");
    }

    @Override
    public void sleep() {
        System.out.println("研究生宿舍升级为豪华宿舍");
    }
}
