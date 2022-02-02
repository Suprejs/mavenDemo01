package com.atguigu.boot.bean;

public class User{
    private String name;
    private Integer age;

    public User(){}

    public User(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String toString(){
        return "User" + "name" + name + '\'';
    }
}
