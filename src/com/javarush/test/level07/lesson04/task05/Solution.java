package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький,
 вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
       BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int bigmas[] = new int[20];
        int smallA[] = new int[10];
        int smallB[] = new int[10];
        for (int i = 0; i<bigmas.length; i++) {
            int a = Integer.parseInt(bufferedReader.readLine());
            bigmas[i] = a;
        }
        for (int i = 0; i<smallA.length; i++) {
            smallA[i] = bigmas[i];
        }
        for (int i = 10; i<bigmas.length; i++) {
            smallB[i-10] = bigmas[i];
            System.out.println(smallB[i-10]);
        }

    }
}
