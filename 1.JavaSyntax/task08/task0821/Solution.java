package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        Map<String, String> map = new HashMap<>();
        class Person {
            String name;
            String surname;
            public Person(String name, String surname) {
                this.name = name;
                this.surname = surname;
            }
        }
        Person person = new Person("Vasia", "Pupkin");
        Person person1 = new Person("Vasia", "Pupkin2");
        Person person2 = new Person("Vasia2", "Pupkin3");
        Person person3 = new Person("Vasia3", "Pupkin4");
        Person person4 = new Person("Vasia4", "Pupkin5");
        Person person5 = new Person("Vasia", "Pupkin6");
        Person person6 = new Person("Vasia6", "Pupkin7");
        Person person7 = new Person("Vasia7", "Pupkin8");
        Person person8 = new Person("Vasia8", "Pupkin9");
        Person person9 = new Person("Vasia9", "Pupkin");

        String key, key1;
        key = person.name;
        key1 = person1.name;
        map.put(key, person.surname);
        map.put(key1, person1.surname);
        map.put(person2.name, person2.surname);
        map.put(person3.name, person3.surname);
        map.put(person4.name, person4.surname);
        map.put(person5.name, person5.surname);
        map.put(person6.name, person6.surname);
        map.put(person7.name, person7.surname);
        map.put(person8.name, person8.surname);
        map.put(person9.name, person9.surname);



        return map;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
