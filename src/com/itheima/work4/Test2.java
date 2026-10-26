package com.itheima.work4;
import java.util.Random;
public class Test2 {
    public static void main(String[] args){
        char[] arr=new char[52];

        for (int i = 0; i < 26; i++) {
            arr[i]=(char)('a'+i);
        }
        for (int i = 26; i < arr.length; i++) {
            arr[i]=(char)('A'+i-26);
        }
        Random r=new Random();
        String result="";
        for (int i = 0; i < 4; i++) {
            char randomIndex=arr[r.nextInt(arr.length)];
            result=result+randomIndex;
        }
        int num1=r.nextInt(10);
        result=result+num1;
        System.out.println(result);

    }
}
