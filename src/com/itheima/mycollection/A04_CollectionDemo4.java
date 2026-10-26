package com.itheima.mycollection;

import java.util.ArrayList;
import java.util.Collection;

public class A04_CollectionDemo4 {
    //增强for循环
    public static void main(String[] args)
    {
        Collection<String> coll=new ArrayList<>();
        coll.add("zhangsan");
        coll.add("lisi");
        coll.add("wangwu");
        //快速生成方式  集合名字+for 回车
        for (String s : coll) {
            System.out.println(s);
        }
    }
}
