package com.javarush.test.level08.lesson11.home05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Мама Мыла Раму. Теперь с большой буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
  мама     мыла раму.

Пример вывода:
  Мама     Мыла Раму.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        char[] x = s.toCharArray();


        for (int i = 0; i < x.length; i++) {


            if (Character.toString(x[i]).equals(" ") && !Character.toString(x[i + 1]).equals(" ")) { // здесь проверим, является ли символ
                // пробелом, а след. символ - буквой
                System.out.print(x[i]); // печатаем пробел
                System.out.print(Character.toUpperCase(x[i + 1])); // печатаем заглавную букву
                i++; // и так как  , например, для i = 5 мы напечатаем сразу две строки (пробел и Заглавную букву), то необходимо увеличить счетчик,
                // чтобы перейти к след символу, а не напечатать его второй раз.
            } else
                System.out.print(x[i]); // здесь просто печатаем символ
        }
    }

    //напишите тут ваш код
}



