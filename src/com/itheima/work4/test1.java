package com.itheima.work4;

import java.util.Scanner;
public class test1{
    public static void main(String[] args){

        int[] arr=getScores();

        double avg=getavg(arr);
        System.out.println(avg);
    }
    public static double getavg(int[] arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        int max=getmax(arr);
        int min=getmin(arr);
        sum=sum-max-min;
        double avg=sum/(arr.length-2);
        return avg;
    }public static int getmax(int[] arr){
        int max=arr[0];
        for (int i = 1; i <arr.length ; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }return max;
    }public static int getmin(int[] arr){
        int min=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<min){
                min=arr[i];
            }
        }return min;
    }
    public static int[] getScores(){
        int[] arr=new int[6];
        Scanner sc=new Scanner(System.in);

        for (int i = 0; i < arr.length;) {
            System.out.println("请输入数字");
            int num=sc.nextInt();

            if(num>=0&&num<=100){
                arr[i]=num;
                i++;
            }else{
                System.out.println("请重新输入，当前数组内有"+i);
            }

        }return arr;


    }

}
