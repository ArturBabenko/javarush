package com.javarush.task.task07.task0702;

/* 
Массив из строчек в обратном порядке
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.function.BiFunction;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String[] lists = new String[10];

        for (int i = 0; i < 8; i++) {
            lists[i] = input.readLine();
        }
        for (int j = 9; j >=0; j--) {
            System.out.println(lists[j]);
        }


    }
}