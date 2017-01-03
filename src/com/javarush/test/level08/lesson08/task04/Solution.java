package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу:
 «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Вася", new Date("JULY 1 1980"));
        map.put("Петя", new Date("AUGUST 1 1980"));
        map.put("Гриша", new Date("April 1 1980"));
        map.put("Катя", new Date("MAY 1 1980"));
        map.put("Витя", new Date("MAY 1 1980"));
        map.put("Андрей", new Date("JANUARY 1 1980"));
        map.put("Вадим", new Date("FEBRUARY 1 1980"));
        map.put("Георгий", new Date("SEPTEMBER 1 1980"));
        map.put("Миша", new Date("OCTOBER 1 1980"));

        //напишите тут ваш код
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        int june =6;
        int july = 7;
        int august = 8;
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Date> x = iterator.next();
            int month = x.getValue().getMonth()+1;
            if (month==july || month==june || month == august)
                iterator.remove();
        }
        }
        //напишите тут ваш код

    }

