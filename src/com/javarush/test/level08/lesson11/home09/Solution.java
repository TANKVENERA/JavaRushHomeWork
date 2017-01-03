package com.javarush.test.level08.lesson11.home09;

import java.util.Date;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true,
если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Не забудьте учесть первый день года.
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution {
    public static void main(String[] args) {

        System.out.println(isDateOdd("JANUARY 1 2005"));
    }

    public static boolean isDateOdd(String date) {
        Date date1 =new Date(date);

        long finish = date1.getTime(); // здесь время в мs, которое прошло с 1970 до даты date
        date1.setDate(1);      // устанавливает дату  первого числа и нулевого месяца той даты, которая попадает
        date1.setMonth(0);    // в метод, как string date
        long start = date1.getTime(); // здесь время в ms, которое прошло с 1970  года, который попал в метод,
        // как string date  до первого января установленного года
        long rezult = finish - start;  // время в ms c начала года , до того дня, который указан в string date
        int day = (int)(rezult/1000/60/60/24)+1; // нужно добавить + 1 день, так как например , если будет 1 января,
        // то день будет неполным (время будет равно 0), но дата установелна - первое января, значит 0+1 - получим дату.
        if (day% 2 == 0) {
            return false;
        }
        else
            return true;

    }
}
