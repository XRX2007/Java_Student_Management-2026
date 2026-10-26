package com.itheima.oopextendstest4;

public class MajorTeacher extends Teacher{
    public MajorTeacher() {
    }

    public MajorTeacher(String name, int age, String subject) {
        super(name, age, subject);
    }

    @Override
    public void teach() {
        System.out.println("专业课老师教授专业知识");
    }
}
