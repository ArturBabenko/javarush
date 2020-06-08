package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(input.readLine());
        int b = Integer.parseInt(input.readLine());
        int c = Integer.parseInt(input.readLine());

        if ((a > 0) && (b > 0) && (c > 0)) {
            if ( a < (b + c) && b < (a + c) && c < (a + b)) {
                System.out.println("Треугольник существует.");
            }
            else {
                System.out.println("Треугольник не существует.");
            }
        }
        else {
            System.out.println("Треугольник не существует.");
        }

    }
}