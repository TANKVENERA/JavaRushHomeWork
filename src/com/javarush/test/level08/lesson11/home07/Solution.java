package com.javarush.test.level08.lesson11.home07;

/* Переставь один модификатор static
Переставь один модификатор static, чтобы пример скомпилировался.
*/

public class Solution
{
    public static int A = 5;  // статические методы и переменные не могут пользоваться нестатич методами и переменными,
    public static int B = 2;  // а нестатики могут использовать статики!!!

    public    int C = A*B;
    public static int D = B*A;

    public static void main(String[] args)
    {
    }

    public  int getValue()
    {
        return D;
    }

    public   int getValue2()
    {
        return C;
    }
}

