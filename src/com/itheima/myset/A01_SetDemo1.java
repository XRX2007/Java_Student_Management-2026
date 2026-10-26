package com.itheima.myset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;

public class A01_SetDemo1 {
    //利用Set系例的集合，添加字符串，并使用多种方式遍历
    public static void main(String[] args){
        Set<String> s=new HashSet<>();
        s.add("张三");
        s.add("张三");
        s.add("李四");
        s.add("王五");
        //System.out.println(s);

        /*for (String str: s) {
            System.out.println(str);
        }*/

        /*s.forEach(new Consumer<String>() {
            @Override
            public void accept(String str) {
                System.out.println(str);
            }
        });*/

        //s.forEach( str-> System.out.println(str));

        Iterator<String> it= s.iterator();
        while(it.hasNext()){
            String str=it.next();
            System.out.println(str);
        }

    }
}
