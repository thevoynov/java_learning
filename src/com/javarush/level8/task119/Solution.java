package com.javarush.level8.task119;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/*
Работа с датой
*/

public class Solution {
    public static void main(String[] args) throws ParseException {
//        System.out.println(isDateOdd("MAY 1 2013"));
        SimpleDateFormat format = new SimpleDateFormat("MMMM d yyyy", Locale.ENGLISH);
//        format.applyLocalizedPattern("MMMM d yyyy");
        Date docDate = format.parse("May 1 2013");
        long days = docDate.getDay();
        System.out.println(days);
    }

    public static boolean isDateOdd(String date) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat();
        format.applyLocalizedPattern("MM.dd.yy");
        Date docDate = format.parse(date);
        int days = docDate.getDay();
        if(days % 2 == 0)
            return false;
        else
            return true;
    }
}