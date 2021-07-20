package com.alishev.beginning.Lesson37;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exception1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("asdf") ;
        Scanner scanner = new Scanner(file);
    }
}
