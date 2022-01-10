package de.telran.d211007.functionandboolean;

public class VariablesTasks { //тело класса

    public static void main(String[] args) { // тело метода (main - самый первый)
        // Ctrl +D вставить строки
        // Ctrl + Z отмена действия
        // Ctrl + Alt + L автоформат
        // Masha ate 2.5 apples, and Petya ate 3.5 apples. How many apples did they eat?
        double maryAppleAteNumber = 2.5;
        double peterAppleAteNumber = 3.5;
        double totalAppleAteNumber = maryAppleAteNumber + peterAppleAteNumber;
        System.out.println("they ate " + totalAppleAteNumber + " in total");

        int ten = 10;
        int three = 3;
        double tenOverThreeWrong = ten / three; // 3.0 - мы делаем "кастинг"
        // когда мы осуществляем операцию, в которой учавствует целое число и double число,
        // автоматически определяется, как double
        System.out.println(tenOverThreeWrong); // 3.0

        double tenOverThreeCorrect = (double) ten / three; // 3.0
        System.out.println(tenOverThreeCorrect); // 3.33333
        // когда один из типов вещественный (float/double), всё выражение приводится к этому типу
        // (например long+float=float)

        System.out.println(Long.MAX_VALUE); // Ctrl + B или правая кнопка мыши "go to... Declarations"
        System.out.println((float)Long.MAX_VALUE);
        System.out.println((double) Long.MAX_VALUE);

        int someInt = 15;
        double someDouble = 5;
        double someRes = someInt / someDouble; // кастинг - приведение типов

        /*Masha ate half of the pie, and Petya ate twice less than Masha, and Vasya ate 4 times more than
        Masha and Petya together. How many pies (in fractional terms) did they eat?*/
        double mashaPieAteAmount = 1d / 2; // без d это "int / int"
        double petiaPieAteAmount = mashaPieAteAmount / 2;
        double vasiaPieAteAmount = (mashaPieAteAmount + petiaPieAteAmount) * 4;

        double pieAteInTotal= mashaPieAteAmount + petiaPieAteAmount + vasiaPieAteAmount;
        System.out.println("They ate " + pieAteInTotal + " pies in total");
    }
}
