package com.javarush.task.task05.task0532;

/* 
Задача по алгоритмам
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = Integer.MIN_VALUE;
        int sum = Integer.parseInt(reader.readLine());


        if (sum > 0) {
            for (int i = 1; i <= sum; i++) {
                int numbers = Integer.parseInt(reader.readLine());
                if (i == 0) maximum = numbers;
                if (numbers > maximum) maximum = numbers;
            }

        }


        if (sum > 0) System.out.println(maximum);
    }
}
