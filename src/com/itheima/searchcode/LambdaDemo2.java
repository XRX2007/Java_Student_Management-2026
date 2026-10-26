package com.itheima.searchcode;

public class LambdaDemo2 {
    public static void main(String[] args){
        method(new Swim() {
            @Override
            public void swimming() {
                System.out.println("正在游泳");
            }
        });
        //利用lambda改写(只有函数式接口才可以用匿名内部类改写（只有一个抽象方法的接口）
        method(()->{
                System.out.println("正在游泳");
            }
        );

    }
    public static void method(Swim s){
        s.swimming();
    }
}
interface Swim{
    public abstract void swimming();
}
