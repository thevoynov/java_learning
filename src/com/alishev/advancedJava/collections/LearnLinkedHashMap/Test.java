package com.alishev.advancedJava.collections.LearnLinkedHashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Test {
    public static void main(String[] args) {
/*        Map<String, String> translations = new HashMap<>();

        translations.put("кошка", "cat");
        translations.put("собака", "dog");
        translations.put("слон", "elephant");

        for(Map.Entry entry : translations.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
*/
        //  порядок не гарантируется
        Map<Integer, String> hashMap = new HashMap<>();
        //  гарантируется порядок (порядок добавления)
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        //  отсортированны по ключу
        Map<Integer, String> treeMap = new TreeMap<>();

        System.out.println("hashMap");
        testMap(hashMap);

        System.out.println();

        System.out.println("linkedHashMap");
        testMap(linkedHashMap);

        System.out.println();

        System.out.println("treeMap");
        testMap(treeMap);
    }

    public static void testMap(Map<Integer, String> map) {
        map.put(39, "Bob");
        map.put(12, "Mike");
        map.put(78, "Tom");
        map.put(0, "Sam");

        for(Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
