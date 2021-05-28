package ru.eldarov.java.core;

public class Main {

    public static void Main(String[] args) {

    }
    public static void main(String[] args) {
        String[] arrayWords = {"карандаш", "ручка", "москва", "трактор", "карандаш", "москва",
                "птица", "карандаш", "москва", "карандащ", "трактор", "москва", "agony", "руль"};
        Words words = new Words();
        words.returnUnique(arrayWords);

        words.count(arrayWords);
        System.out.println("*********************");

        PhoneDirectory phoneDirectory = new PhoneDirectory();



        phoneDirectory.add("Иванов", "+1111");
        phoneDirectory.add("Иванов", "+2222");
        phoneDirectory.add("Сидоров", "+3333");
        phoneDirectory.add("Коэн", "+4444");
        phoneDirectory.add("Коэн", "+5555");
        phoneDirectory.add("Карандашов", "+6666");
        phoneDirectory.add("Карандашов", "+7777");
        phoneDirectory.add("Сидороа", "+8888");
        phoneDirectory.add("Молотоа", "+9999");

        System.out.println(phoneDirectory.getDirectory());
        phoneDirectory.get("Коэн");
        phoneDirectory.get("Сидоров");
        phoneDirectory.get("Молотов");
    }
}