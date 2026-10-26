package com.itheima.work6;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class A02_InstantDemo {
    public static void main(String[] args){
        //1.获取当前时间的Instant对象
        Instant now=Instant.now();
        System.out.println(now);
        //2.根据（秒/毫秒/纳秒）获取对象
        Instant instant1=Instant.ofEpochMilli(0L);
        System.out.println(instant1);
        Instant instant2=Instant.ofEpochSecond(1L);
        System.out.println(instant2);
        Instant instant3=Instant.ofEpochSecond(1L,1000000000L);
        System.out.println(instant3);
        //3.指定时区
        ZonedDateTime time=Instant.now().atZone(ZoneId.of("Asia/Shanghai"));
        System.out.println(time);
        //4.isXxx的判断
        Instant instant4=Instant.ofEpochMilli(0L);
        Instant instant5=Instant.ofEpochMilli(1000L);
        boolean result1 = instant4.isAfter(instant5);
        System.out.println(result1);
        boolean result2 = instant4.isBefore(instant5);
        System.out.println(result2);
        //5.用于时间的判断
        Instant instant6 = Instant.ofEpochMilli(3000L);
        //减少时间
        Instant instant7=instant6.minusMillis(1000L);
        System.out.println(instant7);
        //增加时间
        Instant instant8=instant6.plusSeconds(1L);
        System.out.println(instant8);

    }
}
