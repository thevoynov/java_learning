package com.GerbertShildtFullManual.part6.Stack;
//  в этом классе опредлется цилочисленный стек, где
//  можно хранить до 10 целочисленных значений

class Stack {
    int stck[] = new int[10];
    int tos;

    //  инициализировать вершину стека
    Stack() {
        tos = -1;
    }
    //  разместить элемент в стеке
    void  push(int item) {
        if(tos == 9)
            System.out.println("Стек заполнен.");
        else
            stck[++tos] = item;
    }

    //  извелчить элемент из стека
    int pop() {
        if(tos < 0) {
            System.out.println("Стек не загружен.");
            return 0;
        }
        else
            return stck[tos--];
    }
}
