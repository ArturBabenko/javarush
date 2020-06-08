package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(input.readLine());

        if (number > 0) {
            number *=2;
            System.out.println(number);
        }
        if (number < 0) {
            number += 1;
            if (number != 0) {
                System.out.println(number);
            }
        }
        if (number == 0) {
            System.out.println(number);
        }
    }

}