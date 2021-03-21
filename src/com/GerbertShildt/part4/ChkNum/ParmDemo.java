package com.GerbertShildt.part4.ChkNum;
//  Простой пример применения параметра в методе
class ChkNum {
    //  Возврат логического значения true,
    //  Если x содержит чётное число
    boolean isEven(int x) {
        if((x%2) == 0) return true;
        else return false;
    }
}
class ParmDemo {
    public static void main(String args[]) {
        ChkNum e = new ChkNum();
        if(e.isEven(10))
            System.out.println("10 - чётное число");
        if(e.isEven(9))
            System.out.println("9 - не чётное число");
        if(e.isEven(8))
            System.out.println("8 - чётное число");
    }
}
