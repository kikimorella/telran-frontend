package de.telran.d210923.function;// это один из вариантов комментариев

 /**
     * Документация к программе, детали
     */

     public class HelloIntegen {

     public static void main(String[] args) {
         myFirstFunction();                      // здесь происходит вызов метода/функции
         mySecondFunction();
     }

     public static void myFirstFunction() {
         System.out.println("Hello Function");
         myThirdFunction();
     }

     public static void mySecondFunction() {
         System.out.println("Привет второй метод");
     }

     public static void myThirdFunction() {
         System.out.println("Привет третий метод");
     }

}
