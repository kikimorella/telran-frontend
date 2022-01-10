package de.telran.d211011.ifelsewhile;

public class HomeWorkWhileIfElse {
    public static void main(String[] args) {
        vasiaDecided(-7, 6);
        printVasyaAction(3, 25);
        cake(4);
        cake2(4);
        variables1(75, 90, 5);
        System.out.println();
        printArithmeticalProgression(1,10,3);
        variables2(150, 125, 10);
        System.out.println();
        printDecreasingArithmeticalProgression(10,1,3);
        variables3(55, 1);
        printNumbersDividedBy5or7or13(100);
        System.out.println(credit(2100, 1370) + " months");
        credit2(50);
    }

    /* 1. Известно, что дядя Вася идет на рыбалку в субботу, если температура воздуха от 23 до 29 включительно.
    дядя Вася каждый будний день ходит на работу. По воскресеньям дядя Вася идет в гости к соседу в баню, если
    температура воздуха ниже -5 включительно. Написать функцию, которая принимает день недели в формате int 1-7 и
    температуру воздуха, а распечатывает действия дяди Васи.*/
    // если над методом нажать /** + Энтр, то появится ссылка на условия, которые обязательны для соблюдения тем,
    // кто задает переменные

    /**
     * the method prints out the actions of Vasia depending on current dayOfTheWeek and temperature
     *
     * @param temperature
     * @param dayOfTheWeek must be from 1 to 7, otherwise the behavior unpredictable
     */
    static void vasiaDecided(int temperature, int dayOfTheWeek) { //я сделала
        // viod - метод ничего не возвращает, но делает работу
        if (dayOfTheWeek <= 0 & dayOfTheWeek > 7) {
            System.out.println("There is no such day of the week");
        } else if (dayOfTheWeek == 6 & temperature >= 23 & temperature <= 29) {
            System.out.println("Vasya is fishing today");
        } else if (dayOfTheWeek == 7 & temperature <= -5) {
            System.out.println("Vasya is at his neighbor's bania today");
        } else if (dayOfTheWeek <= 5) {
            System.out.println("Vasya is working today");
        } else {
            System.out.println("Vasya is resting");
        }
    }

    /**
     * The method prints out the actions of uncle Vasya depending on the current dayOfWeek and temperature
     *
     * @param dayOfWeek   must be from 1 to 7, otherwise the behavior unpredictable
     * @param temperature
     */
    static void printVasyaAction(int dayOfWeek, int temperature) {
        if (dayOfWeek >= 1 && dayOfWeek <= 5) {
            System.out.println("Uncle Vasya goes working");
        } else if (dayOfWeek == 6 && temperature >= 23 && temperature <= 29) {
            System.out.println("Uncle Vasya goes fishing");
        } else if (dayOfWeek == 7 && temperature <= -5) {
            System.out.println("Uncle Vasya goes to the neighbour's sauna");
        } else {
            System.out.println("Vasya has a rest");
        }
    }

    /*2. Петя, Маша и Вася решили встретиться в кафе. Петя и Маша пришли раньше. Петя заказал 4 куска торта, а Маша в 2
    раза меньше. Они съели по куску и пришёл Вася, который тут же заказал столько кусков, сколько лежало на столе + 1.
    Смогут ли они поделить имеющиеся куски на 3? Будет ли маша счастлива, если для счастья ей нужно не меньше 4х кусков.
    (можно сделать в main)*/
    static void cake(int peterCake) { //я сделала
        int maryCake = peterCake / 2; // 2
        int basilCake = (((peterCake - 1) + (maryCake - 1)) * 2) - 1; // ((4-1)+(2-1))*2-1=4*2-1=8-1=7
        int totalCakeOnTheTable = (maryCake - 1) + (peterCake - 1) + basilCake; // 1+3+7=11
        if (totalCakeOnTheTable % 3 == 0) { // 11/3=3*3+2
            System.out.println("The division of cake pieces succeeded");
        } else if (totalCakeOnTheTable % 3 == 1) {
            System.out.println("They succeeded in dividing the pieces of cakes, Basil quickly ate the extra piece");
        } else {
            System.out.println("They succeeded in dividing the pieces of cakes, but Basil quickly ate extra 2 pieces");
        }
        if ((totalCakeOnTheTable / 3) >= 4) { // если каждый получит по 4 куска, после того, как съели по 1
            System.out.println("Mary is happy");
        } else if (((totalCakeOnTheTable / 3) + 1) == 4) { // если маша получит 3 куска, но уже съела 1
            System.out.println("Mary is still happy");
        } else {
            System.out.println("Mary is not happy");
        }
    }

    static void cake2(int petyaOrdered) {
        final int mashaOrdered = petyaOrdered / 2;
        final int mashaAteBeforeVasyaCame = 1;
        final int petyaAteBeforeVasyaCame = 1;

        final int piesOnTableBeforeVasyaCame = petyaOrdered + mashaOrdered - mashaAteBeforeVasyaCame - petyaAteBeforeVasyaCame;

        final int vasyaOrdered = piesOnTableBeforeVasyaCame + 1;

        final int totalOnTable = piesOnTableBeforeVasyaCame + vasyaOrdered;

        if (totalOnTable % 3 == 0) {
            System.out.println("The pies can be shared by the guys");

            int mashaAteInTotal = mashaAteBeforeVasyaCame + totalOnTable / 3;
            if (mashaAteInTotal >= 4) {
                System.out.println("Masha is happy");
            }
        }
    }

    // 3. Написать функцию, которая распечатывает все числа от А до В с шагом Д (нач. с А), где А меньше В
    static void variables1(int someNummer1, int someBiggerNumber, int stepOne) {
        while (someNummer1 <= someBiggerNumber) {
            System.out.print(someNummer1 + " ");
            someNummer1 += stepOne; // запись a = a + d;
        }
    }
    /**
     * Prints all numbers between a and b with the step d, where a must be lower than b
     *
     * @param a
     * @param b
     * @param d
     */
    static void printArithmeticalProgression(int a, int b, int d) {
        int currentNumber = a;

        while (currentNumber <= b) {
            System.out.print(currentNumber + " ");
            currentNumber += d;
        }
        System.out.println();
    }

    // 4. Написать функцию, которая распечатывает все числа от А до В с шагом Д (нач. с А), где А больше В
    static void variables2(int someNummer2, int someLessNumber, int stepTwo) {
        while (someNummer2 >= someLessNumber) {
            System.out.print(someNummer2 + " ");
            someNummer2 -= stepTwo; // запись c = c - d;
        }
    }
    /**
     * Prints all numbers between a and b with the step d, where a must be greater than b
     *
     * @param a
     * @param b
     * @param d
     */
    static void printDecreasingArithmeticalProgression(int a, int b, int d) {
        int currentNumber = a;

        while (currentNumber >= b) {
            System.out.print(currentNumber + " ");
            currentNumber -= d;
        }
        System.out.println();
    }

    // 5. Распечатать все числа от 1 до А, кратные 5 или 7, или 13
    static void variables3(int someNummer3, int one) {
        System.out.print(one + " ");
        while (one <= someNummer3) {
            if ((one % 5 == 0) | (one % 7 == 0) | (one % 13 == 0)) {
                System.out.print(one + " ");
            }
            one++;
        }
    }

    static void printNumbersDividedBy5or7or13(int max) {
        int currentNumber = 1;

        while (currentNumber <= max) {
            if (currentNumber % 5 == 0 || currentNumber % 7 == 0 || currentNumber % 13 == 0) {
                System.out.print(currentNumber + " ");
            }
            currentNumber++;
        }
        System.out.println();
    }

    /* 6. Маша выдает в месяц 50 кредитов, Петя 80% от машиной производительности, Петя выдает 50% машиной
    производительности до того как выдано 1370 кредитов, а затем работает как маша.
    Сколько месяцев надо, чтобы команда выдала 2100 кредитов.*/
    // не могу придумать, куда сюда запихнуть if или while
    static int credit(int totalInPlan, int beforeMotivation) { //я сделала
        final double mashaV = 50; // скорость маши в месяц
        final double petyaV = mashaV * 0.8; // 40
        final double notMotivatedVasya = mashaV * 0.5; // 25
        final double motivatedVasya = mashaV * 1;
        final double motivatedCredits = totalInPlan - beforeMotivation; // 730
        final double totalVBeforeMotivation = mashaV + petyaV + notMotivatedVasya; // 115 общая скорость в месяц
        final double totalVAfterMotivation = mashaV + petyaV + motivatedVasya; //140 скорость до выполнения плана
        final double monthsBeforeMotivation = beforeMotivation / totalVBeforeMotivation; // 11.931
        final double monthsAfterMotivation = motivatedCredits / totalVAfterMotivation; // 5.214
        return (int) (monthsAfterMotivation + monthsBeforeMotivation); // 12+5=17
    }

    static void credit2(int mashaVelocity) {
        int petyaVelocity = mashaVelocity * 8 / 10;
        int lazyVasyaVelocity = mashaVelocity / 2;
        int motivatedVasyaVelocity = mashaVelocity;

        int totalGivenCredits = 0;
        int monthNumber = 0;

        while (totalGivenCredits < 2100) {
            if (totalGivenCredits < 1370) {
                totalGivenCredits += mashaVelocity + petyaVelocity + lazyVasyaVelocity;
            } else {
                totalGivenCredits += mashaVelocity + petyaVelocity + motivatedVasyaVelocity;
            }
            monthNumber++;
        }

        System.out.println(monthNumber + " months before its done");
        System.out.println(totalGivenCredits + " then its done");
    }
}
