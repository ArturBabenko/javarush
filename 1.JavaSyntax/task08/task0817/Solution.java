package com.javarush.task.task08.task0817;

import java.util.*;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("фамилия", "имя1");
        map.put("фамилия1", "имя");
        map.put("фамилия2", "имя1");
        map.put("фамилия3", "имя");
        map.put("фамилия4", "имя3");
        map.put("фамилия5", "имя3");
        map.put("фамилия6", "имя");
        map.put("фамилия7", "имя4");
        map.put("фамилия8", "имя");
        map.put("фамилия9", "имя4");

        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {

        ArrayList<String> values = new ArrayList<String>();
        ArrayList<String> valuesDuplicates = new ArrayList<String>();

        Iterator<String> iterator = map.values().iterator();

        while (iterator.hasNext()) {

            String nameCheckDupl = iterator.next();

            if (values.contains(nameCheckDupl)) {

                valuesDuplicates.add(nameCheckDupl);

            } else {

                values.add(nameCheckDupl);

            }

        }

        //System.out.println(map); //вывод на экран для проверки

        for (int j = 0; j < valuesDuplicates.size(); j++) {

            String val = valuesDuplicates.get(j);

            removeItemFromMapByValue(map, val);

        }

        //System.out.println(map); //вывод на экран для проверки

    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {

    }
}
