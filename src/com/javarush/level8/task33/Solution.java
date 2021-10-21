package com.javarush.level8.task33;

//import java.util.HashMap;
import java.util.HashMap;
import java.util.Map;


public class Solution {
    public static void main(String[] args) throws Exception {
        String[] cats = new String[]{"васька", "мурка", "дымка", "рыжик", "серый", "снежок", "босс", "борис", "визя", "гарфи"};
        Map<String, Cat> map = addCatsToMap(cats);

        for (Map.Entry<String, Cat> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }


    public static Map<String, Cat> addCatsToMap(String[] cats) {
        Map<String, Cat> mapCat = new HashMap<>();
        for(int i = 0; i < cats.length; i++) {
            mapCat.put(cats[i], new Cat(cats[i]));
        }

        return mapCat;//напишите тут ваш код

    }


    public static class Cat {
        String name;

        public Cat(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name != null ? name.toUpperCase() : null;
        }
    }
}