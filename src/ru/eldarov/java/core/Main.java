package ru.eldarov.java.core;

public class Main {

    public static void main(String[] args) {
        // write your code here

        String[][] array =
                         {{"1","цук","1","1"},
                        {"1","1","цук","1"},
                        {"1","пуар","1","1"},
                        {"1","вап","1","кке"}};
        Lesson2 hw = new Lesson2();


        try {
            System.out.println(hw.sumArrayElements(array));
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }
    }
}