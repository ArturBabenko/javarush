package com.javarush.task.task04.task0432;

/* 
Хорошего много не бывает
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String text = input.readLine();
        int times = Integer.parseInt(input.readLine());
        int i = 1;

        while (i <= times) {
            System.out.println(text);
            i++;
        }


    }
}
