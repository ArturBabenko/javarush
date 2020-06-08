package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая длинная строка
*/

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        strings = new ArrayList<String>();
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            strings.add(input.readLine());
        }
        String max = strings.get(0);
        for (int j = 1; j < strings.size(); j++) {
            if (max.length() < strings.get(j).length())
                max = strings.get(j);
        }
        for (int j = 0; j < strings.size(); j++) {
            if (max.length() == strings.get(j).length())
                System.out.println(strings.get(j));
        }


    }
}
