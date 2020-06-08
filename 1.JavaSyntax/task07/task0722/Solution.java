package com.javarush.task.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Это конец
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> lists = new ArrayList<>();
        String s = "end";
        for (; true ;) {
            String str = reader.readLine();
            if (str.equals(s)) break;
            lists.add(str);
        }
        lists.forEach(System.out::println);
    }
}