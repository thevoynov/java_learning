package com.levelp.DataOnly;

public class DataOnly {
    int i;
    float f;
    boolean b;
    double a;
    public static void main(String[] args){
        DataOnly d = new DataOnly();
        d.i = 32;
        d.f = 3.14f/0.36f;
        d.b = !false;
        d.a = 3.14/0.36;
        System.out.println("d.i = " + d.i);
        System.out.println("d.f = " + d.f);
        System.out.println("d.b = " + d.b);
        System.out.println("d.a = " + d.a);
        DataOnly a = new DataOnly();
    }
}
