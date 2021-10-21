package com.javarush.level8.task83;


import java.util.HashMap;
import java.util.Map;

/*
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {

        Map<String, String> map = new HashMap<>();
        map.put("Иванов", "Иван1");
        map.put("Инов", "Иван");
        map.put("Ивов", "Иван3");
        map.put("Ванов", "Иван4");
        map.put("Иновов", "Иван5");

        map.put("Ивановов", "Ива6");
        map.put("Иваниев", "Иван");
        map.put("Иванысов", "Ива8");
        map.put("Иванков", "Иван");
        map.put("Иванров", "Иван10");
        //напишите тут ваш код
        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int count = 0;
        for(Map.Entry<String, String> s : map.entrySet()) {

            if (s.getValue() == name) {
                count++;

            }
        }
        return count;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        int count = 0;
        for(Map.Entry<String, String> s : map.entrySet()) {

            if (s.getKey() == lastName) {
                count++;

            }
        }
        return count;
    }

    public static void main(String[] args) {

    }
}