package com.levelp.ReturnMethod;

public class ReturnMethod {
    static int i = 2;
    int c = 3;
    static String s = "Hello";
    public static void main(String[] args){
        ReturnMethod st1 = new ReturnMethod();
        ReturnMethod st2 = new ReturnMethod();
        System.out.println(st1.i + "" + " = " + " " + st2.i);
        st1.i++;
        System.out.println(st1.i + "" + " = " + " " + st2.i);
        System.out.println(getHelloMessage());
        System.out.println(storage(s));
        System.out.println(incrment());
    }
    public static int getHelloMessage(){
        int b = i++;
        return i;
    }
    public static int incrment(){
        return ReturnMethod.i++;
    }
    public static int storage(String s){
        return s.length();
    }

}