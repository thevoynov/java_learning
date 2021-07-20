package com.gerbertShildtBeginnigManual.exercises.exercise51;

public class Bubble {
    public static void main(String args[]) {
        int a, b, t, size = 10, nums[] = {99, -10, 10123, 18, -978,
                5623, 463, -9, 287, 49};
        //  Отображение исходного массива
        System.out.print("Исходный массив: ");
        for(int i = 0; i < size; i++)
            System.out.println(" " + nums[i]);
        System.out.println();

        //  Реализация алгоритма пузырьковой сортировки
        for (a = 1; a < size; a++)
            for (b = size - 1; b >= a; b--) {
                if (nums [b - 1] > nums[b]) {   //  Если требуемый порядок
                                                //  следования не соблюдается,
                                                //  поменять элементы местами
                    t = nums[b-1];
                    nums[b-1] = nums[b];
                    nums[b] = t;

                }
            }

        //  Отображение отсортированного массива
        System.out.print("Отсортированный массив:");
            for(int i = 0; i < size; i ++)
                System.out.print(" " + nums[i]);
            System.out.println();

    }
}
