package com.itheima.oopextendsTest1;

public class ThirdPhone extends SecondPhone{
    @Override
    public void call() {
        System.out.println("手机可以打视频通话");
    }
    public void game(){
        System.out.println("手机可以玩游戏");
    }
}
