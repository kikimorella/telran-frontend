package de.telran.d211014.switchfor;

public class HomeWorkSwitchFor {

    public static void main(String[] args) {
        vasiaDecision(6, 25);
        printVasyaAction(7, -5);
        printArithmeticalProgression(17, 115, 3);
        printDecreasingArithmeticalProgression(150, 75, 15);
        printNumbersDividedBy5or7or13(55);
        sumArithmeticProgressionWithWhile(1, 5, 2);
        sumArithmeticProgressionWithFor(12, 56, 4);
    }

    /* Известно, что дядя Вася идет на рыбалку в субботу, если температура воздуха от 23 до 29 включительно.
     дядя Вася каждый будний день ходит на работу. По воскресеньям дядя Вася идет в гости к соседу в баню, если
     температура воздуха ниже -5 включительно. Написать функцию, которая принимает день недели в формате int 1-7 и
     температуру воздуха, а распечатывает действия дяди Васи. Решить задачу про Васю, используя switch для выбора
     дня недели
     */
    static void vasiaDecision(int dayOfTheWeek, int temperature) {
        switch (dayOfTheWeek) {
            case 1:
                System.out.println("The Day of week is Monday. Vasya is working today");
                break;
            case 2:
                System.out.println("The Day of week is Tuesday. Vasya is working today");
                break;
            case 3:
                System.out.println("The Day of week is Wednesday. Vasya is working today");
                break;
            case 4:
                System.out.println("The Day of week is Thursday. Vasya is working today");
                break;
            case 5:
                System.out.println("The Day of week is Friday. Vasya is working today");
                break;
            case 6:
                System.out.println("The Day of week is Saturday");
                if (temperature >= 23 && temperature <= 29) {
                    System.out.println("Vasya is fishing today");
                } else {
                    System.out.println("Vasya is resting");
                }
                break;
            case 7:
                System.out.println("The Day of week is Sunday");
                if (temperature <= -5) {
                    System.out.println("Vasya is at his neighbor's bania today");
                } else {
                    System.out.println("Vasya is resting");
                }
                break;
            default:
                System.out.println("Vasya, picked the wrong mushrooms");
                break;
        }
    }

    static void printVasyaAction(int day, int temperature) {
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Today is a workday. Vasya goes working");
                break;
            case 6:
                System.out.println("Today is a day off");
                if (temperature >= 23 && temperature <= 29) {
                    System.out.println("Vasya goes fishing");
                } else {
                    System.out.println("Vasya has a rest");
                }
                break;
            case 7:
                System.out.println("Today is a day off");
                if (temperature <= -5) {
                    System.out.println("Vasya goes to the neighbour's sauna");
                } else {
                    System.out.println("Vasya has a rest");
                }
                break;
            default:
                System.out.println("Vasya, wake up!");
                break;
        }
    }

    /*Написать функцию, которая распечатывает все числа от А до В с шагом Д (нач. с А), где А меньше В
    Решить задачу через for*/
    static void printArithmeticalProgression(int a, int b, int d) {
        for (int currentNumber = a; currentNumber <= b; currentNumber += d) {
            System.out.print(currentNumber + " ");
        }
        System.out.println();
    }

    /*Написать функцию, которая распечатывает все числа от А до В с шагом Д (нач. с А), где А больше В
    Решить задачу через for*/
    static void printDecreasingArithmeticalProgression(int a, int b, int d) {
        for (int currentNumber = a; currentNumber >= b; currentNumber -= d) {
            System.out.print(currentNumber + " ");
        }
        System.out.println();
    }

    /* Распечатать все числа от 1 до А, кратные 5 или 7, или 13.  Решить задачу через for*/
    static void printNumbersDividedBy5or7or13(int max) {
        for (int currentNumber = 1; currentNumber <= max; currentNumber++) {
            if (currentNumber % 5 == 0 || currentNumber % 7 == 0 || currentNumber % 13 == 0) {
                System.out.print(currentNumber + " ");
            } // нужно иметь в виду, что так не выплняется условия о начале отсчета с 1
        }
        System.out.println();
    }

    /*Написать функцию, которая принимает целые числа А, В, С, а возвращает сумму чисел от А до В с шагом С,
     решить через while и через for*/
    static void sumArithmeticProgressionWithWhile(int startNumber, int maxNumber, int stepNumber) {
        int sum = 0; // так мы вводим переменную, с которой можно работать и начинать лучше с 0
        int currentNumber = startNumber; // на 1 действии это наше стартовое число и переменная
        while (currentNumber <= maxNumber) {
            sum += currentNumber; // 1. если поменять местами
            currentNumber += stepNumber; // 2. результат будет не верным

        }
        System.out.println(sum);
    }

    static void sumArithmeticProgressionWithFor(int startNumber, int maxNumber, int stepNumber) {
        int sum = 0; // если while написан нормально, то его легко перевести в for
        for (int currentNumber = startNumber; currentNumber <= maxNumber; currentNumber += stepNumber) {
            sum += currentNumber;
        }
        System.out.print(sum);
    }
}
