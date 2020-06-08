package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> lists = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++) {
        lists.add(Integer.parseInt(reader.readLine()));
        }
        lists.sort(null);
        for (int j = 0; j < lists.size(); j++) {
            System.out.println(lists.get(j));
        }

    }
}
