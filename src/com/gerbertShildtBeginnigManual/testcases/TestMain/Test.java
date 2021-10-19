package com.gerbertShildtBeginnigManual.testcases.TestMain;
import java.util.Scanner;
/*
    Solution of a test task in JavaSchool of HeadHunter
    Author Voynov Vladislav Vladimirovich
*/

public class Test {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int N = console.nextInt();
        int M = console.nextInt();

        int[] arrayN = new int[N];
        int sum = 0;

        for(int i = 0; i < arrayN.length; i++)
        {
            arrayN[i] = console.nextInt();
            sum += arrayN[i];
        }

        int up, down = 1, prem = sum / M;
        up = prem + 1;

        if (prem == 0)
        {
            System.out.println(prem);
        }
        else
        {
            while (down + 1 < up)
            {
                int count1 = 0;
                for (int i = 0; i < arrayN.length; i++)
                {
                    count1 += (arrayN[i] / prem);
                }
                if (count1 < M)
                {
                    up = prem;
                    prem -= (up - down) / 2;
                }
                else
                {
                    down = prem;
                    prem += (up - down) / 2;
                }
            }
            System.out.println(down);
        }
    }
}