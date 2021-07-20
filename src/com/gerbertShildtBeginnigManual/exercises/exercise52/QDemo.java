package com.gerbertShildtBeginnigManual.exercises.exercise52;
class Queue {
    char q[];   //  массив для хранения элементов очереди
    int putloc, getloc; //  индексы для всавки и извлечения
    //  элементы очереди

    Queue(int size) {
        q = new char[size]; //  выделение памяти для очереди
        putloc = getloc = 0;
    }
    void put(char ch) {
        if(putloc == q.length) {
            System.out.println(" - Очередь заполнена");
            return;
        }
        q[putloc++] = ch;
    }
    char get() {
        if(getloc == putloc) {
            System.out.println(" - Очередь пуста");
            return (char) 0;
        }
        return q[getloc++];
    }
}

class QDemo {
    public static void main(String args[]) {
        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(4);
        char ch;
        int i;

        System.out.println("использование очереди bigQ " +
                "для сохранения алфавита");
        //  помещение буквенных символов в очередь bigQ
        for(i = 0; i < 26; i++)
            bigQ.put((char) ('A' + i));
        //  извелечение и отображение буквенных символов из
        //  очереди bigQ
        System.out.print("Содержимое очереди bigQ: ");
        for (i = 0; i < 26; i++) {
            ch = bigQ.get();
            if(ch != (char) 0) System.out.print(ch);
        }
        System.out.println("\n");
        System.out.println("Использование очереди smallQ " +
                "для генерации ошибок");
        for(i = 0; i < 5; i++) {
            System.out.print("Попытка сохранения " + (char) ('Z' - i));
            smallQ.put ((char) ('Z' - i));
            System.out.println();
        }
        System.out.println();
        //  дополнительные ошибки при обращение к очереди smallQ
        System.out.print("Содержимое очереди smallQ: ");
        for (i = 0; i < 5; i++) {
            ch = smallQ.get();
            if(ch != (char) 0) System.out.print(ch);
        }
    }
}