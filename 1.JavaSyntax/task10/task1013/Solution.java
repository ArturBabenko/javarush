package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String name;
        private int age;
        private boolean sex;
        private int h;
        private int w;
        private int id;

        public Human(String name) {
            this.name = name;
        }

        public Human(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Human(String name, int age, boolean sex) {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }

        public Human(String name, int age, boolean sex, int h) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.h = h;
        }

        public Human(String name, int age, boolean sex, int h, int w) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.h = h;
            this.w = w;
        }

        public Human(String name, int age, boolean sex, int h, int w, int id) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.h = h;
            this.w = w;
            this.id = id;
        }

        public Human(String name, boolean sex) {
            this.name = name;
            this.sex = sex;
        }

        public Human(int age, boolean sex, int w) {
            this.age = age;
            this.sex = sex;
            this.w = w;
        }

        public Human(int h, int w, int id) {
            this.h = h;
            this.w = w;
            this.id = id;
        }

        public Human(String name, boolean sex, int w) {
            this.name = name;
            this.sex = sex;
            this.w = w;
        }
    }
}
