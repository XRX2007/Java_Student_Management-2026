package com.itheima.work6;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class A06_ChronoUnitDemo {
    public static void main(String[] args){
        //当前时间
        LocalDateTime today=LocalDateTime.now();
        System.out.println(today);
        //生日时间
        LocalDateTime birthday=LocalDateTime.of(2007,8,25,19,30,0,0);
        System.out.println(birthday);

        System.out.println(ChronoUnit.YEARS.between(birthday,today));
        System.out.println(ChronoUnit.CENTURIES.between(birthday,today));
        System.out.println(ChronoUnit.SECONDS.between(birthday,today));
    }
}
