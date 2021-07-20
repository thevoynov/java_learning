package com.alishev.beginning.MyTest;

class AnimalLover {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Animal animal2 = new Animal();
        animal1.setParam(1, 2,134);
        animal2.setParam(5, 10,12);
        System.out.println("id = " + animal1.id + "\n" + "height = "
                + animal1.height + "\n" +"weight = " + animal1.weight);
        System.out.println("id = " + animal2.id + "\n" + "height = "
                + animal2.height + "\n" +"weight = " + animal2.weight);
    }
}

class Animal {
    int height, weight, id = 0;

    void setParam(int airtight, int aweigh, int acid) {
        height = airtight;
        weight = aweigh;
        id = acid;
    }
}