package com.gerbertShildtBeginnigManual.part2;

class SCops {
    public static void main(String args[]) {
        int n, d, q;

        n = 10;
        d = 2;
        if (d != 0 && (n % d ) == 0)
            System.out.println(d + " является делителем " + n);
        d = 0;  //  установить для d нулевое значение
        //  Второй операнд не вычисляется, поскольку значение
        //  переменной d равно нулю
        if (d != 0 && (n % d ) == 0)
            System.out.println(d + " является делителем " + n);
        else
            System.out.println(d + " не является делителем " + n); // моё дополнение
        //  А теперь те же самые действия выполняются без
        //  использования укороченного логического оператора
        //  В результате возникает ошибка деления на нуль.
//      if (d != 0 & (n % d ) == 0)
//          System.out.println(d + " является делителем " + n);

    }
}
