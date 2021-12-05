package de.telran.d211115.list;

import de.telran.d211115.list.picture.Line;
import de.telran.d211115.list.picture.Picture;
import de.telran.d211115.list.picture.Rectangle;
import de.telran.d211115.list.picture.Shape;

/*
    1. взять проект с работниками и адаптировать его таким образом, что класс Employee абстрактным
    2. Описать следующие классы:
    - абстрактный класс Shape (фигура), обладает полем char symbol, и абстрактным методом draw(). Символ - это то, чем
    надо рисовать фигуру, а метод draw() - метод (нереализованный), который отрисовывает фигуру в консоль
    - класс Line, наследует фигуру, имеет дополнительное поле int length - длина линии.
    Метод draw у линии должен отрисовывать length символов в строку
    - класс Rectangle, наследует фигуру - имеет дополнительные поля height и width. Метод draw отрисовывает символом
    прямоугольник высотой height и шириной width. (*) нарисовать прямоугольник полым.
    - класс Picture, наследует фигуру, дополнительным полем которого является массив фигур.
    Метод draw() должен отрисовать все эти фигуры по порядку.
    - поиграть с этим в методе main
    3. Дописать CustomArrayList (в моём случае ArrayCustomList)
    */
public class HomeWorkPictureMain {
    public static void main(String[] args) {
        Shape line = new Line('&', 6);
        Shape line1 = new Line('+', 5);
        Shape line2 = new Line('-', 10);

        Shape rect = new Rectangle('.', 6, 4);
        Shape rect1 = new Rectangle('*', 5, 3);

        Shape square = new Rectangle(',', 3, 3);

        Shape line0 = new Line('%', 5);

        Shape picture = new Picture('5', new Shape[]{line, rect, square, line0});
        picture.draw();
        Shape picture1 = new Picture('1', new Shape[]{line1, rect1});
        Shape picture2 = new Picture('2', new Shape[]{line2, picture1});

        picture1.draw();
        picture2.draw();
    }
}
