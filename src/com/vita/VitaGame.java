package com.vita;

public class VitaGame {
    public static void main(String[] args) {
        int[][] nums = new int[][]
                {

                        {0,1,0},
                        {2, 3, 4},
                        {5, 6, 7},
                        {0,8,0}
                };

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.printf("%d ", nums[i][j]);
            }
            System.out.println();
        }
    }
}
