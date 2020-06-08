package com.javarush.task.task09.task0921;

/* 
Метод в try..catch
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {

        readData();
    }

    public static void readData() {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        try {

            for (int i = 0; true; i++) {
                list.add(Integer.parseInt(input.readLine()));
            }
        }
        catch (NumberFormatException | IOException e) {
            list.forEach(x -> System.out.println(x));
            }
        }
}
