package com.javarush.test.level08.lesson06.task05;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* Четыре метода
Реализовать 4 метода. Они должны возвращать список, который лучше всего подходит для
выполнения данных операций (быстрее всего справится с большим количеством операций).
 Ничего измерять не нужно.
        */
        // просто возвратим переменные типа Оbject, тех коллекций, которые быстрее справляются с задачей
        public class Solution
        {
            public static List  getListForGet()
            {
                ArrayList<Object> arrayList = new ArrayList<>();

                //напишите тут ваш код
                 //arrayList.get(1);
                return arrayList;

    }

    public static List  getListForSet()
    {
        //напишите тут ваш код
        ArrayList<Object> arrayList = new ArrayList<>();
       // arrayList.set(1000, 10000);
        return arrayList;
    }

    public static List  getListForAddOrInsert()
    {
        LinkedList<Object> linkedList = new LinkedList<>();
        //напишите тут ваш код
               // linkedList.add(2);
        return linkedList;
    }

    public static List  getListForRemove()
    {
        //напишите тут ваш код
        LinkedList<Object> linkedList = new LinkedList<>();
        //linkedList.remove(0);
        return linkedList;
    }
}
