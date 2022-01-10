package de.telran.d211004.floatvariables;

public class Example {

    final static int SOME_INT_CONST = 15;
    // final - делает переменную- константой, нельзя изменить значение финальной переменной

    public static void main(String[] args) {
        // У Маши есть 2 яблока, а у Пети есть 4 яблока. Сколько яблок у детей?
        int mashaApple = 2; //локальные переменные
        int peterApple = 4;

        int totalAplples = mashaApple+peterApple;
        System.out.println("Masha and Petya have " + totalAplples + " apples in total");

        /*Конвенции оформления кода:
        1. пакеты (Packages) структура пути должна совпадать, "." делит папки
        название файла, в котором лежит публичный класс
        названия пакетов пишутся с маленькой букты, но можно поставить "_" в качестве разделителя слов (редко)
        2. Классы пишутся: ClassName
        3. Названия Методов всегда глаголы, а Переменных всегда существительные, (кроме main)
        4. Названия Методов и Переменных пишутся camelCase, methodName, variableName
        5. Константы не меняются и пишутся CONSTANT_NAME
         */

    }
}
