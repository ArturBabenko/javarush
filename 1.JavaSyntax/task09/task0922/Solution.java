package com.javarush.task.task09.task0922;

/* 
Какое сегодня число?
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String s = input.readLine();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-M-dd");
        Date date = dateFormat.parse(s);
        SimpleDateFormat dateFormat2 = new SimpleDateFormat("MMM dd, yyyy");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        System.out.println(dateFormat2.format(calendar.getTime()).toUpperCase());


    }
}
