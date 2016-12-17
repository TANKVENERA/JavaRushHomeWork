package com.javarush.test.level07.lesson04.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Массив из чисел в обратном порядке
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Расположить элементы массива в обратном порядке.
4. Вывести результат на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int massiv [] = new int[10];
        for (int i = 0; i<massiv.length; i++) {
            String number = bufferedReader.readLine();
            int n = Integer.parseInt(number);
            massiv[i] = n;
        }
        for (int i = 9; i>=0; i--) {
            System.out.println(massiv[i]);
        }
    }
}
// Распологать элементы в порядке убывания можно сразу выводя их на экран  циклом: for (int i = 9; i>=0; i--)