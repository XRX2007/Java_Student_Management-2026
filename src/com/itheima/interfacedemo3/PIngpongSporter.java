package com.itheima.interfacedemo3;

public class PIngpongSporter extends Sporter implements English{
    public PIngpongSporter() {
    }

    public PIngpongSporter(String name, int age) {
        super(name, age);
    }

    @Override
    public void speakEnglish() {
        System.out.println("乒乓球运动员在说英语");
    }

    @Override
    public void study() {
        System.out.println("乒乓球运动员在学习如何打乒乓球");
    }
}
