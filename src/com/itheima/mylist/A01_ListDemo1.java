package com.itheima.mylist;

import java.util.ArrayList;
import java.util.List;

public class A01_ListDemo1 {
    //List系列集合独有方法
    public static void main(String[] args){
        List<String> list=new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add(1,"QQQ");
        System.out.println(list);
        System.out.println(list.remove(1));
        System.out.println(list);
        list.set(0,"QQQ");
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list);
    }
}
