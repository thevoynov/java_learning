package com.gerbertShildtBeginnigManual.testcases;

public class Rectangle {
    int left, top, width, height;
    public static void main(String[] args) {

    }

    public void initialize(int left) {
        this.left = left;
    }//напишите тут ваш код
    public void initialize(int left, int top) {
        this.left = left;
        this.top = top;
    }
    public void initialize(int left, int top, int width) {
        this.left = left;
        this.top = top;
        this.width = width;
    }
    public void initialize(int left, int top, int width, int height) {
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = height;
    }

}

