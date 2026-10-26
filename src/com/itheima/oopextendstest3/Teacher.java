package com.itheima.oopextendstest3;

public class Teacher extends Person{
    String subject;

    public Teacher() {
        System.out.println("子类Teacher的空参构造执行了");
    }



    public Teacher(String name, int age, String subject) {
        System.out.println("子类Teacher的带参构造执行了");
        super(name, age);
        this.subject = subject;
    }
}
