package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        ArrayList<int[]> list = new ArrayList<>();
        int[] list1 = {1,2,3,4,5};
        int[] list2 = {(int) (Math.random() * 100),(int) (Math.random() * 100)};
        int[] list3 = {(int) (Math.random() * 100),(int) (Math.random() * 100),(int) (Math.random() * 100),(int) (Math.random() * 100)};
        int[] list4 = {7,6,5,4,3,2,1};
        int[] list5 = new int[0];
        list.add(list1);
        list.add(list2);
        list.add(list3);
        list.add(list4);
        list.add(list5);

        return list;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
