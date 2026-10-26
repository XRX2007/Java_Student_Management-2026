package com.itheima.oopextendstest4;

public class MatserStudent extends Student{
    public MatserStudent() {
    }

    public MatserStudent(String name, int age, String grade) {
        super(name, age, grade);
    }

    @Override
    public void study() {
        System.out.println("本科生学习本科知识");
    }
}
