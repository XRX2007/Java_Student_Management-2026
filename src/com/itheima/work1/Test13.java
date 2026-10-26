package com.itheima.work1;
import java.util.Scanner;
public class Test13 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str=sc.next();
        String s=new StringBuilder().append(str).reverse().toString();
        if(str.equals(s)){
            System.out.println("当前字符是对称字符");
        }else{
            System.out.println("当前字符不是对称字符");
        }

    }
}
