package com.itheima.ooppolymorphic4;

public class Dog extends Animal{
    public Dog() {
    }

    public Dog(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String something) {
        System.out.println("狗要吃"+something);
    }
    public void lookHome(){
        System.out.println("狗会看家");
    }
}
