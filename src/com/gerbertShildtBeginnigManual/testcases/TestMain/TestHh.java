package com.gerbertShildtBeginnigManual.testcases.TestMain;
import java.util.Scanner;
/*
    Solution of a test task in JavaSchool of HeadHunter
    Author Voynov Vladislav Vladimirovich
*/

class TestHh {
    public static void main(String[] args) {
        int c = 0;
        try {
            Scanner scanner = new Scanner(System.in);
            String string = scanner.nextLine();
            int a = Integer.parseInt(string.split(" ")[0]);
            int b = Integer.parseInt(string.split(" ")[1]);
            int[] mass = new int[a];
            int sum = 0;
            for (int i = 0; i < mass.length; i++) {
                mass[i] = Integer.parseInt(scanner.nextLine());
                sum += mass[i];
            }

            if(sum > 0 && b > 0)
                c = sum/b;
            if(c != 0)
                while(true) {
                    int g = 0;
                    for (int i = 0; i < mass.length; i++)    // перебираем все счета
                        g += mass[i] / c;
                    if(g >= b)
                        break;
                    else
                        c--;
                }
        } catch (Exception ex) {

        }
        finally {
            System.out.println(c); // выводим результат
        }
    }
}
