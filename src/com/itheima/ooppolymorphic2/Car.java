package com.itheima.ooppolymorphic2;

public class Car extends Vehicle{
    public Car() {
    }

    public Car(String brand, double speed) {
        super(brand, speed);
    }

    @Override
    public void move() {
        System.out.println(getBrand()+"的汽车，正在以"+getSpeed()+"每秒的速度移动");
    }
    public void hook(){
        System.out.println("叭~叭~叭~");
    }
}
