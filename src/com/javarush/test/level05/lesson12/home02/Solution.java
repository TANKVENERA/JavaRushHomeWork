package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

public class Solution
{
    public static void main(String[] args)
    {
        Man man1 = new Man("Вася", 20, "Ул. Строителей");
        Man man2 = new Man("Петя", 21, "Ул. Мира");
        Woman woman1 = new Woman("Лиза", 19, "Ул. Ф. Скорины");
        Woman woman2 = new Woman("Катя", 25, "Ул. Ф. Скорины");
    }

    public static class Man
    {
        String name;
        int age;
        String address;

        public Man(String name, int age, String address)
        {
            System.out.println(name + " " + age + " " + address);
        }
    }

    public static class Woman
    {
        String name;
        int age;
        String address;

        public Woman(String name, int age, String address)
        {
            System.out.println(name + " " + age + " " + address);
        }
    }
}
