package com.itheima.work1;
import java.util.Scanner;
public class Test9 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int money;
        while (true) {
            System.out.println("请输入一个金额");
            money=sc.nextInt();
            if(money>=0&&money<=9999999){
                break;
            }else{
                System.out.println("金额无效");
            }
        }

        //2.得到money里面的每一位数字
        String moneyStr="";
        while (true) {
            int ge=money%10;
            String capitalNumber=getCapitalNumber(ge);
            moneyStr=capitalNumber+moneyStr;
            money=money/10;
            if(money==0){
                break;
            }
        }System.out.println(moneyStr);
        //3.在前面补0，补齐7位
        int count=7-moneyStr.length();
        for(int i=0;i<count;i++){
            moneyStr="零"+moneyStr;
        }
        System.out.println(moneyStr);
        //4.插入单位
        String result="";
        String[] arr={"佰","拾","万","仟","佰","拾","元"};
        for (int i = 0; i < moneyStr.length(); i++) {
            char c=moneyStr.charAt(i);
            result=result+c+arr[i];

        }System.out.println(result);
    }


    //1.定义方法把数字变成中文
    public static String getCapitalNumber(int number){
        String[] arr={"零","壹","贰","叁","肆","伍","陆","柒","捌","玖",};
        return arr[number];
    }

}
