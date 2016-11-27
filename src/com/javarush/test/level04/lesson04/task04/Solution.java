package com.javarush.test.level04.lesson04.task04;

/* Время года
Реализовать метод checkSeason. По номеру месяца, метод должен определить время года (зима, весна, лето, осень)
 и вывести на экран.
Пример для номера месяца 2:
зима
Пример для номера месяца 5:
весна
*/

public class Solution
{
    public static void main(String[] args) {
        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);
    }

    public static void checkSeason(int mount){
        if (12<=mount || mount<=2) {
            System.out.println("зима");
        }
        if (3<=mount && mount<=5) {
            System.out.println("весна");
        }
        if (6<=mount && mount<=8) {
            System.out.println("лето");
        }
        if (9<=mount && mount<=11) {
            System.out.println("осень");
        }
    }
}