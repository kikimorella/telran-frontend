package de.telran.d211115.list.picture;

public class Line extends Shape{

    int length;

    public Line(char symbol, int length) {
        super(symbol); // нужем для инициализации
        this.length = length;
    }

    @Override
    public void draw() { // печатаем символ нужное количество раз - получаем линию
        for (int i = 0; i < length; i++) {
            System.out.print(symbol);
        }
        System.out.println(); // что бы следующая фигура не рисовалась с той же строки
    }
}
