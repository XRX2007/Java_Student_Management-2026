package com.itheima.ooppolymorphic4;

public class Test4 {
    public static void main(String[] args){
        Person p=new Person("晓晓",19);
        System.out.println("饲养员"+p.getName()+","+p.getAge());
        Dog d=new Dog();
        Cat c=new Cat();
        p.keepPet(d,"骨头");
        p.keepPet(c,"小鱼干");
    }
}
