package com.itheima.work5;

public class Test4 {
    public static void main(String[] args){
        //参数绝对值
        System.out.println(Math.abs(88));
        System.out.println(Math.abs(-2147483648));
        //向上取整
        System.out.println(Math.ceil(12.34));
        //向下取整
        System.out.println(Math.floor(-14.5));
        //四舍五入
        System.out.println(Math.round(12.54));
        //求最大值
        System.out.println(Math.max(20,30));
        //求最小值
        System.out.println(Math.min(20,30));
        //a的b次幂
        System.out.println(Math.pow(4,2));
        System.out.println(Math.sqrt(4));
        System.out.println(Math.cbrt(8));
        //求随机数
        System.out.println(Math.floor(Math.random()*100)+1);
    }
}
