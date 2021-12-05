package de.telran.d211011.ifelsewhile;

public class IfElseWhile {
    // 1. if(booleanConditionA){только если true выполняется}
    // 2. if(booleanConditionA){тело if}
    // else{блок кода, если booleanConditionA - false}
    // 3. if(booleanConditionA){ тело if
    // else if{блок кода, если booleanConditionB - true}
    // else if{их может быть сколько угодно}
    // else{блок кода, если booleanConditionA - false}
    /*
    код доходит до while выполняется столько раз пока не станет false
    while (booleanConditionD){
    the code executes while the condition D is true
    }
    */
    public static void main(String[] args) {
        int number = 0;
        if (number > 0) {
            System.out.println("the number " + number + " is positive");
        }
        else if (number < 0){
            System.out.println("the number " + number + " is negative");
        }
        else {
            System.out.println("The number is 0");
        }
        System.out.println();

        int a = 10;
        while (a>= 0){ // итерация
            System.out.print(a); // не делает перенос строки в отличая от System.out.println
            a--; // распечатается 11 раз, потом станет false и остановится
            // int b = 0;
        }
        System.out.println();
        // System.out.println(b);// - если не вложен в этот в бок, то не выполнимо
        // область видимости переменных внутри функции.
        // А видна там, где она появляется, а так же во всех дочерних блоках кода,
        // в случае переменной В, она осталась только для 1 дочернего блока

        // print out all numbers between 10 and 1
        int i = 1;
        while (i<=10){
            System.out.print(i);
            i++;
        }
        System.out.println();

        // print out all even numbers between 20 and 0
        i = 20;
        while (i>=0){
            System.out.print(i);
            i -= 2; // сокращение записи i = i - 2;
        }
        System.out.println( );

        // count the sum of an arithmetical progression from 1 to 87
        int sum = 0;
        int currentNumber = 1;
        while (currentNumber <= 87){
            sum += currentNumber;
            currentNumber ++;
         }
        System.out.println(sum);
    }
}
