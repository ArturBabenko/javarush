package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    String name, address, color;
    int age, weight;

    public void initialize(String name){
        this.name = name;
        this.age = 1;
        this.weight = 2;
        this.color = "Red";
    }

    public void initialize(String name, int weight, int age){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = "Green";
    }

    public void initialize(String name, int age){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    public void initialize(int weight, String color){
        this.age = 3;
        this.weight = weight;
        this.color = color;
    }

    public void initialize(int weight, String color, String address){

        this.age = 2;
        this.weight = weight;
        this.color = color;
        this.address = address;
    }



    public static void main(String[] args) {

    }
}
