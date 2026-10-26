package com.itheima.mycollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

public class A02_CollectionDemo2 {
    public static void main(String[] args){
        Collection<Student> coll=new ArrayList<>();
        Student s1=new Student("zhangsaan",22);
        Student s2=new Student("lisi",23);
        Student s3=new Student("wangwu",24);
        coll.add(s1);
        coll.add(s2);
        coll.add(s3);
        Student s4=new Student("wangwu",24);
        System.out.println(coll.contains(s4));
    }
}
class Student{
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }


}
