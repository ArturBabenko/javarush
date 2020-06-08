package com.javarush.task.task08.task0801;

/* 
Set из растений
*/

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        Set<String> setList = new HashSet<>();

        setList.add("арбуз");
        setList.add("банан");
        setList.add("вишня");
        setList.add("груша");
        setList.add("дыня");
        setList.add("ежевика");
        setList.add("женьшень");
        setList.add("земляника");
        setList.add("ирис");
        setList.add("картофель");

        setList.forEach(System.out::println);
    }
}
