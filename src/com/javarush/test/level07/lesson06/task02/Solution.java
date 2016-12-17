package com.javarush.test.level07.lesson06.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Самая длинная строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/
public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(bufferedReader.readLine());
        }
        int x = 0;
        for (int i = 0; i < list.size(); i++) {
            //for (int j = 1; j<list.size(); j++) {
            if (x <= list.get(i).length()) {
                x = list.get(i).length();
            }
//здесь находим самую большую строку
        }

        for (int i = 0; i < list.size(); i++) {
            if (x == list.get(i).length())
                System.out.println(list.get(i));

        }
// а здесь просто сравниваем каждый элемент сиспка с переменной x и в случае равнства, выводим на экран
    }
}



