package com.GerbertShildt.part2;
/*
    В этой программе предпринимается попытка объявить во
    внутренней области действия переменную с таким же именем,
    как и у переменной, объявленной во внешней области действия.

                    **Эта программа не пройдёт компиляцию**
 */
class NestVar {
        public static void main(String args[]) {
            int count;

            for(count = 0; count < 10; count = count++) {
                System.out.println("Значение count: " + count);
            //int count; НЕДОПУСТИМО!!!
            }
        }
}