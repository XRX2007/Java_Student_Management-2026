package com.itheima.work1;

public class Test10 {
    public static void main(String[] args){
        String phonenumber="13868729359";
        String start=phonenumber.substring(0,3);
        String end=phonenumber.substring(7);
        String result=start+"****"+end;
        System.out.println(result);
    }

}
