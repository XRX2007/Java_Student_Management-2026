package com.itheima.myset;

public class A02_HashSetDemo1 {
    public static void main(String[] args){
        //没有重写hashcode方法和equals方法
        Student s1=new Student("张三",23);
        Student s2=new Student("张三",23);
        /*System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());*/

        //重写了hashcode和equals后
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        //不同的属性值和不同的地址值，计算出的哈希值有可能是一样的
        System.out.println("abc".hashCode());
        System.out.println("acD".hashCode());
    }
}
