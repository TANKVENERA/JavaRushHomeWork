package com.javarush.test.level05.lesson12.bonus03;

import java.io.*;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = Integer.MIN_VALUE;
        String name = reader.readLine();
        int N = Integer.parseInt(name);
       if  (N>0){
            for (int i =1; i<=N; i++)
            {
                String name1 = reader.readLine();
                int n = Integer.parseInt(name1);
                if (maximum<n) {
                    maximum = n;
                }

            }

        }
        System.out.println(maximum);
    }

}
