package com.itheima.ooppolymorphic;

public class StudentManger {
    public void register(Person per) {
        System.out.println("姓名为" + per.getName() + "的账户注册成功，账号" + per.getUsername() + "密码为" + per.getPassword());
        per.work();
    }
}
