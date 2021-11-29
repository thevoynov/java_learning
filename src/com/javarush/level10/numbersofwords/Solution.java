package com.javarush.level10.numbersofwords;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        List<Character> alphabet = Arrays.asList(
                'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
                'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о',
                'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц',
                'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я');

        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String line = reader.readLine();
            list.add(line.toLowerCase());
        }



        for (Character symbol : alphabet) {         //Перебираем весь алфавит по Character "буквам"
            int count = 0;                              //Задаём счетчик. При каждом новом проходе, он обнуляется
            for (String str : list) {                  //Перебираем все строки, которые ввели в ArrayList
                char[] chars = str.toCharArray();  //Каждую строчку раскладываем на массив char "букв"
                for (char elem : chars) {       //Теперь для всех "букв" строчки
                    if (symbol == elem) {   //Сравниваем текущий symbol поочередно с каждой буквой строчки
                        count++;         //Если условие проходит, то инкрементируем счётчик (увеличиваем на 1)
                    }
                }
            }
            System.out.println(symbol + " " + count); //Выводим текущий элемент алфавита и значение его счётчика
        }
    }
}