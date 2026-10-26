package com.itheima.mycollection;

import java.util.ArrayList;
import java.util.Collection;

public class A01_CollectionDemo1 {
    public static void main(String[] args){
        //Collection 的方法
        Collection<String> coll=new ArrayList<>();
        coll.add("aaa");
        coll.add("bbb");
        System.out.println(coll);
        /*coll.clear();
        System.out.println(coll);
        */
        coll.remove("aaa");
        System.out.println(coll);
        boolean result=coll.contains("bbb");
        System.out.println(result);
        boolean result2=coll.isEmpty();
        System.out.println(result2);
        int size=coll.size();
        System.out.println(size);
    }
}
