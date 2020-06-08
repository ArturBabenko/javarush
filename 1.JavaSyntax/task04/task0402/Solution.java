package com.javarush.task.task04.task0402;

/* 
Цена яблок
*/

public class Solution {
    public static void main(String[] args) {
        Apple apple = new Apple();  // 1 создаеться обьект Apple и присвается ссылка переменной apple
        apple.addPrice(50); // 4 вызывается Статический метод addPrice с параметром (50)
                                        // идет расчет метода
        Apple apple2 = new Apple(); // 7 создаеться обьект Apple и присвается ссылка переменной apple2
        apple2.addPrice(100); // 8 вызывается Статический метод addPrice с параметром (100)
        System.out.println("Стоимость яблок " + Apple.applesPrice); // выводится на экран текст +
                                            // последнее присвоеное значение Apple.applesPrice ком. 9
    }

    public static class Apple { // 2 создается класс Apple
        public static int applesPrice = 0; // 3 переменной присваеивается значение

        public static void addPrice(int applesPrice) { // 5 создается метод addPrice с одним параметром (int)
            Apple.applesPrice = Apple.applesPrice + applesPrice; // 6 то что нужно вывести в sout
            // переменной applesPrice из Класа Apple присваивается =  выше присвеоенному значению + параметр 50 (ком. 4)
            // фактически  Apple.applesPrice = 0 + 50
            // 9 то что нужно вывести в sout. переменной applesPrice из Класа Apple присваивается
            // то что было присвоено выше (50) + параметр 100 (ком. 8)
            // фактически  Apple.applesPrice = 50 + 100

        }
    }
}
