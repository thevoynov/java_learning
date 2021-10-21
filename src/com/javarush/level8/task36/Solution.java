package com.javarush.level8.task36;

import java.util.HashMap;
import java.util.Map;

/*
Коллекция Map из Object
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();
        map.put("Sim", 5);
        map.put("Tom", 5.5);
        map.put("Arbus", false);
        map.put("Baby", null);
        map.put("Cat", "Cat");
        map.put("Eat", new Long(56));
        map.put("Food", new Character('3'));
        map.put("Gevey", '6');
        map.put("Hugs", 111111111111L);
        map.put("Comp", (double) 123);

        for(Map.Entry<String, Object> s : map.entrySet())
            System.out.println(s.getKey() + " - " + s.getValue());//напишите тут ваш код

    }
}