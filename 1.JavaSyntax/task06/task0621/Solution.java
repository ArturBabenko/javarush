package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandpaName = reader.readLine();
        Cat catGrandpa = new Cat(grandpaName);

        String grandmaName = reader.readLine();
        Cat catGrandma = new Cat(grandmaName);

        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName, catGrandpa, null );

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, null, catGrandma);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catFather, catMother);

        String dName = reader.readLine();
        Cat catD = new Cat(dName, catFather, catMother);

        System.out.println(catGrandpa);
        System.out.println(catGrandma);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catD);
    }

    public static class Cat {
        private String name;
        private Cat parentF;
        private Cat parentM;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat parentF, Cat parentM) {
            this.name = name;
            this.parentF = parentF;
            this.parentM = parentM;

        }

        @Override
        public String toString() {
            if (parentF == null && parentM == null)
                return "The cat's name is " + name + ", no mother, no father ";
            else if (parentM == null)
                return "The cat's name is " + name + ", no mother, father is " + parentF.name;
            else if (parentF == null)
                return "The cat's name is " + name + ", mother is " + parentM.name + ", no father";
            else
                return "The cat's name is " + name + ", mother is " + parentM.name + ", father is " + parentF.name;
        }
    }

}