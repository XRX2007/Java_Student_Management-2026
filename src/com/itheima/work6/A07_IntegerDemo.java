package com.itheima.work6;

import com.itheima.interfacedemo4.Inter;

public class A07_IntegerDemo {
    public static void main(String[] args) {
        //利用构造方法获取对象
        Integer i1 = new Integer(1);
        Integer i2 = new Integer(1);
        System.out.println(i1 == i2);//false
        Integer i3 = new Integer("1");
        System.out.println(i3);
        //利用静态方法获取对象
        Integer i4 = Integer.valueOf(127);
        Integer i5 =Integer.valueOf(127);
        System.out.println(i4==i5);//true
        Integer i7 = Integer.valueOf(128);
        Integer i8 =Integer.valueOf(128);
        System.out.println(i7==i8);//false
        Integer i6 =Integer.valueOf("128");
        System.out.println(i6);
        //包装类计算
        //1.自动拆箱
        int num1=i1;
        int num2=i2;
        //2.自动装箱
        Integer num=num1+num2;
        System.out.println(num);

    }

}
