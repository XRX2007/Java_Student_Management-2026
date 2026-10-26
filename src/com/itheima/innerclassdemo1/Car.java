package com.itheima.innerclassdemo1;

public class Car {
    private String carName;
    int carAge;
    String carColor;

    class Engine{
        String engineName;
        int engineAge;
        public void show(){
            System.out.println(engineName);
            System.out.println(carName);
        }
    }
}
