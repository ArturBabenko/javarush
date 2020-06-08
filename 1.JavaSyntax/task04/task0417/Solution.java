package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(input.readLine());
        int b = Integer.parseInt(input.readLine());
        int c = Integer.parseInt(input.readLine());

        if (a == b && b == c) {
            System.out.println(a + " " + b + " " + c);
        }
        if (a == b && b != c) {
            System.out.println(a + " " + b);
        }
        if (a == c && c != b) {
            System.out.println(a + " " + c);
        }
        if (b == c && a != b){
            System.out.println(b + " " + c);
        }


    }
}