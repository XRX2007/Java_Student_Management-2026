package com.itheima.ooppolymorphic4;

public class Cat extends Animal{
    public Cat() {
    }

    public Cat(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String something) {
        System.out.println("猫吃"+something);
    }
    public void catchMouse(){
        System.out.println("猫会逮老鼠");
    }
}
