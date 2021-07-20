package com.gerbertShildtFullManual.part4;

class BitLogic {
    public static void main(String args[]) {
        String binary[] = {
                "0000", "0001", "0010", "0011", "0100",
                "0101", "0110", "0111", "1000", "1001",
                "1010", "1011", "1100", "1101", "1110",
                "1111"
        };

        int a = 3;  //  0 + 2 + 1, или 0011 в двоичном представление
        int b = 6;  //  4 + 2 + 0, или 0110 в двоичном представление
        int c = a | b;
        int d = a & b;
        int e = a ^ b;
        int f = (~a & b) | (a & ~b);
        int g = ~a & 0x0f;  // 0x0f - hexadecimal (шеснадцатиричная система координат)

        System.out.println(" a = " + binary[a] + " (int a = " + a + " )");
        System.out.println(" b = " + binary[b] + " (int b = " + b + " )");
        System.out.println(" a | b = " + binary[c] + " (int c = " + c + " )");
        System.out.println(" a & b = " + binary[d] + " (int d = " + d + " )");
        System.out.println(" a ^ b = " + binary[e] + " (int e = " + e + " )");
        System.out.println(" (~a & b) | (a & ~b) = " + binary[f] + " (int f = " + f + " )");
        System.out.println(" ~a & 0x0f " + binary[g] + " (int g = " + g + " )");

    }
}
