package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> map = new HashMap<>();
        map.put("up;p;uop;", "Миша");
        map.put("Бельский", "hdhfh");
        map.put("Залуцкий", "Петя");
        map.put("Головач", "Лена");
        map.put("Шнурок", "Паша");   // Маp долен иметь все оригинальные  ключ - значение!!!!
        map.put("gdxgdg", "oil");
        map.put("jklu", "uyj");
        map.put("aaaaa", "ytju");
        map.put("nnnnn", "yujyj");
        map.put("yyyyyy", "rjtuyj");

        //напишите тут ваш код
    return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {

        int i = 0;
        for (Map.Entry<String, String> x : map.entrySet()){
            if (x.getValue().equals(name)) i++;
        }
        //напишите тут ваш код
        return i;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {
        int i = 0;
        for (Map.Entry<String, String> x : map.entrySet()){
            if (x.getKey()==lastName) i++;
        }
        //напишите тут ваш код
        return i;


    }
}
