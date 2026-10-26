package com.itheima.work3;
import java.util.ArrayList;
public class Test1 {
    public static void main(String[] args){
        ArrayList<String> list=new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        System.out.println(list);
        String result=list.get(0);
        System.out.println(result);
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            String s=list.get(i);
            System.out.println(s);
        }

    }
}
