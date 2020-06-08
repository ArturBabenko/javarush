package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    /*    int numbers2 = 0;
        while (true)
        {
                int numbers = Integer.parseInt(input.readLine());
                if (numbers == -1) break;
               else
                    {
                    for (int i = 1; true; i++) {

                        numbers2 = (numbers2 + numbers) / i;
                    }
                }
        }
        System.out.println(numbers2);

     */
        double numbers2 = 0;
        double sred = 0;
        for (int i = 1; true; i++) {
            double numbers = Double.parseDouble(input.readLine());
            if (numbers == -1) break;
            numbers2 = numbers2 + numbers;
            sred = i;
        }
        System.out.println(numbers2 / sred);

    }
}

