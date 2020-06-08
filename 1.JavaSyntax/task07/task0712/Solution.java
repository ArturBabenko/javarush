package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> lists = new ArrayList<String>();
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            lists.add(input.readLine());
        }
        int max = lists.get(0).length();
        int min = lists.get(0).length();
        for (int j = 0; j < lists.size(); j++) {
            if (max < lists.get(j).length()) max = lists.get(j).length();
            if (min > lists.get(j).length()) min = lists.get(j).length();
        }
        for (int k = 0; k < lists.size(); k++) {
            if (max == lists.get(k).length() || min == lists.get(k).length()) {
                System.out.println(lists.get(k));
                break;
            }
        }

    }
}
