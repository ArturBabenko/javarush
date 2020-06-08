package com.javarush.task.task07.task0709;

/* 
Выражаемся покороче
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> lists = new ArrayList<String>();
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            lists.add(input.readLine());
        }
        int min = lists.get(0).length();
        for (int j = 1; j < lists.size(); j++) {
            if (min > lists.get(j).length()) min = lists.get(j).length();
        }
        for (int k = 0; k < lists.size(); k++) {
            if (min == lists.get(k).length()) System.out.println(lists.get(k));
        }

    }
}
