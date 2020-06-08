package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, String> map = new HashMap<>();
        while (true) {

            String city = reader.readLine();
            String family;
            if (city.isEmpty()) {
                break;
            }
            else family = reader.readLine();
            map.put(city, family);
        }
        String ad = reader.readLine();
        System.out.println(map.get(ad));
    }
}
