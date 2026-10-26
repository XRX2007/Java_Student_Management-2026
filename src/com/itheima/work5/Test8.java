package com.itheima.work5;
//Object
public class Test8 {
    public static void main(String[] args){
        /*toString
        Object obj=new Object();
        String str1=obj.toString();
        System.out.println(str1);
        Student stu=new Student("zhangsan",23);
        String str2=stu.toString();
        System.out.println(str2);
        System.out.println(stu);

         */
        //equals
        Student stu1=new Student("zhangsan",23);
        Student stu2=new Student("zhangsan",23);
        boolean result1=stu1.equals(stu2);
        System.out.println(result1);
    }
}
