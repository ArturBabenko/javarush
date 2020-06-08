package com.javarush.task.task07.task0710;

/* 
В начало списка
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> lists = new ArrayList<String>();
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            lists.add(0, input.readLine());
        }
        for (int j = 0; j < lists.size(); j++) {
            System.out.println(lists.get(j));
        }
    }
}
