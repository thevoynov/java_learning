package com.javarush.level8.task113;

import java.util.HashMap;
import java.util.Map;


public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        Map<String, String> map = new HashMap<>();

        map.put("Машов", "Ниц");
        map.put("Машов", "Ниц");
        map.put("Машов", "Ниц");
        map.put("Машов", "Ниц");
        map.put("Машов", "Ниц");//напишите тут ваш код

        map.put("Машов", "Ниц");
        map.put("Машов", "Ниц");
        map.put("Машов", "Ниц");
        map.put("Машов", "Ниц");
        map.put("Машов", "Ниц");
        return map;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
