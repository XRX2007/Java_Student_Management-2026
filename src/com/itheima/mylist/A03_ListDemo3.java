package com.itheima.mylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;

public class A03_ListDemo3 {
    public static void main(String[] args){
        List<String> list=new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        //迭代器遍历
        Iterator<String> it=list.iterator();
        while(it.hasNext()){
            String s=it.next();
            System.out.println(s);
        }
        //增强for遍历
        for(String s:list){
            System.out.println(s);
        }
        //lambda表达式
        list.forEach(s-> System.out.println(s));
        //普通for循环
        for (int i = 0; i < list.size(); i++) {
            String s=list.get(i);
            System.out.println(s);
        }
        //列表迭代器
        ListIterator<String> it1=list.listIterator();
        while(it1.hasNext()){
            String s=it1.next();
            System.out.println(s);
        }
    }
}
