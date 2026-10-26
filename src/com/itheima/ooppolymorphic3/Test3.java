package com.itheima.ooppolymorphic3;

import java.util.concurrent.Callable;

public class Test3 {
    public static void main(String[] args){
        Student stu=new Student("晓晓",19);
        Rectangle r=new Rectangle(3,4);
        Circle c=new Circle(2);
        stu.print(r);
        stu.print(c);
    }
}
