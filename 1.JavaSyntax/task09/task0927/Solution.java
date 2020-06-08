package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        Map<String, Cat> map = new HashMap<String, Cat>();
        map.put("Kot1", new Cat("Name1"));
        map.put("Kot2", new Cat("Name2"));
        map.put("Kot3", new Cat("Name3"));
        map.put("Kot4", new Cat("Name4"));
        map.put("Kot5", new Cat("Name5"));
        map.put("Kot6", new Cat("Name6"));
        map.put("Kot7", new Cat("Name7"));
        map.put("Kot8", new Cat("Name8"));
        map.put("Kot9", new Cat("Name9"));
        map.put("Kot", new Cat("Name"));
        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {

        HashSet<Cat> set = new HashSet<>(map.values());

        //Set<String> keySet= new HashSet<String>(map.keySet());
        //keySet.forEach(key-> System.out.println(key));

        //Convert Map values to Set
        //Set<Cat> valueSet= new HashSet<Cat>(map.values());
        //valueSet.forEach(value-> System.out.println(value));

        return set;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
