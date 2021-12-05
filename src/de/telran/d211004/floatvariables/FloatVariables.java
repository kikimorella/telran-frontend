package de.telran.d211004.floatvariables;

public class FloatVariables {

    public static void main(String[] args) {
        float a = 10.5f; // f в конце обозначает тип, требует меньше места в памяти
                        // между целым числом и дробной частью ставят "." (американская система)
        float anotherFloat = a + 15.5f; //  float + float = anotherFloat

        double b = 8.5; // d можно поставить в конце. используется, когда нужны супер точные вычисления

        double c = a + b; // 19.0
        // 19.0 = x * 2.5 + d, 0 <= d < 2.5
        // % - знак деления с остатком, нужно когда определяют "чётность" числа, редкая операция
        c = c % 2.5;//1.5
        b = b / 3;
        System.out.println(c);

        double doubleNumber = 15.7;
        int intNumber = 5;
        double anotherDouble = doubleNumber/ intNumber;
        // float имеет меньше разрядов, double - точнее
        System.out.println(anotherDouble);
        // даункастинг и он должен быть корректен
        int wholePart = (int) anotherDouble;    // (int) - убирает цифры после запятой
                                                // нельзя: int wholePart = anotherDouble;
        double d = intNumber;
        System.out.println(wholePart);
    }
}
