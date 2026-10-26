package com.itheima.ooppolymorphic;

public class Person {
    private String name;
    private String username;
    private String password;
    public Person(){

    }
    public Person(String name,String username,String password){
        this.name=name;
        this.username=username;
        this.password=password;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setUsername(String username){
        this.username=username;
    }
    public String getUsername(){
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public void work(){
        System.out.println("每个人都需要工作");
    }
}
