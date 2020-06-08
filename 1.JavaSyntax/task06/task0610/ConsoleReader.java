package com.javarush.task.task06.task0610;

/* 
Класс ConsoleReader
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ConsoleReader {
    public static String readString() throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String s = input.readLine();
        return s;

    }

    public static int readInt() throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(input.readLine());
        return i;

    }

    public static double readDouble() throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        double d = Double.parseDouble(input.readLine());
        return d;

    }

    public static boolean readBoolean() throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        boolean b = Boolean.parseBoolean(input.readLine());
        return b;

    }

    public static void main(String[] args) throws Exception {

    }
}
