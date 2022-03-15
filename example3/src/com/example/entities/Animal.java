package com.example.entities;

public abstract class Animal {
    private String name;
    private int age;



    public Animal(){}
    public Animal(String name , int age){
        this.name = name;
        this.age = age;

    }
    public Animal(String name){
        this.name = name;
    }
    public Animal(int age){
        this.age = age;
    }

    public void setName(String value){
        this.name = value;
    }

    public String getName(){
        return this.name;
    }

    public void setAge(int value){
        this.age = value;
    }
    public int getAge(){
        return this.age;
    }

    public abstract String Description();
}
