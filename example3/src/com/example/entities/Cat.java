package com.example.entities;

public class Cat extends Animal{
    public Cat(){
        super();
    }
    public Cat(String name , int age){
        super(name , age );
    }
    public Cat(String name){
        super(name);
    }
    public Cat(int age){
        super(age);
    }

    @Override
    public String Description(){
        return "Con meo buong nhat he mat troi";
    }

}
