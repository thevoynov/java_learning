package com.GerbertShildt.part2;

class SideEffects {
    public static void main(String args[]) {
        int i;
        i = 0;
        //  Значение переменной i инкрементируется несмотря на то,
        //  что проверямое условие в инструкции if ложно
        if(false & (++i < 100))
            System.out.println("Эта строка не будет отображаться");
        System.out.println("Инструкция if выполняется: " + i);
        //  отображение 1
        //  В данном случае значение перемнной i не инкрементируется,
        //  поскольку второй операнд уороченного логического опертора
        //  не вычисляется, а следовательно, инкремент пропускается
       if(false & (++i < 100))
           System.out.println("Эта стока не будет отображаться");
        System.out.println("Инструкция if выполняется: " + i);
    }
}
