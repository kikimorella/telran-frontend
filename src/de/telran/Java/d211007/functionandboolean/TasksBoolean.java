package de.telran.d211007.functionandboolean;

public class TasksBoolean {
    // таблица истинности
    // a   b   ||  &&  ^^
    // +   +   +   +   -
    // +   -   +   -   +
    // -   +   +   -   +
    // -   -   -   -   -
    public static void main(String[] args) {
        boolean a = true;
        System.out.println(a);
        System.out.println(!a); // ! - отрицание или "не а"
        boolean b = true;
        boolean result = a | b; // true
        System.out.println(result);
        System.out.println( );

        // or (|)operation - дидъюнкция
        System.out.println(true | true); // true
        System.out.println(true | false); // true
        System.out.println(false | true); // true
        System.out.println(false | false); // false
        System.out.println( );
        // если мы ставим ||, то если 1 выражение true, то 2-е не считают

        //and (&) operatiom - амперсант (конъюнкция)
        System.out.println(true & true); // true
        System.out.println(true & false); // false
        System.out.println(false & true); // false
        System.out.println(false & false); // false
        System.out.println( );
        // если мы ставим &&, то если 1 выражение true, то 2-е не считают, что экономит время расчета

        //xor (^) operatiom - антиваленц ("либо")
        System.out.println(true ^ true); // false
        System.out.println(true ^ false); // true
        System.out.println(false ^ true); // true
        System.out.println(false ^ false); // false
        System.out.println( );

        // 1. !(a&b)=!a|!b
        // 2. !(a|b)=!a&!b
        // 3. a|(b&c)=(a|b)&(a|c)
        // 4. a&(b|c)= (a&b)|(a&c)

        // операторы сравнения переводят числа в boolean переменную
        // comparison operators: >, >=, <, <=, ==, !=
        int someInt = 15;
        double someDouble = -23.7;
        boolean isSomeIntGreaterThanSomeDouble = someInt > someDouble;

        // exersises
        boolean someRes = isDividedBy15(15);
        System.out.println((someRes)); // true

        someRes = isDividedBy15(25);
        System.out.println(someRes); // false

        System.out.println(isDividedBy15Second(30)); //true
    }

    // write a function which determines a number is divided by 15
    static boolean isDividedBy15(int number) {
        int remeinder = number % 15; // получаем остаток от деления
        boolean res = remeinder == 0; // в случае, если остаток равен 0, то +, если не равен 0, то -
        return res;
        // retun number %15 == 0; // можно и так записать
    }

    // write a function which determines a number is divided by 15
    static boolean isDividedBy15Second(int number) {return (isDividedBy3(number)) & (isDividedBy5(number));}
    static boolean isDividedBy3(int number) {
        return number %3 == 0;
    }
    static boolean isDividedBy5(int number) {
        return number %5 == 0;
    }

    /*можно записать таким вариантом:
        static boolean isDividedBy15Second(int number) {
        boolean isDividedBy3 = number % 3 == 0;
        boolean isDividedBy5 = number % 5 == 0;
        boolean res = isDividedBy3 & isDividedBy5;
        return res;*/
}