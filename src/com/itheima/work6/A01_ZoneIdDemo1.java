package com.itheima.work6;
//ZoneId
import java.time.ZoneId;
import java.util.Set;
public class A01_ZoneIdDemo1 {
    public static void main(String[] args){
        //获取所有的时区名称
        Set<String> zoneIds=ZoneId.getAvailableZoneIds();
        System.out.println(zoneIds);
        System.out.println(zoneIds.size());
        //获取当前系统的默认时区
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);
        //获取指定的时区
        ZoneId zoneId1 = ZoneId.of("America/Marigot");
        System.out.println(zoneId1);
    }
}
