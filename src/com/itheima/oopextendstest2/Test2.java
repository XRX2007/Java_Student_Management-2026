package com.itheima.oopextendstest2;

import java.net.SocketTimeoutException;

public class Test2 {
    public static void main(String[] args){
         Phone p1=new Phone();
         p1.name="小米";
         double payment1=p1.sell(3000);
         System.out.println(p1.name);
        System.out.println(payment1);
         Laptop l1=new Laptop();
         l1.name="联想";
        double payment2=l1.sell(6000);
        System.out.println(l1.name);
        System.out.println(payment2);
         Pad p2=new Pad();
         p2.name="apple";
        double payment3=p2.sell(5000);
        System.out.println(p2.name);
        System.out.println(payment3);
    }
}
