package de.telran.d211115.list.picture;
/*
Символы описываются в языке Java char типом. По большому счёту это все буквы, числа и специальные символы существующие
на нашей планете. Размер 2 байта. Каждому символу соответствует определённое число из таблицы кодировки UTF-16 и Java
при виде этого числа в рамках типа char выводит его на экран как символ (числа от 0 до 65535).
Отрицательных значений для типа char не существует. Это единственное без знаковый целочисленный тип данных в Java.

Например, при выполнении char c2 = 97; System.out.println(c2); на консоль выведется "а".
*/
public abstract class Shape { //В реальности не существует геометрической фигуры как таковой.
    // Есть круг, прямоугольник, квадрат, но просто фигуры нет.
    char symbol; // доступен родительскому классу и классам в том же package (если хотим дать доступ для дочерних
    // классов нужно поставить protected)

    public Shape(char symbol) {
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }

    public abstract void draw (); // абстрактный метод

}
