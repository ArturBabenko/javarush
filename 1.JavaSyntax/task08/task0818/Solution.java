package com.javarush.task.task08.task0818;

import javax.swing.text.html.HTMLDocument;
import java.util.*;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        Map<String, Integer> map = new HashMap<>();
            map.put("Name", 300 );
        map.put("Name1", 500 );
        map.put("Name2", 600 );
        map.put("Name3", 350 );
        map.put("Name4", 400 );
        map.put("Name5", 700 );
        map.put("Name6", 870 );
        map.put("Name9", 360 );
        map.put("Name7", 900 );
        map.put("Name8", 340 );

      return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {

        HashMap<String, Integer> copy = new HashMap<String, Integer>(map);
        for (HashMap.Entry<String, Integer> pair : copy.entrySet()){
            if (pair.getValue() < 500)
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}