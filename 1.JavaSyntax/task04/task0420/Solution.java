package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(input.readLine());
        int b = Integer.parseInt(input.readLine());
        int c = Integer.parseInt(input.readLine());

        if (a >= b && a >= c) {
            if (b > c) System.out.println(a + " " + b + " " + c);
            else System.out.println(a + " " + c + " " + b);
        }
        if (b > a && b > c) {
            if (a > c) System.out.println(b + " " + a + " " + c);
            else System.out.println(b + " " + c + " " + a);
        }
        if (c >= b && c > a) {
            if (b > a) System.out.println(c + " " + b + " " + a);
            else System.out.println(c + " " + a + " " + b);
        }
    }
}
