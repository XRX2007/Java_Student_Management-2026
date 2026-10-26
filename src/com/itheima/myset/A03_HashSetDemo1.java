package com.itheima.myset;

import java.util.HashSet;

public class A03_HashSetDemo1 {
    public static void main(String[] args){
        //利用HashSet集合去重
        Student s1=new Student("张三",23);
        Student s2=new Student("李四",24);
        Student s3=new Student("王五",25);
        Student s4=new Student("张三",23);
        //类型为自定义类型要重写hashset和equals，其他的java 已经重写好了
        HashSet<Student> hs=new HashSet<>();
        System.out.println(hs.add(s1));
        System.out.println(hs.add(s2));
        System.out.println(hs.add(s3));
        System.out.println(hs.add(s4));
        System.out.println(hs);
    }
}
