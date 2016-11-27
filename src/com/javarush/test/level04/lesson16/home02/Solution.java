package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
       BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        String number1 = bufferedReader.readLine();
        String number2 = bufferedReader.readLine();
        String number3 = bufferedReader.readLine();
        int a =Integer.parseInt(number1);
        int b =Integer.parseInt(number2);
        int c =Integer.parseInt(number3);
        if ((a<b && b<c)||(a>b && b>c)) {
            System.out.println(b);
        }
        else if ((b<c && c<a) || (b>c && c>a)) {
            System.out.println(c);
        }
        else if ((b<a && a<c)||(b>a && a>c)) {
            System.out.println(a);
        }
    }
}
