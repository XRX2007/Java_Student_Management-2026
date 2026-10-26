package com.itheima.oopextendsTest1;

public class Test1 {
    public static void main(String[] args){
        FirstPhone phone1=new FirstPhone();
        phone1.call();
        SecondPhone phone2=new SecondPhone();
        phone2.call();
        phone2.message();
        ThirdPhone phone3=new ThirdPhone();
        phone3.call();
        phone3.message();
        phone3.game();
    }

}
