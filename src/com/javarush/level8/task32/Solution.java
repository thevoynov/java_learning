package com.javarush.level8.task32;

import java.util.HashMap;
import java.util.Map;


public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();//напишите тут ваш код
        map.put("арбуз", "ягода");
        map.put("банан", "трава");
        map.put("вишня", "ягода");
        map.put("груша", "фрукт");
        map.put("дыня", "овощ");
        map.put("ежевика", "куст");
        map.put("жень-шень", "корень");
        map.put("земляника", "ягода");
        map.put("ирис", "цветок");
        map.put("картофель", "клубень");

        for(Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " - " + s.getValue());
        }
    }
}
