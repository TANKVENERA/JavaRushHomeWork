package com.javarush.test.level04.lesson13.task02;

import java.io.*;

/* Рисуем прямоугольник
Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
Пример: m=2, n=4
8888
8888
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String number1 = bufferedReader.readLine();
        String number2 = bufferedReader.readLine();
        int m = Integer.parseInt(number1);
        int n = Integer.parseInt(number2);
        for (int i = 1; i <= m; i++) {
            for (int x = 1; x <= n; x++) {
                System.out.print("8");
            }
            System.out.println();
        }


    }
}
