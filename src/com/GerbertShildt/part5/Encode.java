package com.GerbertShildt.part5;
//  использование побитвой операции искючающего ИЛИ
//  для шифрования и дешифрования сообщений
class Encode {
    public static void main(String args[]) {
        String msg = "Это просто текст";
        String encmsg = new String("");
        String decmsg = new String("");
        int key = 88;

        System.out.println("Исходное сообщние: " + msg);

        //  Шифрование сообшения
        for(int i = 0; i < msg.length(); i++)
            encmsg = encmsg + (char) (msg.charAt(i) ^ key);
        System.out.println("Зашифрованное сообщение: " + encmsg);

        //  Дешифровка сообщения
        for(int i = 0; i < msg.length(); i++) {
            decmsg = decmsg + (char) (encmsg.charAt(i) ^ key);
        }
        System.out.println("Расшифрованное сообщение: " + decmsg);
    }
}
