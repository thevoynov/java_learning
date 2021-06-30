package com.GerbertShildtFullManual.part11.Synch;

//  Эта программа не синхронизирована

class Callme {
    synchronized void call(String msg) {
        System.out.print("["+msg);
/*        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Прервано");
        }*/
        System.out.println("]");
    }
}

class Caller implements Runnable {
    String msg;
    Callme target;
    Thread t;

    public Caller(Callme targ, String s) {
        target = targ;
        msg = s;
        t = new Thread(this);
        t.start();
    }
    public  void run() {
        target.call(msg);
    }
}

class Synch {
    public static void main(String args[]) {
        Callme taget = new Callme();
        Caller ob1 = new Caller(taget,"Добро пожаловать");
        Caller ob2 = new Caller(taget, "В синхронизованный");
        Caller ob3 = new Caller(taget, "мир!");

        //  ожидать завершения потока исполнения
        try {
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Прервано");
        }
    }
}
