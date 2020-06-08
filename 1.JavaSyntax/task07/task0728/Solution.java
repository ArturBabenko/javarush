package com.javarush.task.task07.task0728;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

/* 
В убывающем порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        for (int x : array) {
            System.out.println(x);
        }
    }

    public static void sort(int[] array) {
        Arrays.sort(array);
            int[] reverseArr = new int[array.length];
            int j =0;
            for (int i = array.length-1; i >=0; i--) {
                reverseArr[j] = array[i];
                j++;
            }
            for (int k = 0; k < array.length; k++) {
            array[k] = reverseArr[k];
        }

        }

}
