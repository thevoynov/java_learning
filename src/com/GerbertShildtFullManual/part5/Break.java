package com.GerbertShildtFullManual.part5;

class Break {
    public static void main(String args[]) {
        boolean t = true;

        first: {
            second: {
                third:{
                    System.out.println("Предшествует оперетатору break");
                    if(t) break second; //  выход из блока second
                        System.out.println("Этот оператор не будет выполняться");
                }
                System.out.println("Этот оператор не будет выполняться");
            }
            System.out.println("Этот оператор следует за блоком second");
        }
    }
}
