package com.javarush.test.level04.lesson16.home03;

import java.io.*;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1,
 вывести на экран сумму и завершить программу.  -1 должно учитываться в сумме.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        boolean exit = false;
        int sum = 0;
        while (!exit) {
            String number = bufferedReader.readLine();
            int a = Integer.parseInt(number);
            sum = sum + a;
            exit = number.equals("-1");
        }
        System.out.println(sum);
    }

}


