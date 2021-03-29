package com.GerbertShildtBeginnigManual.part5;
//   Преобразование строных букв английского алфавита в прописные
class UpCase {
    public static void main(String args[]) {
        char ch;

        for (int i = 0; i < 26; i ++) {
            ch = (char) ('a' + i);
            System.out.print(ch);
            // В следующем операторе сбрасывается шестой бит
            // После этого в переменой ch будет храниься код
            // симвла прописной буквы.
            ch = (char) ((int) ch & 65503);

            System.out.print(ch + " ");

        }
    }
}
