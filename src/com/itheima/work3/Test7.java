package com.itheima.work3;

import java.util.ArrayList;

public class Test7 {
    public static void main(String[] args){
        ArrayList<User> list=new ArrayList<>();
        User u1=new User("heima001","zhangsan","1234");
        User u2=new User("heima002","lisi","12345");
        User u3=new User("heima003","wangwu","12345");
        list.add(u1);
        list.add(u2);
        list.add(u3);
        int str=checkid(list,"heima009");
        System.out.println(str);
    }
    public static boolean contains(ArrayList<User> list,String id){
        return checkid(list,id)>=0;
    }
    public static int checkid(ArrayList<User> list,String id){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getId().equals(id)){
                return i;
            }
        }return -1;
    }
}
