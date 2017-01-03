package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {

        ArrayList<Human> list = new ArrayList<>();
        Human son1 = new Human("Вася", true, 10, new ArrayList<Human>()); // никаких данных заносится в arraylist не будет, он просто будет пустым
        Human son2 = new Human("Андрей", true, 8, new ArrayList<Human>());
        Human son3 = new Human("Сергей", true, 3, new ArrayList<Human>());
        list.add(son1);  // можно было даже не добавлять детей в коллекцию, тогда просто ни у кого не было бы детей,
        list.add(son2); // но они  были бы сами по себе
        list.add(son3);
        Human grandfather1 = new Human("Витя", true, 77, new ArrayList<Human>());
        System.out.println(grandfather1);
        Human grandfather2 = new Human("Миша", true, 80, new ArrayList<Human>());
        System.out.println(grandfather2);
        Human grandmother1 = new Human("Катя", false, 80, new ArrayList<Human>());
        System.out.println(grandmother1);
        Human grandmother2 = new Human("Зина", false, 75, new ArrayList<Human>());
        System.out.println(grandmother2);
        Human father = new Human("Павел", true, 30, list);
        System.out.println(father);
        Human mother = new Human("Ольга", false, 29, list);
        System.out.println(mother);
        System.out.println(son1);
        System.out.println(son2);
        System.out.println(son3);

        //напишите тут ваш код
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

//        Human (String name) {  этот конструктор здесь не обязателен!!!
//            this.name = name;
//        }

        Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }
        //напишите тут ваш код


        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }

            return text;
        }
    }

}
