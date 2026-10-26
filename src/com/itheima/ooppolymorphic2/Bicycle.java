package com.itheima.ooppolymorphic2;

public class Bicycle extends Vehicle{
    public Bicycle(){

    }
    public Bicycle(String brand,double speed){
        super(brand,speed);
    }

    @Override
    public void move() {
        System.out.println(getBrand()+"的自行车，正在以"+getSpeed()+"每秒的速度移动");
    }
    public void ringBell(){
        System.out.println("铃~铃~铃~");
    }
}
