package com.atguigu.boot.bean;

public class Pet {
    private String name;

    public Pet(){}

    public Pet(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setNname(String name){
        this.name = name;
    }

    public String toString(){
        return "pet" + "name" + name + '\'';
    }
}
