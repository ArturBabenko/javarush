package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<Human> list = new ArrayList<>();
        list.add(new Human("Ded1", true, 11));
        list.add(new Human("Baba1", false, 22));
        list.add(new Human("Ded2", true, 33));
        list.add(new Human("Baba2", false, 44));
        list.add(new Human("Papik", true, 55, list.get(0),list.get(1)));
        list.add(new Human("Mamik", false, 55, list.get(2),list.get(3)));
        list.add(new Human("Kid1", false, 66, list.get(4),list.get(5)));
        list.add(new Human("Kid2", false, 77, list.get(4),list.get(5)));
        list.add(new Human("Kid3", false, 88, list.get(4),list.get(5)));

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}