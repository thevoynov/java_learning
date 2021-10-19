package com.gerbertShildtBeginnigManual.testcases.solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
Родственные связи кошек
*/

public class Bubble {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i = 0;
        int[] sum = new int[5];
        int buf = 0;
        boolean sort = false;
        while (i <= 4) {
            sum[i] = Integer.parseInt(reader.readLine());
            i++;
            if (i == 5) {
                while (!sort) {
                    sort = true;
                    for (int j = 0; j < sum.length-1; j++) {
                        if (sum[j] > sum[j + 1]) {
                            sort = false;
                            buf = sum[j];
                            sum[j] = sum[j + 1];
                            sum[j + 1] = buf;
                        }
                    }
                }

                System.out.println(Arrays.toString(sum));
            }
        }
//        int i = Integer.parseInt(reader.readLine());
        //напишите тут ваш код
    }
}