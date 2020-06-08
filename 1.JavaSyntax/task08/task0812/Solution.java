package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> lists = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            lists.add(Integer.parseInt(input.readLine()));
        }

        int count = 0;
        int count2 = 1;
        int count3 = 1;
        for (int j = 0, k=1; j < lists.size() && k < lists.size(); j++, k++) {

            if (lists.get(j).equals(lists.get(k))) {
                count2++;
                if (count2>count) count = count2;
            }
            else count2 = 1;

            if (!lists.get(j).equals( lists.get(k))){
                if (count < count3) count = count3;
            }
        }
        System.out.println(count);

    }
}