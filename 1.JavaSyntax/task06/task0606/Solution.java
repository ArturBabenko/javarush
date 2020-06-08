package com.javarush.task.task06.task0606;

/* 
Чётные и нечётные циферки
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int numb = Integer.parseInt(input.readLine());
        int compare = 0;

        while (numb > 0) {
            compare = numb % 10;
            if (compare % 2 == 0) even++;
            else odd++;
            numb /=10;
        }
        System.out.println("Even: " + even +" Odd: " + odd);
    }
}
