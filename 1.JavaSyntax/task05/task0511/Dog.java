package com.javarush.task.task05.task0511;

/* 
Создать класс Dog
*/

public class Dog {
    String name, color;
    int height;

    public void initialize(String name){
        this.name = name;
    }
    public void initialize(String name, int height) {
        this.name = name;
        this.height = 30;
    }
    public void initialize(String name, int height, String color) {
        this.name = name;
        this.height = 40;
        this.color = "black";
    }



    public static void main(String[] args) {

    }
}
