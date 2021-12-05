package de.telran.d211014.switchfor;

public class For {
    /*
    обычно while (boolean condition A){some code} в то время как

    for(expression A, condition B, expression C){some code}
    т.е перед операцией цикла всегда выполняется expression A (int i), condition B (i < 10) проверяется перед каждой
    операцией, потом выполняют some code и после выполняется expression C (i++)

    то же самое, что в for:
    expression A
    while (condition B) {
    some code;
    expression C}
    */
    public static void main(String[] args) {

        // print out all numbers between 0 and 10
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
        /*  можно for так расписать
        int i = 0;
        while (i<=10) {
            System.out.println(i);
            i++;
        }*/

        // print out all even numbers from 20 down to 0
        for (int y = 20; y >=0; y-=2){
            System.out.println(y);
        }

        // print 10 times "Hello"
        for (int j = 0; j < 10; j++) { // можно использовать fori
            System.out.println("Hello");
        }
    }
}
