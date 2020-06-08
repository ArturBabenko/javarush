package com.javarush.task.task04.task0437;

/* 
Треугольник из восьмерок
*/

public class Solution {
    public static void main(String[] args) {
       /* String s ="8";
        for (int i = 0; i < 10; i++)
        {
            System.out.println(s);
            s = s +"8";
        }
        */

        for (int i = 1; i < 11; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(8);
            }
            System.out.println("");
        }
    }
}
