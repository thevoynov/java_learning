package com.GerbertShildt.begining;

class BlockDemo {
    public static void main(String args[]) {
        int i, j, d;
        i = 0;
        j = 10;

        // Телом этой инструкции if является целый блок кода
        if(i != 0) {
            System.out.println("i не равно нулю");
            d = j / i;
            System.out.println("j / i равно " + d);
        }
    }
}
