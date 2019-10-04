package com.voyn;

public class Student extends Person {
    int course;

    Student(int height, float weight, int course){
        super(height, weight);
        this.course = course;
    }
}
