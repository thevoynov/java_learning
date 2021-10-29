package com.javarush.level9.task115;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char[] arrayList;
        ArrayList<Character> vowelChar = new ArrayList<>();
        ArrayList<Character> consonant = new ArrayList<>();

        arrayList = reader.readLine().toCharArray();//напишите тут ваш код

        for(char c : arrayList) {
            if(isVowel(c) && c != ' ') {
                vowelChar.add(c);
            } else if(c != ' ') {
                consonant.add(c);
            }
        }
        for(char ch : vowelChar) {
            System.out.print(ch + " ");
        }
        System.out.println();
        for(char ch : consonant) {
            System.out.print(ch + " ");
        }

    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char character) {
        character = Character.toLowerCase(character);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char vowel : vowels) {  // ищем среди массива гласных
            if (character == vowel) {
                return true;
            }
        }
        return false;
    }
}