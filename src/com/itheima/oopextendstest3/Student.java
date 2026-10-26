package com.itheima.oopextendstest3;

public class Student extends Person{
    String grade;
    public Student(){
        System.out.println("子类Student的空参构造执行了");
    }
    public Student(String name,int age,String grade){
        System.out.println("子类Student的带参构造执行了");
        super(name,age);
        this.grade=grade;
    }

}
