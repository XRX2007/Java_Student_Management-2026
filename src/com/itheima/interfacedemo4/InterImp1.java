package com.itheima.interfacedemo4;

public class InterImp1 implements Inter{
    @Override
    public void method() {
        System.out.println("实现类重写的抽象方法");
    }


    public static void show() {
        System.out.println("InterImp1接口中的默认方法");
    }
}
