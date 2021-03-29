package com.GerbertShildtBeginnigManual.part3;

class Break3 {
    public static void main(String args[]) {
        for(int i = 0; i < 3; i++) {
            System.out.println("Счётчик внешнего цикла: " + i);
            System.out.print("       Счётчик внутренеего цикла: ");
            int t = 0;
            while (t < 100) {
                if (t == 10) break; //  прерывания цикла, если t = 10
                System.out.print(t + " ");
                if (t == 9)
                    System.out.print("break");
                t++;
            }
            System.out.println();
        }
        System.out.println("Циклы завершены.");
    }
}
