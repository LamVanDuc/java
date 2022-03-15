package com.example.app;
import com.example.entities.Animal;
import com.example.entities.Cat;
import com.example.entities.Dog;
public class AppLication {
    public static void main(String[] args){
        Animal cat = new Cat();

        Cat cat2 = new Cat("hoang van" ,19  );

        System.out.println("Name : "+cat2.getName() + "\n age : "+cat2.getAge() +"\nDescription : "+ cat2.Description()+ "\n --------------------------------");
        System.out.println("Name : "+cat.getName() + "\n age : "+cat.getAge() +"\nDescription : "+ cat.Description()+ "\n --------------------------------");
    }
}
