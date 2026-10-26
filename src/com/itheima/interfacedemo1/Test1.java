package com.itheima.interfacedemo1;

public class Test1 {
    public static void main(String[] args){
        Dog d=new Dog("小黄",2);
        System.out.println(d.getName()+","+d.getAge());
        d.eat();
        d.swim();
    }
}
