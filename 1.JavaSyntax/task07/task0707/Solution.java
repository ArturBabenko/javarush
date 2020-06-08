package com.javarush.task.task07.task0707;

/* 
Что за список такой?
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add(0, "Hello1");
        list.add(1, "Hello2");
        list.add(2, "Hello3");
        list.add(3, "Hello4");
        list.add(4, "Hello5");

        System.out.println(list.size());
       for (int i = 0; i < list.size(); i++) {
           System.out.println(list.get(i));
        }
    }
}
