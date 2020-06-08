package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(input.readLine());
        int b = Integer.parseInt(input.readLine());
        int c = Integer.parseInt(input.readLine());

        if (a > 0 && b > 0 && c > 0) System.out.println(3);
        if (a <= 0 && b <= 0 && c <= 0) System.out.println(0);
        if (a > 0 && b <= 0 && c <= 0) System.out.println(1);
        if (a <= 0 && b > 0 && c <= 0) System.out.println(1);
        if (a <= 0 && b <= 0 && c > 0) System.out.println(1);
        if (a > 0 && b > 0 && c <= 0) System.out.println(2);
        if (a <= 0 && b > 0 && c > 0) System.out.println(2);
        if (a > 0 && b <= 0 && c > 0) System.out.println(2);


    }
}
