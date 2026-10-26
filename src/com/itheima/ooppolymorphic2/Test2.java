package com.itheima.ooppolymorphic2;

public class Test2 {
    public static void main(String[] args){
        Person p=new Person("晓晓",19,"女");
        System.out.println(p.getName()+","+p.getAge()+","+p.getGender());
        Bicycle b=new Bicycle("飞鸽",15);
        p.driver(b);
        Car c=new Car("宝马",80);
        p.driver(c);

    }
}
