package com.itheima.mygenerics;

public class GenericsDemo5 {
    public static void main(String[] args){
        MyArrayList<String> list=new MyArrayList<>();
        list.add("aaa");
        list.add("bbb");
        System.out.println(list);
    }
}
