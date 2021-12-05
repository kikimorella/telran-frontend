package de.telran.d211018.breakarray;

public class HomeWorkBreakArray {
    /* 1. (for) Маша выдает 50 кредитов в месяц, каждый раз при этом улучшая производительность на 1 кредит, Петя
    выдает 40 кредитов в месяц, улучшая производительность каждые 2 месяца на 1 кредит. Вася первые 10 месяцев выдает
    50 кредитов, ухудшая производительность на 1 кредит в месяц (50, 49, 48...), но потом берет себя в руки и работает
    стабольно 50 кредитов в месяц. сколько они навыдают за полтора года. написать функцию, которая принимает количество
    месяцев работы.
    2. распечатать массив задом наперед (если 1, 5 ,7 , то 7, 5 ,1)
    3. написать функцию, которая принимает массив int, а возвращает сумму всех нечетных элементов из нее (for & if)
    4. написать функцию, которая принимает массив int, а возвращает сумму всех положительных элементов из него (for & if)
    5. функция определяет, есть ли в массиве заданное число.
    static boolean function(int[]array,int number)
    6. функция считает сумму всех четных чисел из массива, не превышающих N. (не превышающий <=)
    static int function(int[]array,int number) */

    public static void main(String[] args) {
        int[] simpleArray = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        //Инициализация массива (заполнение конкретными данными)
        int[] anotherArray = {40, -35, -30, 25, 20, -15, -10, 5, 0};

        credit(50, 40, 50);

// 2
        printArrayReversed(simpleArray);
// 3
        printSumOddNumbers(anotherArray);
// 4
        printSumEvenNumbers(simpleArray);
        printSumEvenNumbers(anotherArray);
// 5
        System.out.println(findTheNumber(7, simpleArray));
        System.out.println(findTheNumber(-10, anotherArray));
        System.out.println(findTheNumber(42, new int[]{18, 26, 75, 42, 1, 57, 11})); // анонимная переменная
// 6
        System.out.println(sumEvenNumbersTill(7, simpleArray));
        System.out.println(sumEvenNumbersTill(30, anotherArray));
        System.out.println(countCredits(2));
    }

    // 2
    static void printArrayReversed(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // 3
    static int printSumOddNumbers(int[] array) {
        int sumOdd = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                sumOdd += array[i];
            }
        }
        return sumOdd;
    }

    // 4
    static int printSumEvenNumbers(int[] array) {
        int sumEven = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 && array[i] >= 0) {
                sumEven += array[i];
            }
        }
        return sumEven;
    }

    // 5
    static boolean findTheNumber(int number, int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                return true;
            }
        }
        return false;
    }

    //6
    static int sumEvenNumbersTill(int number, int[] array) {
        int sumEvenNumbers = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 && array[i] <= number) {
                sumEvenNumbers += array[i];
            }
        }
        return sumEvenNumbers;
    }

    // 1
    static void credit(int maryCreditPerformance, int peterCreditPerformance, int vasiaCreditPerformance) {
        int sumCredit = 0;

        for (int months = 1; months <= 18; months++) {

            int maryDynamics = maryCreditPerformance++;
            int peterDynamics = peterCreditPerformance;
            int vasiaDynamics = vasiaCreditPerformance--;

            if (months % 2 == 0) {
                peterDynamics = peterCreditPerformance++;
            }
            if (months > 10) {
                vasiaDynamics = 50;
            }
            int currentCredit = maryDynamics + peterDynamics + vasiaDynamics;
            sumCredit += currentCredit;
        }
        System.out.println(sumCredit);
    }
    static int countCredits(int monthNumber) {
        int vasyaPerMonth = 50;
        int petyaPerMonth = 40;
        int mashaPerMonth = 50;

        int res = 0;
        for (int i = 1; i <= monthNumber; i++) {
            res += vasyaPerMonth + petyaPerMonth + mashaPerMonth;
            mashaPerMonth++;

            if (i % 2 == 0)
                petyaPerMonth++;

            if (i < 10)
                vasyaPerMonth--;
            else
                vasyaPerMonth = 50;
        }
        return res;
    }
}
