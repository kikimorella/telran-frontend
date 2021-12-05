package de.telran.d211007.functionandboolean;

public class HomeWorkStarTask {
    /* 6. Маша, Петя и Вася выдают кредиты в банке. Маша выдает 1 кредит за 1 час. Петя работает со скоростью
     составляющей 0,8 от скорости Маши. Вася работает в 2 раза медленнее Маши, но когда замотивирован, то с такой
     же скоростью. Известно, что Вася замотивирован, если 80% от плана работники выполнили.
     выполнили ли работники план, если план составляет 1150 кредитов, а Маша выдала 490 из них.
     (написать функцию, которая принимает аргументом число кредитов в плане и число выданных Машей кредитов,
     а возвращает boolean true или false)*/

    // стыдно, но просидела 5 часов, пока не разобралась более подробно. было интересно.

    public static void main(String[] args) {
        System.out.println(executedPlan(490, 1150));
        System.out.println(executedPlan(110, 1150));
        System.out.println(executedPlan(530, 1150)); // можно писать и так
        // чтоб не писать boolean creditPlanDone = isPlanFinished(490,1150); и System.out.println(creditPlanDone);
        System.out.println(isPlanCompleted (1150,480));
    }

    static boolean executedPlan(int maryCreditCount, int creditPlan) {// маша выдает кредитов
        int maryWork = 1; // 1 кредит
        int maryCreditTime = 60; // 1 час, расчет будет плохой, т.к. 8 часоов в день и т.д.
        double peterCreditCount = maryCreditCount * 0.8; // петя выдает кредитов
        double vasiaCreditCount = maryCreditCount / 2d;// вася выдает кредитов обычно в 2 раза меньше маши
        double vasiaCreditActive = maryCreditCount * 1d; // вася выдает кредиты, когда замотивирован

        double normalTotalWork = maryWork + maryWork * 0.8 + maryWork / 2d; // количество кредитов за maryCreditTime

        double normalCreditCount = creditPlan * 0.8;//920 кредитов - после этого значения вася лучше работает
        double activeCreditCount = creditPlan - normalCreditCount; // 230 последних кредитов вася работает хорошо

        double normalWorkTime = normalCreditCount * ((maryCreditTime + maryCreditTime * 0.8 + maryCreditTime / 2d));
        // работы с нормальной скоростью
        double activeWorkTime = activeCreditCount * (maryCreditTime * 2 + maryCreditTime * 0.8);

        double allTimeNeeded = normalWorkTime + activeWorkTime;

        /*double averageTimeFor1Credit = allTimeNeeded / creditPlan; // на 1 кредит в среднем
        double actualWorkDone = (maryCreditCount + peterCreditCount + vasiaCreditActive) * averageTimeFor1Credit;
        return actualWorkDone >= allTimeNeeded;
        // решение получается не точное, мне не нравится */

        double maryCredit80Percent = normalCreditCount / normalTotalWork; // 400 дел только маше, чтоб набрать 80%

        if (maryCreditCount <= maryCredit80Percent) { // мы это не преходили, но лучше бы впихнуть
            double totalCreditCount = maryCreditCount + peterCreditCount + vasiaCreditCount;
            // количество кредитов, выданнох до 80%, т.е. если маша выдала меньше 400 кредитов, то мы просто считаем
            return totalCreditCount > creditPlan; // план не выполнен
        }

            double actualActiveCreditCount = maryCreditCount - maryCredit80Percent;// сколько фактически сделано больше
            // если меньше, то будет отрицательное значение и его использовать нельзя, т.к. расчёт будет неверным
            double actualCreditAfterMotivation = actualActiveCreditCount *
                    (maryCreditCount + peterCreditCount + vasiaCreditActive); //сколько выдано кредитов после мотивации
        /* по хорошему, нужно учесть, что вася так работает только в определенный промежуток и на остаток кредитов,
        (нам не известно, как кто работает после выполнения плана), т.е. надо, по идее, впихнуть
        boolean examinationPlan = actualCreditAfterMotivation < normalCreditPlanCount; // выдано 80% кредитов
        boolean examinationEnd = actualCreditAfterMotivation < creditPlan; // план выполнен
        return examinationPlan | examinationEnd;*/

            double actualWorkDone = (actualCreditAfterMotivation * activeWorkTime) + (normalCreditCount * normalWorkTime);

            return actualWorkDone >= allTimeNeeded;

    }
    /*
    пусть 1 = скорость маши
    скорость пети = 0,8
    немотивированный васы = 0,5
    суммарная скорость 80% плана = 2,3
    80% плана - 0,8 * 1150 = 920
    тогда маша сделает 920/2,3 кредитов в первых 80% плана = 400 (или тогда они затратили 400 часов)
    оставшиеся 20% плана 230 кредитов
    суммарная скорость 2,8 (1+0,8+1)
    тогда маша должна выдать 230/2,8 кредитов =82
    тогда, если план выполнен, то маша сделала как минимум 400+83=483 кредита

    */
    static boolean isPlanCompleted (int totalInPlan, int mashaMade) {
        final double mashaV = 1;
        final double petyaV = mashaV * 0.8;
        final double notMotivatedVasya = mashaV * 0.5;
        final double motivatedVasya = mashaV;

        final double totalFirstPackV = mashaV + petyaV + notMotivatedVasya;
        final double totalSecondPackV = mashaV + petyaV + motivatedVasya;

        final int firstCreditPack = totalInPlan * 8 / 10;
        final int secondCreditPack = totalInPlan - firstCreditPack;

        final int firstPackMashaMade = (int) (firstCreditPack/totalFirstPackV);
        final int secondPackMashaMade = (int) (secondCreditPack/totalSecondPackV);
        return mashaMade >= firstPackMashaMade + secondPackMashaMade;
    }
}




