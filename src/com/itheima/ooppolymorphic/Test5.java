package com.itheima.ooppolymorphic;

public class Test5 {
    public static void main(String[] args){
        Student stu=new Student("张三","20001","123456");
        StudentManger sm=new StudentManger();
        sm.register(stu);
        Teacher t=new Teacher("李老师","378","145");
        sm.register(t);
    }
}
