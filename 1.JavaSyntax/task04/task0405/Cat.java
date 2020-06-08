package com.javarush.task.task04.task0405;

/* 
Задаем количество котов
*/

import org.w3c.dom.ls.LSOutput;

public class Cat {
    private static int catsCount = 1;

    public static void setCatsCount(int catsCount) {
        //напишите тут ваш код

        Cat.catsCount = catsCount;
        System.out.println(catsCount);
    }

    public static void main(String[] args) {

    }
}
