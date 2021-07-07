package com.Alishev.Beginning.Lesson36;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadingFromFile {
    public static void main(String[] args) {
        String separator = File.separator;
        String path = "C:" + separator + "Programming"
                + separator + "Test"
                + separator + "TestJava.txt";
        String path2 = "C:" + separator + "Programming"
                + separator + "Test"
                + separator + "TestJava2.txt";
        File file = new File(path);
        File file2 = new File(path2);

        Scanner scanner = null;
        Scanner scanner2 = null;

        try {
            scanner = new Scanner(file);
            scanner2 = new Scanner(file2);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не был найден!");
        }

        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }

        String line2 = scanner2.nextLine();
        String[] words = line2.split(" ");

        System.out.println(Arrays.toString(words));
        String[] numbersString = line2.split(" ");
        int[] numbers = new int[3];
        int counter = 0;
        for(String number : numbersString) {
            numbers[counter++] = Integer.parseInt(number);
        }
        System.out.println(Arrays.toString(numbers));

        scanner.close();
    }
}