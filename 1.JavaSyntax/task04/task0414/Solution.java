package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int years = Integer.parseInt(input.readLine());

        if (years % 400 == 0) System.out.println("количество дней в году: 366");
        else if (years % 100 == 0 ) System.out.println("количество дней в году: 365");
        else if (years % 4 == 0 ) System.out.println("количество дней в году: 366");
        else System.out.println("количество дней в году: 365");


    }
}