package com.javarush.task.task09.task0923;

/* 
Гласные и согласные
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String str = input.readLine();
        ArrayList<Character> inputS = new ArrayList<>();
        for (char c : str.toCharArray()) {
            inputS.add(c);
        }
        char p = ' ';
        for (int k = 0; k < inputS.size(); k++) {
            if (inputS.get(k).equals(p)) inputS.remove(k);
        }

        for (int i = 0; i < inputS.size(); i++) {
         if ( isVowel(inputS.get(i)) == true) System.out.print(inputS.get(i) + " ");
        }
        System.out.println(" ");
        for (int j = 0; j < inputS.size(); j++) {
            if ( isVowel(inputS.get(j)) == false) System.out.print(inputS.get(j) + " ");
        }
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char d : vowels) {  // ищем среди массива гласных
            if (c == d) {
                return true;
            }
        }
        return false;
    }
}