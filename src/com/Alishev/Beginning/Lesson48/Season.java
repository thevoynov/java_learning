package com.Alishev.Beginning.Lesson48;

public enum Season {
    SUMMER(35), WINTER(-20), AUTUMN(15), SPRING(25);
    private int temperature;
    Season(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }
}
