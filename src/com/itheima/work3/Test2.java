package com.itheima.work3;
import java.util.ArrayList;
public class Test2 {
    public static void main(String[] args){
        ArrayList<String> list=new ArrayList<>();
        list.add("安安安");
        list.add("呃呃呃");
        list.add("嘻嘻嘻");
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if(i==(list.size()-1)){
                System.out.print(list.get(i));
            }else{
                System.out.print(list.get(i)+",");
            }
        }
        System.out.print("]");
    }
}
