package com.itheima.abatractdemo;


import java.sql.SQLOutput;

public class Test1 {
    public static void main(String[] args){
        Frog f=new Frog("小绿",1);
        System.out.println(f.getName()+","+f.getAge());
        f.drink();
        f.eat();
    }


}
