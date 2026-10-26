package com.itheima.work6;
import java.time.ZoneId;
import java.time.Instant;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class A04_DateTimeFormatter {
    public static void main(String[] args){
        //获取时间对象
        ZonedDateTime time=Instant.now().atZone(ZoneId.of("Asia/Shanghai"));
        //格式化
        DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss EE a");
        System.out.println(dtf1.format(time));
    }
}
