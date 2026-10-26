package com.itheima.work6;

import java.util.ArrayList;
import java.util.Scanner;

public class Test1 {
    //键盘录入1-100之间的整数，并添加到集合中，知道集合中所有数据和超过200为止
    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        while(true) {
            System.out.println("请输入一个数字");
            String str= sc.nextLine();
            int num=Integer.parseInt(str);
            if(num<1||num>100){
                System.out.println("当前数字不在1-100的范围中，请重新输入");
                continue;
            }
            list.add(num);
            int sum=getSum(list);
            if(sum>200){
                System.out.println("集合中的数以满足要求");
                break;
            }
        }
    }
    public static int getSum(ArrayList<Integer> list){
        int sum=0;
        for (int i = 0; i < list.size(); i++) {
            int num=list.get(i);
            sum+=num;
        }return sum;
    }
}
