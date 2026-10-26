package com.itheima.searchcode;

import java.util.ArrayList;

public class A01_BasicSearchDemo1 {
    //顺序查找
    public static void main(String[] args){
        int[] arr={131,127,147,81,103,23,7,79,81};
        ArrayList<Integer> list=basicSearch(arr,81);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i)+" ");
        }

    }
    public static ArrayList<Integer> basicSearch(int[] arr, int num){
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==num){
                list.add(i);
            }
        }return list;
    }
}
