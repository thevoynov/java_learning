package com.GerbertShildtFullManual.part3;
//  Продемонстрировать облать видимости блока кода
class Scope {
    public static void main(String args[]) {
        int x;  //  Эта переменная доступна всему
                //  коду из метода main()
        x = 10;
        if(x == 10) {   //  начало новой области действия,
            int y = 20; //  доступной
        }
    }
}
