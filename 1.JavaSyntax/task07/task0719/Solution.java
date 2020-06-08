package com.javarush.task.task07.task0719;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Вывести числа в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> lists = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            lists.add(Integer.parseInt(reader.readLine()));
        }
        for (int j = lists.size()-1; j >= 0; j--) {
            System.out.println(lists.get(j));
        }
    }
}
