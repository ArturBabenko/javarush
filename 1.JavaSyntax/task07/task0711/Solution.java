package com.javarush.task.task07.task0711;

/* 
Удалить и вставить
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
        for (int j = 0; j < 13; j++) {
            lists.add(0, lists.get(4));
            lists.remove(5);
       }
        for (int k = 0; k < 5; k++) {
            System.out.println(lists.get(k));
        }

    }
}
