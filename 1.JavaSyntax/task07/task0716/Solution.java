package com.javarush.task.task07.task0716;

import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("мера");
        strings.add("лоза");
        strings.add("лира");
        strings.add("вода");
        strings.add("упор");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        for (int i = strings.size()-1; i >=0 ; i--) {
            if (strings.get(i).contains("р") && !strings.get(i).contains("л")) strings.remove(i);
            else if (strings.get(i).contains("л") && !strings.get(i).contains("р")) {
                strings.add(strings.get(i));
                strings.add(strings.remove(i));
            }

        }

        return strings;
    }
}