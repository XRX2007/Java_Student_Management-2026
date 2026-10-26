package com.itheima.work4;

public class Test4 {
    public static void main(String[] args){
        //找101到201中的质数，并输出有多少个
        int count=0;
        for(int i=101;i<=201;i++){
            boolean flag=true;
            for(int j=2;j<100;j++){
                if(i%j==0){
                    flag=false;
                    break;
                }
            }
            if(flag){
                System.out.println(i+"为质数");
                count++;
            }else{
                System.out.println("当前的数不是质数");
            }
        }
        System.out.println(count);

    }
}
