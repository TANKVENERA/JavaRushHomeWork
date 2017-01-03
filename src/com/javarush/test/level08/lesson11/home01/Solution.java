package com.javarush.test.level08.lesson11.home01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* Set из котов
1. Внутри класса Solution создать public static класс кот – Cat.
2. Реализовать метод createCats,
он должен создавать множество (Set) котов и добавлять в него 3 кота.
3. В методе main удалите одного кота из Set cats.
4. Реализовать метод printCats,
он должен вывести на экран всех котов, которые остались во множестве. Каждый кот с новой строки.
*/

public class Solution
{
    public static void main(String[] args) {

        Set<Cat> cats = createCats();
        Iterator it = cats.iterator();
        if (it.hasNext()) {
            cats.remove(it.next());
            //напишите тут ваш код. пункт 3

            printCats(cats);
        }
    }
    public static Set<Cat> createCats()
    {

        Set<Cat> set = new HashSet<>();
        set.add(new Cat());
        set.add(new Cat());
        set.add(new Cat());


        //напишите тут ваш код. пункт 2
        return set;
    }

    public static void printCats(Set<Cat> cats)
    {

       for (Cat x :cats) {
           System.out.println(x);
       }
        // пункт 4

    }
   public static class Cat {
//       String name;
//       public Cat (String name) {
//        this.name = name;
//       }
//
//       @Override
//       public String toString() {
//           return name;
//       }
   }
//* ничего не сказано добавлять в  класс, значит не добавляем
    // пункт 1
}
