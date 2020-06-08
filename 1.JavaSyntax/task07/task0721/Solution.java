package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum;
        int minimum;
        int[] list2 = new int[20];
        //ArrayList<Integer> lists = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list2[i] = Integer.parseInt(reader.readLine());
        }


        maximum = minimum = list2[0];
        for (int j = 1; j < list2.length; j++) {
            if (maximum < list2[j]) maximum = list2[j];
            if (minimum > list2[j]) minimum = list2[j];
        }

        System.out.print(maximum + " " + minimum);
    }
}
