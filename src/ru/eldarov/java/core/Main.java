package ru.eldarov.java.core;


import java.util.ArrayList;


import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Box<Apple>> appleBox = new Box<>(apples);
        Box<Orange>> orangeBox = new Box<>(oranges);
        Box<Apple> appleBoxOne = new Box<>(applesOne);

        Integer[] test = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        ArrayList<Apple>> apples = new ArrayList<>();
        apples.add(new Apple());
        apples.add(new Apple());
        ArrayList<Apple>> applesOne = new ArrayList<>();
        applesOne.add(new Apple());
        applesOne.add(new Apple());
        applesOne.add(new Apple());
        ArrayList<Orange>> oranges = new ArrayList<>();
        oranges.add(new Orange());
        oranges.add(new Orange());



        System.out.println("\n---AppleboxOne After---");
        appleBoxOne.fruitBox.forEach(System.out::println);
        System.out.println("\n---Applebox After---");
        appleBox.fruitBox.forEach(System.out::println);
        System.out.println("\n--------");
        System.out.println("\n--Applebox Before--");
        appleBox.fruitBox.forEach(System.out::println);
        System.out.println("\n--AppleboxOne Before--");
        appleBoxOne.fruitBox.forEach(System.out::println);
        appleBox.pourBox(appleBoxOne);



        appleBox.put(new Apple());
        orangeBox.put(new Orange());
        System.out.println(appleBox.getWeight());
        System.out.println(orangeBox.getWeight());
        System.out.println("\n--");


        System.out.println(appleBox.compareTo(orangeBox));
        System.out.println("\n---");



        Swap swapTest = new Swap();
        printArray(test);
        swapTest.swapElements(test, 0, 9);
        System.out.println("");
        printArray(test);
    }

    private static void printArray(Integer[] test) {
        for (int elem : test) {
            System.out.print(elem);
        }
    }
}