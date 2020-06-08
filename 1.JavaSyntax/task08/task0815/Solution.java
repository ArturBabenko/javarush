package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Фамилия", "Имя");
        map.put("Фамилия2", "Имя1");
        map.put("Фамилия1", "Имя");
        map.put("Фамилия88", "Имя3");
        map.put("Фамилия3", "Имя");
        map.put("Фамилия9", "Имя2");
        map.put("Фамилия0", "Имя1");
        map.put("Фамилия31", "Имя");
        map.put("Фамилия6", "Имя");
        map.put("Фамилия4", "Имя3");

    return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String key) {
        int countK = 0;

        for (Map.Entry<String, String> pair : map.entrySet()) {
            if (key.equals(pair.getValue())) {
                countK++;
            }
        }
        return countK;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String value) {
        int countV = 0;
        for (Map.Entry<String, String> pair : map.entrySet()) {
            if (value.equals(pair.getKey())) {
                countV++;
            }
        }
        return countV;


    }

    public static void main(String[] args) {

    }
}