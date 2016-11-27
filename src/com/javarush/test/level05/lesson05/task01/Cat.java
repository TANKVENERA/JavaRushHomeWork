package com.javarush.test.level05.lesson05.task01;

/* Создать класс Cat
Создать класс Cat. У кота должно быть имя (name, String), возраст (age, int),
 вес (weight, int), сила (strength, int).
*/

public class Cat {
    private String name;
    private int age;
    private int weight;
    private int strength;

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.name = "Вася";
        cat.age = 1;
        cat.strength =1;
        cat.weight = 2;


    }
}
