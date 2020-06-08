package com.javarush.task.task04.task0425;

/* 
Цель установлена!
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(input.readLine());
        int b = Integer.parseInt(input.readLine());
        int c;

        if (a>0 && b>0){
            System.out.println(c=1);
        }
        if (a<0 && b>0){
            System.out.println(c=2);
        }
        if (a<0 && b<0){
            System.out.println(c=3);
        }
        if (a>0 && b<0){
            System.out.println(c=4);
        }
    }
}
