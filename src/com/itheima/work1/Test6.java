package com.itheima.work1;
import java.util.Scanner;
public class Test6 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str=sc.next();
        int bigcount=0;
        int smallcount=0;
        int numbercount=0;
        int elsecount=0;
        for (int i = 0; i < str.length(); i++) {
            char c=str.charAt(i);
            if(c>='a'&&c<='z'){
                smallcount++;
            }else if(c>='A'&&c<='Z'){
                bigcount++;
            }else if(c>='0'&&c<='9'){
                numbercount++;
            }else{
                elsecount++;
            }
        }
        System.out.println(bigcount);
        System.out.println(smallcount);
        System.out.println(numbercount);
        System.out.println(elsecount);
    }
}
