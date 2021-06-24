package com.GerbertShildtFullManual.mylib.classes;

import java.util.stream.Collector;

class characteristic {
    characteristic (int height, int weight, int age, String name) {

        System.out.println("Привет, меня зовут " + name +
                " мне " + age + " у меня рост " + height
                + " и вес " + weight);
        System.out.println();
    }
    characteristic () {
        System.out.println("Параметры не заданы");
        System.out.println();
    }
    characteristic (int experience, String education,
                    int age, boolean recommendation) {
        double ratio_i = 0.5;
        byte ratio_j = 0;

        if (education.equals("PhD"))
            ratio_i = 2;
        else if(education.equals("Master"))
            ratio_i = 1.5;
        else if (education.equals("Bachelor"))
            ratio_i = 1;

        if(recommendation) {
            ratio_j = 2;
        }

        /*
        switch (education) {
            case "PhD":
                ratio_i = 2;
                break;
            case "Master":
                ratio_i = 1.5;
                break;
            case "Bachelor":
                ratio_i = 1;
                break;
        }
        */

        double ratio = experience * ratio_i * age * ratio_j;
        System.out.println("Рейтинг кандидата оценивается в " + ratio);
        System.out.println();
    }
}
class SomePerson {
    public static void main(String args[]) {
        characteristic Person1 =
                new characteristic(180, 80, 27, "Иван");
        characteristic Person2 =
                new characteristic(160, 60, 21, "Марина");
        characteristic Person3 =
                new characteristic();
        characteristic Person4 =
                new characteristic(6,
                        "Master",23,true);
    }
}
