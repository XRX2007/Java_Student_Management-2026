package com.itheima.work4;
import java.util.Scanner;
public class Test3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入机票原价");
        int  price=sc.nextInt();
        System.out.println("请输入月份");
        int month=sc.nextInt();
        System.out.println("请输入 0 头等舱或1 经济舱");
        int seat=sc.nextInt();
        if(month>=5&&month<=10){
            price = getPrice(seat, price, 0.9, 0.85);
        }else if(month>=11&&month<=12 || month>=1&&month<=4){
            price = getPrice(seat, price, 0.7, 0.65);
        }else{
            System.out.println("当前输入不合法");
        }
        System.out.println(price);
    }

    private static int getPrice(int seat, int price, double x, double x1) {
        if (seat == 0) {
            price = (int) (price * x);
        } else if (seat == 1) {
            price = (int) (price * x1);
        } else {
            System.out.println("没有这个舱位");
        }
        return price;
    }


}
