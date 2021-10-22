package com.javarush.level8.task86;

import java.util.HashMap;
import java.util.Map;

/*
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {

        Map<String,Integer> map = new HashMap<String, Integer>();

        map.put("Сереев", 3000);
        map.put("Иваов", 800);
        map.put("Стаанов", 56);
        map.put("Стаин", 6000);
        map.put("Курев", 8);

        map.put("Скоов", 9);
        map.put("Ворбев", 130);
        map.put("Сереева", 500);
        map.put("Глоин", 1200);
        map.put("Глsоин", 1200);

        return map;
                        //напишите тут ваш код
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        Map<String,Integer> copy = new HashMap<>(map);
        for(Map.Entry<String, Integer> entry : copy.entrySet()) {
            if(entry.getValue() < 500)
                map.remove(entry.getKey());
        }

        //напишите тут ваш код
    }

    public static void main(String[] args) {

    }
}