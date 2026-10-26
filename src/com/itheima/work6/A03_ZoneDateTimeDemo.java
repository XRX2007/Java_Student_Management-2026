package com.itheima.work6;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class A03_ZoneDateTimeDemo {
    public static void main(String[] args){
        //1.获取当前时间对象
        ZonedDateTime now=ZonedDateTime.now();
        System.out.println(now);
        //2.获取指定时间对象
        //年月日时分秒纳秒方式指定
        ZonedDateTime time1=ZonedDateTime.of(2026,10,1,11,12,30,0, ZoneId.of("Asia/Shanghai"));
        System.out.println(time1);
        //通过Instant+时区的方式获取时间对象
        Instant instant= Instant.ofEpochMilli(0L);
        ZoneId zoneId=ZoneId.of("Asia/Shanghai");
        ZonedDateTime time2=ZonedDateTime.ofInstant(instant,zoneId);
        System.out.println(time2);
        //修改时间
        ZonedDateTime time3=time2.withYear(2000);
        System.out.println(time3);
        //减少时间
        ZonedDateTime time4=time2.minusYears(1);
        System.out.println(time4);
        //增加时间
        ZonedDateTime time5=time2.plusYears(4);
        System.out.println(time5);
    }
}
