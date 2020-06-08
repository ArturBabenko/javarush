package com.javarush.task.task03.task0319;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
/* 
Предсказание на будущее
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        /*напишите тут ваш код
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        String number1 = in.nextLine();
        String number2 = in.nextLine();

        System.out.println(name + " получает " + number1 + " через " + number2 + " лет."); */

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        String number1 = in.readLine();
        String number2 = in.readLine();
        String name = in.readLine();
        System.out.println(name + " получает " + number1 + " через " + number2 + " лет.");


    }
}
