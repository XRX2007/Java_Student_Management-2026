package com.itheima.oopextendstest4;

public class Test4 {
    public static void main(String[] args){
        BachelorStudent stu=new BachelorStudent("晓晓",18,"研一");
        System.out.println(stu.getName()+","+stu.getAge()+","+stu.getGrade());
        stu.eat();
        stu.sleep();
        stu.study();
    }
}
