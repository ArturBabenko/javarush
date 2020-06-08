package com.javarush.task.task03.task0307;

/* 
Привет StarCraft!
*/

public class Solution {
    public static void main(String[] args) {

        Zerg zerg1 = new Zerg();
        zerg1.name = "name1";
        Zerg zerg2 = new Zerg();
        zerg2.name = "name2";
        Zerg zerg3 = new Zerg();
        zerg3.name = "name3";
        Zerg zerg4 = new Zerg();
        zerg4.name = "name4";
        Zerg zerg5 = new Zerg();
        zerg5.name = "name5";

        Protoss protos1 = new Protoss();
        protos1.name = "pname1";
        Protoss protos2 = new Protoss();
        protos2.name = "pname2";
        Protoss protos3 = new Protoss();
        protos3.name = "pname3";

        Terran terran1 = new Terran();
        terran1.name = "tname1";
        Terran terran2 = new Terran();
        terran2.name = "tname2";
        Terran terran3 = new Terran();
        terran3.name = "tname3";
        Terran terran4 = new Terran();
        terran4.name = "tname4";


    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
