package com.javarush.task.task09.task0905;

/* 
Там, в синих глубинах стек-трейса…
*/

import static java.lang.Thread.currentThread;

public class Solution {
    public static void main(String[] args) {
        int deep = getStackTraceDepth();
    }

    public static int getStackTraceDepth() {
        StackTraceElement[] n = currentThread().getStackTrace();
        int d = n.length;
        System.out.println(d);
        return d;
    }
}

