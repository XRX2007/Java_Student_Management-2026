package com.itheima.work2;
import java.util.Random;
public class Test5 {
    public static void main(String[] args){
        char[] letterarr=new char[52];
        for (int i = 0; i < 26; i++) {
            letterarr[i]=(char)('a'+i);
        }
        for (int i =26 ; i < letterarr.length; i++) {
            letterarr[i]=(char)('A'+(i-26));
        }
        Random r=new Random();
        char[] arr=new char[5];
        for (int i = 0; i < arr.length-1; i++) {
            int a=r.nextInt(52);
            arr[i]=letterarr[a];
        }
        int num=r.nextInt(10);
        arr[4]=(char)(num+'0');
        int b=r.nextInt(5);
        char temp=arr[4];
        arr[4]=arr[b];
        arr[b]=temp;
        String str=new String(arr);
        System.out.println(str);
    }
}
