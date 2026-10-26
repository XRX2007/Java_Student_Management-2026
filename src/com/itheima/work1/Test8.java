package com.itheima.work1;
import java.util.Scanner;
public class Test8 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入字符串");
        String str=sc.next();
        String s=reverser(str);
        System.out.println(s);
    }public static String reverser(String str){
        String result="";
        for (int i = str.length()-1; i >=0; i--) {
            char c=str.charAt(i);
            result=result+c;
        };return result;
    }

}
