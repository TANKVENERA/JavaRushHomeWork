package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[]  mass= new int[5];
        for (int i = 0; i<5; i++) {
            mass[i] = Integer.parseInt(reader.readLine());
    }
        for (int i = 0; i<5; i++) {
            for (int j=0; j<4; j++) {
                if (mass[j]>mass[j+1] ) {
                    int x = mass[j];  // x =2  = mass[i]   [2 1 3 4 5 ]
                    mass[j]=mass[j+1];  //2 =1
                    mass[j+1]=x;
                }
            }
        }
        for (int i=0; i<mass.length; i++){
            System.out.println(mass[i]);
        }

    }

}