package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        double time = Double.parseDouble(input.readLine())%5;

        if (time < 3) System.out.println("зелёный" + time);
        else if (time < 4) System.out.println("жёлтый" + time);
        else if (time <5) System.out.println("красный" + time);
    }
}