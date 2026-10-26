package com.itheima.work6;

import java.math.BigDecimal;

public class BigDecimal1 {
    public static void main(String[] args){
        //构造double 类型的方法
        BigDecimal bd1=new BigDecimal(0.01);
        BigDecimal bd2=new BigDecimal(0.09);
        System.out.println(bd1);
        System.out.println(bd2);
        //构造字符串类型的方法
        BigDecimal bd3=new BigDecimal("0.01");
        BigDecimal bd4=new BigDecimal("0.09");
        BigDecimal bd5=bd3.add(bd4);
        System.out.println(bd3);
        System.out.println(bd4);
        System.out.println(bd5);
        //通过静态方法获取对象
        BigDecimal bd6=BigDecimal.valueOf(10.0);
        BigDecimal bd7=BigDecimal.valueOf(10.0);
        System.out.println(bd6==bd7);
    }
}
