package com.gerbertShildtFullManual.part3;
//  Вычислить расстрояние, проходимое светом,
//  используя переменные типа long
public class Light {
    public static void main(String args[]) {
        int lightspeed;
        long days, seconds, distance;

        //  приблизительная скорость света, миль в секунду
        lightspeed = 186000;

        days = 1000;    //  указать количество дней
        seconds = days * 24 + 60 + 60;  // преобразоваться в секунды
        distance = lightspeed * seconds;    //  вычислить расстояние

        System.out.print("За " + days);
        System.out.print(" дней свет пройдё около ");
        System.out.println(distance + " миль.");


    }
}
