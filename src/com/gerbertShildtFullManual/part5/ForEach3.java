package com.gerbertShildtFullManual.part5;

class ForEach3 {
    public static void main(String args[]) {
        int sum = 0;
        int nums [][] = new int [3][5];

        //  присвоить значение элементам массива nums
        for(int i = 0; i < 3; i++) {
            System.out.println("i = "  + i);
            for (int j = 0; j < 5; j++) {
                System.out.println("j = "  + j);
                nums[i][j] = (i + 1) * (j + 1);
            }
        }

        //  использовать цикл for в стиле for each для
        //  вывода и суммирования значений
        for(int x[] : nums) {
            for(int y : x) {
                System.out.println("Значения равно: " + y);
                sum += y;
            }
        }
        System.out.println("Сумма: "  + sum);
    }
}
