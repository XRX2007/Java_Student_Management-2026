package com.itheima.work3;

import java.util.ArrayList;

public class Test8 {
    public static void main(String[] args){
        ArrayList<Phone> list=new ArrayList<>();
        Phone p1=new Phone("小米",1000);
        Phone p2=new Phone("苹果",8000);
        Phone p3=new Phone("锤子",2999);
        list.add(p1);
        list.add(p2);
        list.add(p3);
        ArrayList<Phone> listfoFlost=lowprice(list);
        for (int i = 0; i < listfoFlost.size(); i++) {
            Phone p=listfoFlost.get(i);
            System.out.println(p.getBrand()+","+p.getPrice());
        }

    }public static ArrayList<Phone> lowprice(ArrayList<Phone> list){
        ArrayList<Phone> list1=new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getPrice()<3000){
                list1.add(list.get(i));
            }
        }return list1;
    }
}
