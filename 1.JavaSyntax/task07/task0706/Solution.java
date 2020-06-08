package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        int[] array = new int[15];
        int countp = 0;
        int countn = 0;
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(input.readLine());
        }

        for (int j = 0; j < array.length; j+=2) {
            countp = countp + array[j];
        }
        for (int k = 1; k < array.length; k+=2) {
            countn = countn + array[k];
        }
        System.out.println(countp > countn ? "В домах с четными номерами проживает больше жителей."
                : "В домах с нечетными номерами проживает больше жителей.");
    }

}
