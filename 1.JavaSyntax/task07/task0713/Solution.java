package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> listOther = new ArrayList<>();
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 20; i++) {
            list1.add(Integer.parseInt(input.readLine()));
        }
        for (int j = 0; j < list1.size(); j++) {
            if (list1.get(j)%3 == 0) {
                if (list1.get(j)%2 == 0) list2.add(list1.get(j));
                list3.add(list1.get(j));
            }
            else if (list1.get(j)%2 == 0) list2.add(list1.get(j));
             else listOther.add(list1.get(j));
        }

        printList(list3);
        printList(list2);
        printList(listOther);
    }

    public static void printList(ArrayList<Integer> list) {
        list.forEach(System.out::println);
    }
}
