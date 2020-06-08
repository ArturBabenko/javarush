package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> lists = new ArrayList<String>();
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            lists.add(input.readLine());
        }
        int lengsize = lists.get(0).length();
        for (int j = 1; j < lists.size(); j++) {
            if (lengsize >= lists.get(j).length()) {
                System.out.println(lists.indexOf(lists.get(j)));
                break;
            }
            lengsize = lists.get(j).length();
        }

    }
}

