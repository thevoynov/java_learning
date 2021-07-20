package com.gerbertShildtFullManual.part9.IFTest2;

//  Определить интерфейс для целочисленного стека

interface IntStack {
    void push(int item);    //  сохранить элемент в стеке
    int pop();              //  извлечь элемент из стека

    default String clear() {
        return "Метод clear() не реализован.";
    }
}

//  реализация интерфейса IntStack для cntrf
//  фиксированного размера

