package com.javarush.test.level04.lesson06.task01;

/* Минимум двух чисел
Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String number1 = bufferedReader.readLine();
        String number2 = bufferedReader.readLine();
        int a =Integer.parseInt(number1);
        int b =Integer.parseInt(number2);
        if (a<b)
            System.out.println(+a);
        else
            System.out.println(+b);

    }
}