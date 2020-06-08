package com.javarush.task.task04.task0442;

/* 
Суммирование
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int m = 0;
        while (true) {
            int i = Integer.parseInt(input.readLine());
            m+=i;
            if (i == -1) {
                System.out.println(m);
                break;
            }
            }

        }

    }

