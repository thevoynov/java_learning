package com.alishev.beginning.Lesson48;

public enum Animal {
    DOG("Собака"), CAT("Кошка"), FRO("Лягушка");
    private String translation;
    private Animal(String translation) {
        this.translation = translation;

    }

    public String getTranslation() {
        return translation;
    }

    public String toString() {
        return "Перевод на русский язык " + translation;
    }
}
