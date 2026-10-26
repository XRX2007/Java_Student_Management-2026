package com.itheima.interfacedemo3;


public class Test1 {
    public static void main(String[] args){
        PIngpongSporter ps=new PIngpongSporter("malong",26);
        System.out.println(ps.getName()+","+ps.getAge());
        ps.study();
        ps.speakEnglish();
    }

}
