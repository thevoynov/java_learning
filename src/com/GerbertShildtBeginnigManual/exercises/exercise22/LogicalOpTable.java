package com.GerbertShildtBeginnigManual.exercises.exercise22;
class LogicalOpTable {
    public static void main(String args[]) {
        boolean p, q;
        byte pb, qb;
        System.out.println("P\t\tQ\t\tAnd\t\tOR\t\tXOR\t\tNOT");
        System.out.println("==============================================");
        p = q = true;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "\t" + (!p));
        System.out.println("----------------------------------------------");
        p = true; q = false; pb = 1; qb = 0;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "\t" + (!p));
        System.out.println("----------------------------------------------");
        p = false; q = true; pb = 0; qb = 1;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "\t" + (!p));
        System.out.println("----------------------------------------------");
        p = false; q = false; pb = 0; qb = 0;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "\t" + (!p));
        System.out.println("==============================================");
        pb = 1; qb = 1;
        System.out.print(pb + "\t\t" + qb + "\t\t");
        System.out.print((pb&qb) + "\t\t" + (pb|qb) + "\t\t");
        System.out.println((pb^qb) + "\t\t" + (pb - 1));
        System.out.println("----------------------------------------------");
        pb = 1; qb = 0;
        System.out.print(pb + "\t\t" + qb + "\t\t");
        System.out.print((pb&qb) + "\t\t" + (pb|qb) + "\t\t");
        System.out.println((pb^qb) + "\t\t" + (pb - 1));
        System.out.println("----------------------------------------------");
        pb = 0; qb = 1;
        System.out.print(pb + "\t\t" + qb + "\t\t");
        System.out.print((pb&qb) + "\t\t" + (pb|qb) + "\t\t");
        System.out.println((pb^qb) + "\t\t" + Math.abs(pb - 1));
        System.out.println("----------------------------------------------");
        pb = 0; qb = 0;
        System.out.print(pb + "\t\t" + qb + "\t\t");
        System.out.print((pb&qb) + "\t\t" + (pb|qb) + "\t\t");
        System.out.println((pb^qb) + "\t\t" + Math.abs(pb - 1));
        System.out.println("----------------------------------------------");
    }
}