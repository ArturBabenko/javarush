package com.javarush.task.task04.task0422;

/* 
18+
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String name = input.readLine();
        int age = Integer.parseInt(input.readLine());

        if (age < 18)
            System.out.println("Подрасти еще");

    }
}
