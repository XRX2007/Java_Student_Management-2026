package com.itheima.work6;

import java.time.LocalDate;

public class Test3 {
    public static void main(String[] args){
        //判断任意一个年份是闰年还是平年
        LocalDate ld=LocalDate.of(2000,3,1);
        LocalDate ld1=ld.minusDays(1);
        int day=ld1.getDayOfMonth();
        System.out.println(day);
        if(day==29){
            System.out.println("闰年");
        }else{
            System.out.println("平年");
        }
        System.out.println(ld.isLeapYear());
    }
}
