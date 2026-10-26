package com.itheima.work1;

public class Test12 {
    public static void main(String[] args){
        String talk="你玩的真好，下次别玩了，TMD,CNM";
        String[] arr={"TMD","CNM","MLGB"};
        for (int i = 0; i < arr.length; i++) {
            talk=talk.replace(arr[i],"***");
        }

        System.out.println(talk);
    }

}
