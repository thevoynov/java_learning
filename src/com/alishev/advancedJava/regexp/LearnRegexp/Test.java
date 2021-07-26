package com.alishev.advancedJava.regexp.LearnRegexp;

public class Test {
    public static void main(String[] args) {

        /*
        \\d - однай цифра
        \\w - одна буква = [a-zA-Z]

        + - 1 или более
        * - 0 или более
        ? - 0 или 1 символов до

        (x|y|z) - одна строка из множества строк

        [abc] = (a|b|c)
        [a-zA-Z] - какая то буква из всего английского алфавита
        [^abc] - мы хотим все символы кроме abc

        . - любой символ

        {2} - 2 символа до (\\d{2})
        {2,} - 2 или более символа(\\d{2,})
        {2, 4} - от 2 до 4 символов(\\d{2,4})


        */

        String a = "-41241";
        String b = "41241";
        String c = "+12124";


        System.out.println(a.matches("(-|\\+)?\\d*"));
        System.out.println(b.matches("(-|\\+)?\\d*"));
        System.out.println(c.matches("(-|\\+)?\\d*"));

        String d = "gsdsdds12345";
        System.out.println(d.matches("[a-zA-Z]+\\d*"));
        String e = "Helloc";
        System.out.println(d.matches("[^abc]*"));

        String url = "http://www.google.com";
        System.out.println(url.matches("http://www\\..+\\.(com|ru)"));

    }
}