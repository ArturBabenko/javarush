package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(input.readLine());
        int b = Integer.parseInt(input.readLine());
        int c = Integer.parseInt(input.readLine());
        int d = 0, e = 0;

        if (a > 0) d += 1;
        else if (a != 0) e +=1;
        if (b > 0) d += 1;
        else if (b != 0) e +=1;
        if (c > 0) d += 1;
        else if (c != 0) e +=1;
        System.out.println("количество отрицательных чисел: " + e);
        System.out.println("количество положительных чисел: " + d);
    }
}
