package com.itheima.oopextendstest3;

public class Test3 {
    public static void main(String[] args){
        Student stu=new Student("小红",18,"大二");
        System.out.println(stu.name+","+stu.age+","+stu.grade);
        Teacher tea=new Teacher("李老师",45,"语文");
        System.out.println(tea.name+","+tea.age+","+tea.subject);
    }

}
