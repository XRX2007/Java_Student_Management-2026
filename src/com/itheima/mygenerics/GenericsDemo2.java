package com.itheima.mygenerics;

import java.util.ArrayList;

public class GenericsDemo2 {
    public static void main(String[] args){
        /*ArrayList<String> list=new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        System.out.println(list);
         */
        ArrayList<Integer> list=new ArrayList<>();
        list.add(123);
        list.add(456);
        list.add(789);
        System.out.println(list);
    }
}
