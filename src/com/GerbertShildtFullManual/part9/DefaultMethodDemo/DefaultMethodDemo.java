package com.GerbertShildtFullManual.part9.DefaultMethodDemo;

interface MyIF {
    //  Это объявление обычного метода в интерфейсе.
    //  Он предоставляет реализацию по умолчанию

    int getNumber();

    //  А это объявление метода с реализацией по умолчанию.
    //  Обратите внимание на его реализацию по умолчанию

    default String getString() {
        return "Объект типа String по умолчанию";
    }
}

class MyIFImp implements MyIF {

    //  В этом классе должен быть реализова только
    //  метод getNumber(), определённый в интерфейсе MyIF
    //  А вызов метода getSting() разрешается по умолчанию

    public int getNumber() {
        return 100;

    }
}

public class DefaultMethodDemo {
    public static void main(String args[]) {
        MyIFImp obj = new MyIFImp();

        //  Метод getNumber() можно вызвать, так как он
        //  явно реализован в классе myIFImp:
        System.out.println(obj.getNumber());

        //  Метод getString() так можно вызвать
        //  так как в интерфйесе имеется его реализация
        //  по умолчанию
        System.out.println(obj.getString());

    }
}
