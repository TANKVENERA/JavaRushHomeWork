package com.javarush.test.level08.lesson11.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Нужно добавить в программу новую функциональность
Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
Новая задача: Программа должна работать не с номерами домов, а с городами:
Пример ввода:
Москва
Ивановы
Киев
Петровы
Лондон
Абрамовичи

Лондон

Пример вывода:
Абрамовичи
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //list of addresses
        List<String> addresses = new ArrayList<String>();
        List<String> secondName = new ArrayList<>();
        while (true) // тут необходимо после ввода города (если он пустой) оборвать дальнейший ввод и перейти
        // к вводу города для проверки наличия фамилии, чтобы не вводился второй пробел (в примере в условии
        // между вводом данных и проверочным словом  только один пробел)!!!
        {
            String city = reader.readLine();
            if (city.isEmpty()) break;
            String family = reader.readLine();


            addresses.add(city);
            secondName.add(family);
        }

        //read home number
        // int houseNumber = Integer.parseInt(reader.readLine());
        String city = reader.readLine();

        // if (0 <= houseNumber && houseNumber < addresses.size())
        for (int i = 0; i < addresses.size(); i++) {
            if (addresses.get(i).equals(city)) {
                String family = secondName.get(i);
                System.out.println(family);
            }
        }

    }
}
