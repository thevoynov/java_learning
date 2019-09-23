package com.levelp.Storage;

public class Storage {
    String s = "Hello, World!";
    int storage(String s) {
        return s.length();
    }
    void print() {
        System.out.println(
                "storage(s) = " + storage(s));
    }
    public static void main(String[] args) {
        Storage st = new Storage();
        st.print();
    }
}
