package com.javarush.test.level05.lesson07.task05;

/* Создать класс прямоугольник (Rectangle)
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height
 (левая координата, верхняя, ширина и высота). Создать для него как можно больше методов initialize(…)
Примеры:
-	заданы 4 параметра: left, top, width, height
-	ширина/высота не задана (оба равны 0)
-	высота не задана (равно ширине) создаём квадрат
-	создаём копию другого прямоугольника (он и передаётся в параметрах)
*/

public class Rectangle
{
    int top;
    int left;
    int width;
    int height;
    public void initialize (int top, int left, int width, int height) {
        this.top=top;
        this.left=left;
        this.height=height;
        this.width=width;
    }
    public void initialize (int top, int left) {
        this.top=top;
        this.left=left;


    }
    public void initialize (int height, int width, int left) {
        this.height=height;
        this.width=width;
        this.left=left;

    }
    public void initialize (Rectangle rectangle) {
        this.top=rectangle.top;
        this.height=rectangle.width;

    }

}
