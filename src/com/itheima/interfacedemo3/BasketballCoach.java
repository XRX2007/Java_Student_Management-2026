package com.itheima.interfacedemo3;

public class BasketballCoach extends teacher{
    public BasketballCoach() {
    }

    public BasketballCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("篮球教练在教如何打篮球");
    }
}
