package com.javarush.task.task07.task0705;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = new int[20];
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < array.length ; i++) {
            array[i] = Integer.parseInt(input.readLine());
        }
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        for (int j = 0; j < arr1.length; j++) {
            arr1[j] = array[j];
        }
        for (int l = 0; l < arr2.length; l++) {
            arr2[l] = array[10+l];
        }
        for (int k = 0; k < arr2.length; k++) {
            System.out.println(arr2[k]);
        }
    }
}
