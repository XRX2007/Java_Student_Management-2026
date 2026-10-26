package com.itheima.work1;
import java.util.Random;
public class Test1 {
    public static void main(String[] args){
        int[] arr=new int[10];
        Random r=new Random();
        for (int i = 0; i < arr.length; i++) {
            int num=r.nextInt(100)+1;
            arr[i]=num;
        }
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println(sum);
        int avg=sum/arr.length;
        System.out.println(avg);
        int cnt=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<avg){
                cnt++;
            }
        }
        System.out.println(cnt);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+",");
        }
    }
}
