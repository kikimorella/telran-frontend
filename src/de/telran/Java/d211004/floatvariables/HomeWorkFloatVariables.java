package de.telran.d211004.floatvariables;

public class HomeWorkFloatVariables {
    // Маша съела 2,5 яблока, а Петя съел 3,5 яблока. Сколько всего яблок они съели?

    /* Даша съела половину пирога, а Рома съел в 2 раза меньше Даши, а Вася съел в 4 раза больше,
    чем Даша и Рома вместе. Сколько всего пирогов (в дробном смысле) они съели? */

    public static void main(String[] args) {
        double maryApple = 2.5;
        double peterApple = 3.5;

        double totalAplple = maryApple + peterApple; // 6

        System.out.println("Children ate " + totalAplple + " apples.");

        int totalAplple2 = (int) maryApple + (int) peterApple; // 5
        /* (int) отрезает! до целых чисел, вне зависимости от значений после запятой, т.е. даже (int)2.99 - это 2
        (при математической округлении, если после запятой число > 5, то округление в большую сторону) */
        // в данном случае, округляется каждое отдельное значение.

        System.out.println("Children ate " + totalAplple2 + " whole apples.");
        /* ответ был бы верным, если для решения нужно ответить на вопрос: "сколько целых яблок съели дети,
        если покусанные яблоки они выкидывают"*/

        float maryApples = 2.5f; // лучше не именовать во множественном чиле, можно запутаться с переменными
        float peterApples = 3.5f; // множественным числом именуются: списки переменных, массивы переменных и т.д.

        float totalApples = maryApples + peterApples; // лучше именовать более конкретно (maryAppleQty, maryAppleNumber)

        System.out.println("Mary and Peter ate " + totalApples + " apples together.");

        int totalAplples2 = (int) (maryApples + peterApples); // 6
        // в данном случае (int) округляется результат операции сложения.

        System.out.println("Mary and Peter ate " + totalAplples2 + " whole apples together.");
        // для такого решения подходит вопрос: "сколько целых яблок съели дети, если яблоки порезаны на половинки"

        float dashaPie = 1.000f / 2.000f; // 0.5 - дробное значение записать в коде нельзя, только "операцию деление"
        float romaPie = dashaPie / 2; // 0.25
        float vasiaPie = (dashaPie + romaPie) * 4; // 3.0

        float totalPie = dashaPie + romaPie + vasiaPie;

        System.out.println("Children ate " + totalPie + " pies.");

        int totalPie2 = (int) (dashaPie + romaPie + vasiaPie);

        System.out.println("Dasha, Roma and Vasia ate " + totalPie2 + " whole pies.");
        // тогда вопрос: "сколько целых пирогов съели дети сегодня, если остатки доедят завтра"

        /* ради интереса: заменим пироги на пирожные и увеличим количество на 2, так же предположим, что дети едят
        порожные с разной начинкой*/

        /* d на конце относится к числу 2. А когда мы производим математическую операцию на double и не double,
        то все автоматически приводится к double.*/
        double dashaCake = 2 + 1/2d; // 2.5 клубничных
        double romaCake = dashaCake / 2; // 1,25 ванильных (Рома не любит сладкое)
        double vasiaCake = (dashaCake + romaCake) * 4; // 15.0 шололадных (очень толстый Вася)

        int totalCake = (int) dashaCake + (int) romaCake + (int) vasiaCake;
        // должны получить, что Даша съела 2 клубничных пирожных, Рома - 1 ванильное, а Вася - 15 шоколадных

        System.out.println("Dasha, Roma and Vasia ate " + totalCake + " whole Сakes.");
        // вопрос: "сколько целых пироженых съели дети, если покусанные едят родители"

        // Ctrl + N; выбрать "All places"; напечатать имя нужного класса (Например "Float") и читать описание
    }
}
