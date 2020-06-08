package com.javarush.task.task07.task0704;

/* 
Переверни массив
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[10];
        int number;
        for (int i = 0; i <10; i++) {
            number = Integer.parseInt(input.readLine());
            array[i] = number;
        }
        for (int j = 9; j >= 0; j--) {
            System.out.println(array[j]);
        }
    }
}

