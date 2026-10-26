package com.itheima.work3;
import java.lang.reflect.Array;
import java.util.ArrayList;
public class Test6 {
    public static void main(String[] args){
        ArrayList<User> list=new ArrayList<>();
        User u1=new User("heima001","zhangsan","1234");
        User u2=new User("heima002","lisi","12345");
        User u3=new User("heima003","wangwu","12345");
        list.add(u1);
        list.add(u2);
        list.add(u3);
        boolean flag=contains(list,"heima004");
        System.out.println(flag);
    }public static boolean contains(ArrayList<User> list,String id){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getId().equals(id)){
                return true;
            }
        }return false;
    }
}
