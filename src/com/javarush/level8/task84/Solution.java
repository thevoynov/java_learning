package com.javarush.level8.task84;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();

        map.put("Смирнов", dateFormat.parse("MAY 1 2012"));
        map.put("Нотов", dateFormat.parse("Jul 5 2014"));
        map.put("Потов", dateFormat.parse("MAY 2 2013"));
        map.put("Носков", dateFormat.parse("Jul 1 2017"));
        map.put("Иванов", dateFormat.parse("MAY 5 2021"));

        map.put("Европов", dateFormat.parse("Jul 21 2014"));
        map.put("Русов", dateFormat.parse("MAY 26 2019"));
        map.put("Ноготов", dateFormat.parse("Jul 10 2020"));
        map.put("Москов", dateFormat.parse("MAY 11 2009"));
        map.put("Армов", dateFormat.parse("Jul 3 2002"));

        return map;
        //напишите тут ваш код
    }

    public static void removeAllSummerPeople(Map<String, Date> map) throws ParseException {
        Map<String, Date> copy = map;
        for(Map.Entry<String, Date> s : copy.entrySet()) {
            if(s.getValue().toString().contains("Jun")) {
                map.remove(s.getKey());
            } else if(s.getValue().toString().contains("Jul")) {
                map.remove(s.getKey());
            } else if(s.getValue().toString().contains("Aug")) {
                map.remove(s.getKey());
            }
        }
        //напишите тут ваш код
    }

    public static void main(String[] args) throws ParseException {

    }
}
