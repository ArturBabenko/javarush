package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(input.readLine());
        int b = Integer.parseInt(input.readLine());
        int c = Integer.parseInt(input.readLine());
        int d = Integer.parseInt(input.readLine());

        int x = Math.max(a,b);
        int y = Math.max(c,d);
        int z = Math.max(x,y);
        System.out.println(z);

    }
}
