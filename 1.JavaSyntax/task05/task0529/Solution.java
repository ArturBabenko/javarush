package com.javarush.task.task05.task0529;

/* 
Консоль-копилка
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        while (true){
            String s = input.readLine();
            if (s.equals("сумма")) break;
            sum = sum + Integer.parseInt(s);

        }
        System.out.println(sum);
    }
}
