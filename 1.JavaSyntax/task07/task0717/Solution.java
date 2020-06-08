package com.javarush.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удваиваем слова
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            list.add(input.readLine());
        }

        ArrayList<String> result = doubleValues(list);
        for (int k = 0; k < result.size(); k++) {
            System.out.println(result.get(k));
        }
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        for (int j = 0; j < list.size(); ) {
            list.add(j, list.get(j));
            j+=2;
        }
        return list;
    }
}
