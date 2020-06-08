package com.javarush.task.task04.task0441;

/* 
Как-то средненько
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(input.readLine());
        int b = Integer.parseInt(input.readLine());
        int c = Integer.parseInt(input.readLine());

        int min, max, avv;

        min = Math.min(Math.min(a, b), Math.min(a, c));
        max = Math.max(Math.max(a, b), Math.max(a, c));
        avv = (a+b+c) - (min+max);
        System.out.println(avv);

    }
}
