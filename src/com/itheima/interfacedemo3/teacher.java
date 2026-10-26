package com.itheima.interfacedemo3;

public abstract class teacher extends Person{
    public teacher() {
    }

    public teacher(String name, int age) {
        super(name, age);
    }

    public abstract void teach();
}
