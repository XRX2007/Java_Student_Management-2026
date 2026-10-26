package com.itheima.interfacedemo5;

public interface InterA {
    public static  void show1(){
        System.out.println("show1方法开始执行了");
        show3();
    }
    public static  void show2(){
        System.out.println("show1方法开始执行了");
        show3();
    }
    private  static void show3(){
        System.out.println("记录细节");
    }
}
