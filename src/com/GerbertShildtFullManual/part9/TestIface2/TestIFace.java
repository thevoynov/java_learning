package com.GerbertShildtFullManual.part9.TestIface2;

import javax.security.auth.callback.Callback;

class Client implements Callback {
    //  реализовать интерфейс Callback
    public void callback(int p) {
        System.out.println("Метод callback(), вызываемы со значением " + p);
    }
}

//  Ещё одна реализация интерфейса Callback
class AnotherClient implements Callback {
    //  реализовать интерфейс Callback
    public void callback(int p) {
        System.out.println("Ещё один вариант метода callback()");
        System.out.println("p в квадрате равно " + (p*p));
    }
}

class TestIFace {
    public static void main(String args[]) {
        Callback c = new Client();
        AnotherClient ob = new AnotherClient();
        
        ((Client) c).callback(42);
        c = ob; //  теперь переменная c ссылается на 
                // объект типа AnotherClient
        
        ((AnotherClient) c).callback(42);
    }
}
