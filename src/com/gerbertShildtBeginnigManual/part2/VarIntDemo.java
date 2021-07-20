package com.gerbertShildtBeginnigManual.part2;

class VarIntDemo {
    public static void main(String args[]) {
        int x;

        for(x = 0; x < 3; x++) {
            int y = -1; //  переменная у инициализируется
                        //  при каждом входе в блок
            System.out.println("y: " + y);
            y = 100;
            System.out.println("Изменение значения y: " + y);
        }
    }
}