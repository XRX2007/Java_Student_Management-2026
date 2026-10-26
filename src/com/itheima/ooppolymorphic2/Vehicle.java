package com.itheima.ooppolymorphic2;

public class Vehicle {
    private String brand;
    private double speed;
    public Vehicle(){

    }public Vehicle(String brand,double speed){
        this.brand=brand;
        this.speed=speed;
    }
    public void setBrand(String brand){
        this.brand=brand;
    }
    public String getBrand(){
        return brand;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
    public void move(){
        System.out.println(brand+"的交通工具，正在以"+speed+"每秒的速度移动");
    }
}
