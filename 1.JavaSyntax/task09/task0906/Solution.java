package com.javarush.task.task09.task0906;

/* 
Логирование стек-трейса
*/

import static java.lang.Thread.currentThread;

public class Solution {
    public static void main(String[] args) {
        log("In main method");
    }

    public static void log(String s) {
        String c = Thread.currentThread().getStackTrace()[2].getClassName();
        String m = Thread.currentThread().getStackTrace()[2].getMethodName();

        System.out.println(c +": " + m + ": " + s);
    }
}
