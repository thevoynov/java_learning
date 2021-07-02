package com.GerbertShildtFullManual.part11.SuspendResume;
//  Приостановка и возобновление исполнения
//  потока современным способом
/*
class NewThread implements Runnable {
    String name;    //  имя потока исполнения
    Thread t;
    boolean suspendFlag;

    NewThread(String threadname) {
        name = threadname;
        t = new Thread(this,name)
    }

    @Override
    public void run() {
        for (int i = 15; i > 0; i--) {
            System.out.println(name + ": " + i);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (this) {
                while (suspendFlag) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}


class SuspendResume {
    public static void main(String args[]) {

    }
}
*/