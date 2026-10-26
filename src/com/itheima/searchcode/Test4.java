package com.itheima.searchcode;

public class Test4 {
    //爬楼梯 一次能爬一个台阶，或两个台阶，或三个台阶
    public static void main(String[] args){
        System.out.println(getCount(20));
    }
    public static int getCount(int n){
        if(n==1)
            return 1;
        if(n==2)
            return 2;
        if(n==3)
            return 4;
        return getCount(n-1)+getCount(n-2)+getCount(n-3);
    }
}
