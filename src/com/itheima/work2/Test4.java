package com.itheima.work2;
import java.util.Random;
public class Test4 {
    public static void main(String[] args){
        String str="abcdefgth";
        char[] arr=str.toCharArray();
        Random r=new Random();
        for (int i = 0; i < arr.length; i++) {
            int a=r.nextInt(arr.length);
            char temp=arr[i];
            arr[i]=arr[a];
            arr[a]=temp;
        }
        String result=new String(arr);
        System.out.println(arr);
    }
}
