package com.itheima.work2;

public class Test6 {
    public static void main(String[] args){
        String num1="123456789";
        String num2="12345";
        int sum1=change(num1);
        int sum2=change(num2);
        int sum=sum1*sum2;
        String str=sum+"";
        System.out.println(str);
    }
    public static int change(String num) {
        int sum = 0;
        for (int i = 0; i < num.length(); i++) {
            char c = num.charAt(i);
            int temp = c - '0';
            sum = sum * 10 + temp;
        }
        return sum;
    }
}
