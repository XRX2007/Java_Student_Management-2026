package com.itheima.work6;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class A05_LocalDateTimeDemo {
    public static void main(String[] args){
        LocalDateTime nowDateTime=LocalDateTime.now();
        System.out.println(nowDateTime);
        LocalDateTime localDateTime = LocalDateTime.of(2026, 10, 1, 12, 30, 00, 0);
        System.out.println(localDateTime);
        System.out.println(nowDateTime.getYear());
        System.out.println(nowDateTime.getDayOfYear());
        System.out.println(nowDateTime.getDayOfMonth());
        System.out.println(nowDateTime.getDayOfWeek());
        System.out.println(nowDateTime.getDayOfWeek().getValue());
        LocalDate li1=nowDateTime.toLocalDate();
        System.out.println(li1);
        System.out.println(li1.getYear());
        LocalTime lt1=nowDateTime.toLocalTime();
        System.out.println(lt1);
        System.out.println(lt1.getHour());

    }
}
