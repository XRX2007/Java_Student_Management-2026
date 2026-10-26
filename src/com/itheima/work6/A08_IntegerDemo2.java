package com.itheima.work6;

public class A08_IntegerDemo2 {
    public static void main(String[] args){
        //1.把整数转成二进制
        String str1=Integer.toBinaryString(100);
        System.out.println(str1);
        //八进制
        String str2=Integer.toOctalString(100);
        System.out.println(str2);
        //十六进制
        String str3=Integer.toHexString(100);
        System.out.println(str3);
        int i=Integer.parseInt("112");
        System.out.println(i+1);
    }
}
