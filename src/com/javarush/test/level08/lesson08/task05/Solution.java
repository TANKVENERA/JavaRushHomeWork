package com.javarush.test.level08.lesson08.task05;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("Бельский", "Миша");
        map.put("Гришка", "Оля");
        map.put("Гик", "Паша");
        map.put("Волохов", "Света");
        map.put("Крохин", "Вася");
        map.put("Ерохин", "Петя");
        map.put("Пика", "Миша");
        map.put("Лупатов", "Марина");
        map.put("Борисов", "Вадим");
        map.put("Старотиторова", "Миша");
        //напишите тут ваш код
        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {

        //Копируем переданную мапу 2 раза
        HashMap<String, String> map2 = new HashMap<String, String>(map);
        HashMap<String, String> map3 = new HashMap<String, String>(map);

        //цикл по map2
        for (Map.Entry<String, String> pair : map2.entrySet()) {
            //удаляем из map3 пару, которая соответствует pair
            map3.remove(pair.getKey());
            System.out.println(map3); // посмотрим , что происходит с картой (просто для наглядности )
            //проверяем на наличе  в map3 значений соответсвующего значению из pair
            if (map3.containsValue(pair.getValue())) {   //Если есть такие же значения -
                // вызываем удаления текущего значения pair из переданной пары
                removeItemFromMapByValue(map, pair.getValue());

            }
            System.out.println(map); // посмотрим, как карта поменяется в  требуемую нам(просто для наглядности )
        }


    }


    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
        HashMap<String, String> x = createMap();
        removeTheFirstNameDuplicates(x);
        for (Map.Entry<String, String> pair : x.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }

    }

}

