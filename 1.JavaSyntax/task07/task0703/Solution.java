package com.javarush.task.task07.task0703;

/* 
Общение одиноких массивов
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] str = new String[10];
        int[] numb = new int[10];
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < str.length; i++) {
            str[i] = input.readLine();
        }
        for (int j = 0; j < numb.length; j++) {
            numb[j] = str[j].length();
            System.out.println(numb[j]);
        }

    }
}
