package com.javarush.test.level04.lesson07.task04;

/* Положительные и отрицательные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных и количество отрицательных чисел в
 исходном наборе,
в следующем виде:
"количество отрицательных чисел: а", "количество положительных чисел: б", где а, б - искомые значения.
Пример для чисел 2 5 6:
количество отрицательных чисел: 0
количество положительных чисел: 3
Пример для чисел -2 -5 6:
количество отрицательных чисел: 2
количество положительных чисел: 1
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String number1 =bufferedReader.readLine();
        String number2 = bufferedReader.readLine();
        String number3 = bufferedReader.readLine();

        int a = Integer.parseInt(number1);
        int b = Integer.parseInt(number2);
        int c = Integer.parseInt(number3);
        int m=0; // отрицацельные
        int n=0; // положительные
        if (a<0 && b<0 && c<0) {
            m = 3;
            n = 0;
//            System.out.println("количество отрицательных чисел:" + m);
//            System.out.println("количество положительных чисел:" + n);
        }
        if (a>0 && b>0 && c>0) {
            m = 0;
            n = 3;
//            System.out.println("количество отрицательных чисел:" + m);
//            System.out.println("количество положительных чисел:" + n);
        }
        if ((a>0 && b>0 && c<0) || (a>0 && c>0 && b<0) || (b>0 && c>0 && a<0)) {
            m = 1;
            n = 2;
        }
        if ((a>0 && b<0 && c<0) || (b>0 && c<0 && b<0) || (c>0 && a<0 && b<0)) {
            m = 2;
            n = 1;
        }
        System.out.println("количество отрицательных чисел: "+m);
        System.out.println("количество положительных чисел: "+n);
    }
}
