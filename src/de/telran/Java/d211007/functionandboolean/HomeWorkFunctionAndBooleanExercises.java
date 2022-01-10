package de.telran.d211007.functionandboolean;

public class HomeWorkFunctionAndBooleanExercises {
    // 1. написать  функцию, которая возвращает квадрат int числа.
    // 2. Написать ещё 1 функщию, которая возвращает куб числа.
    // 3. написать функцию, которая определяет является ли число положительным и при этом делится на 3
    // 4. написать функцию, которая определяет является ли число положительным и при этом делится на 5 или на 7
    // 5. написать функцию, которая определяет является ли число положительным и находится в диапозоне от 100 до 200.
    /* 6. Маша, Петя и Вася выдают кредиты в банке. Маша выдает 1 кредит за 1 час. Петя работает со скоростью
     составляющей 0,8 от скорости Маши. Вася работает в 2 раза медленнее Маши, но когда замотивирован, то с такой
     же скоростью. Известно, что Вася замотивирован, если 80% от плана работники выполнили.
     выполнили ли работники план, если план составляет 1150 кредитов, а Маша выдала 490 из них.
     (написать функцию, которая принимает аргументом число кредитов в плане и число выданных Машей кредитов,
     а возвращает boolean true или false)*/

    public static void main(String[] args) {
        int firstNumber = squareNumber(50);
        int secondNumber = cubeNumber(75);
        // boolean thirdNumber = isDividedByNumber(60, 3);
        // boolean forthNumber = isDividedByNumber(70, 5) | isDividedByNumber(70, 7);
        boolean someBoolean = isDividedBy5Or7(70) & positiveAndInTheRange (120);
        boolean someBoolean2 = isDividedBy5Or7(70) && positiveAndInTheRange (120);
        boolean thirdNumber = isDividedBy3AndPositive(60);
        boolean forthNumber = isDividedBy5Or7(70);
        boolean fifthNumber = positiveAndInTheRange(120);
        boolean creditPlanDone = isPlanFinished(490,1150);

        System.out.println(firstNumber);
        System.out.println(secondNumber);
        System.out.println(thirdNumber);
        System.out.println(someBoolean + " if one &"); // редко используется
        System.out.println(someBoolean2 + " if one &&"); // обычно пишут 2 знака
        System.out.println(forthNumber);
        System.out.println(fifthNumber);
        System.out.println(creditPlanDone + " sure");
    }

    static int squareNumber(int number) {
        return number * number;
    }

    static int cubeNumber(int number) {
        return number * number * number;
    }

    static boolean isPositiveNumber(int number) {
        return number > 0;
    }

    /* static boolean isDividedByNumber (int number, int divider){
        boolean notZero = divider != 0; // не забываем, что на 0 делить нельзя
        int isDividedBy = number % divider;
        boolean result = isDividedBy == 0;
        return result & notZero & isPositiveNumber(number) ;*/

    //static boolean isDividedBy3AndPositive(int number) {return number >0 & number % 3 == 0;}

    static boolean isDividedBy3(int number) { // никто в здравом уме не пишет так, т.к. можно записать 1 строчкой
        int remainder = number % 3;
        boolean result = remainder == 0;
        return result;
    }
    static boolean isDividedBy3AndPositive(int number) {
        return isPositiveNumber(number) & isDividedBy3(number);
    }

    static boolean isDividedBy5Or7(int number) {
        return ((number % 5 == 0) | (number % 7 == 0)) & isPositiveNumber(number); // сначала выполняется операция И,
        // а потом ИЛИ, т.о. операцию ИЛИ нужно прятать в скобки
    }

    //  static boolean isDividedBy5Or7(int number) {return number >0 & ((number % 5 == 0) | (number % 7 == 0));}

    static boolean isInTheRange(int number) {
        boolean examination100 = number >= 100; // не стоит так писать: boolean examination100 = 100 < number;
        boolean examination200 = number <= 200; // не забываем, что = тоже нужно включать!
        return examination100 & examination200;
    }

    // static boolean isInTheRange(int number) {return number >= 100 & number <= 200:}

    static boolean positiveAndInTheRange(int number) {
        return isPositiveNumber(number) & isInTheRange(number);
    }
    static boolean isPlanFinished(int maryCreditCount, int creditPlan){
        double maryPace = 1; // скорость работы маши
        double maryTotalWorkTime = maryCreditCount / maryPace; // время работы маши
        double creditPlan80Percent = creditPlan * 0.8; // 80% от общего числа кредитов
        double totalNormalWorkPace = 1 + 0.8 + 0.5; // нормальная работа
        double workTimeUntil80Percent = creditPlan80Percent / totalNormalWorkPace; // время на исполнение 80%
        double timeAfter80Percent = maryTotalWorkTime - workTimeUntil80Percent; // оставшееся время работы
        double totalActiveWorkPace = 1 + 0.8 + 1; // работа, когда вася активен
        double actualWorkDoneLast20Percent = timeAfter80Percent * totalActiveWorkPace;
        double actualWorkDoneFirst80Percent = workTimeUntil80Percent * totalNormalWorkPace;
        return (actualWorkDoneLast20Percent + actualWorkDoneFirst80Percent) >= creditPlan;
    }
}
