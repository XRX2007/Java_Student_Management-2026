package com.itheima.work6;

public class Test2 {
    //定义一个方法自己实现toBinaryString,将十进制整数转成字符串表示的二进制
    public static void main(String[] args) {
        System.out.println(toBinaryString(6));
    }

    public static String toBinaryString(int num) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (num == 0) {
                break;
            }
            int r = num % 2;
            sb.insert(0, r);
            num /= 2;
        }
        return sb.toString();
    }
}