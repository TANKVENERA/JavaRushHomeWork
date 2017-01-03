package com.javarush.test.level08.lesson11.home03;

import java.util.HashMap;
import java.util.Map;

/* Люди с одинаковыми именами и/или фамилиями
1. Создать словарь Map (<String, String>) и добавить туда 10 человек в виде «Фамилия»-«Имя».
2. Пусть среди этих 10 человек есть люди с одинаковыми именами.
3. Пусть среди этих 10 человек есть люди с одинаковыми фамилиями.
4. Вывести содержимое Map на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList()
    {
      Map<String, String> map = new HashMap<>();
        map.put("Бельский", "Миша");
        map.put("Иванков", "Миша");
        map.put("Гришкин", "Вадим");
        map.put("Сыч", "Гриша");
        map.put("Петров", "Вова");
        map.put("Бельский", "Вася");
        map.put("Иванов", "Гриша");
        map.put("Иванов", "Ваня");
        map.put("Светлаков", "Петя");
        map.put("Бельский", "Миша"); // на экран выведутся только пары с уникальными ключами!!! то есть,
        // если фамилия повторилась, то будет выведена одна пара, а следующие пары (с той же фамилией) уже не будут
        // выводиться , т к они уже не уникальными
        //напишите тут ваш код

        return map;
    }

    public static void printPeopleList(Map<String, String> map)
    {
        for (Map.Entry<String, String> s : map.entrySet())
        {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }

}
