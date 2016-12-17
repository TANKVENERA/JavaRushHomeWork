package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human).
Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей.
 Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human,
 то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution {
        static int z;

    public static void main(String[] args) {
        //напишите тут ваш код
        Human gr1 = new Human(null, null); // создаем объект
        gr1.name = "Вася"; // заполняем данными
        gr1.age = 60;
        gr1.sex = true;

        System.out.println(gr1); // toString можно и не писать, он срабатывает по умолчанию
        Human gr2 = new Human(null, null);
        gr2.name = "Витя";
        gr2.age = 65;
        gr2.sex = true;
        System.out.println(gr2.toString());
        Human grm1 = new Human(null, null);
        grm1.name = "Катя";
        grm1.age = 70;
        grm1.sex = false;
        System.out.println(grm1.toString());
        Human grm2 = new Human(null, null);
        grm2.name = "Нина";
        grm2.age = 69;
        grm2.sex = false;
        System.out.println(grm2.toString());
        Human father = new Human(null, null); // например тут не передаем отца и масть, то еть деда и бабку
        father.name = "Павел";
        father.age = 40;
        father.sex = true;
        System.out.println(father.toString());
        Human mother = new Human(null, null);
        mother.name = "Лиза";
        mother.age = 39;
        mother.sex = false;
        System.out.println(mother.toString());
        Human kid1 = new Human(father, mother);
        kid1.name = "Вадим";
        kid1.age = 8;
        kid1.sex = true;
        System.out.println(kid1.toString());
        Human kid2 = new Human(father, mother);
        kid2.name = "Катя";
        kid2.age = 2;
        kid2.sex = true;
        System.out.println(kid2.toString());
        Human kid3 = new Human(father, mother);
        kid3.name = "Ежи";
        kid3.age = 5;
        kid3.sex = true;
        kid3.father.name = "Григорий";
        kid3.mother.name = "Света";
        System.out.println(kid3.toString());


    }

    public static class Human {
        //напишите тут ваш код

        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        Human(Human father, Human mother) {

            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
