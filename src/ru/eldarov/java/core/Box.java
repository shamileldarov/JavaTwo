package ru.eldarov.java.core;

import java.util.ArrayList;

public class Box<T extends Fruit> {

    public ArrayList<T>> fruitBox;



    public void put(T fruit) {
        fruitBox.add(fruit);
    }

    public boolean compareTo(Box o) {
        return this.getWeight() == o.getWeight();
    }

    public void pourBox(Box<T> target) {
        target.fruitBox.addAll(this.fruitBox);
        this...fruitBox...clear();
    }

    public Box(ArrayList<T>> fruits) {
        fruitBox = fruits;
    }

    public float getWeight() {
        float sum = 0;
        for (T fruit : fruitBox) {
            sum += fruit.getWeight();
        }
        return sum;
    }

