package com.itheima.mygenerics;

import java.util.ArrayList;

public class GenericsDemo7 {
    public static void main(String[] args){
        ArrayList<PersiantCat> list1=new ArrayList<>();
        ArrayList<LiHuaCat> list2=new ArrayList<>();
        ArrayList<TeddyDog> list3=new ArrayList<>();
        ArrayList<HuskDog> list4=new ArrayList<>();
        list1.add(new PersiantCat("小红",2));
        keepPet(list1);
        keepPet(list2);
        keepPet(list3);
        keepPet(list4);
    }
    /*public static void keepPet(ArrayList<? extends Cat> list){
    }*/
    /*public static void keepPet(ArrayList<? extends Dog> list){
    }*/
    public static void keepPet(ArrayList<? extends Animal> list){
        for(Animal a:list){
            a.eat();
        }
    }
}
