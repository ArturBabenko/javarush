package com.javarush.task.task07.task0715;

/* 
Продолжаем мыть раму
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> lists = new ArrayList<String>();
        lists.add(0, "мама");
        lists.add(1, "мыла");
        lists.add(2, "раму");

        for (int i = 1; i <= 6; i+=2) {
         lists.add(i, "именно");
        }
        for (int j = 0; j < lists.size(); j++) {
            System.out.println(lists.get(j));
        }
    }
}
