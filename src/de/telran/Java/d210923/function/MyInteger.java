package de.telran.d210923.function;

public class MyInteger {

    public static void main(String[] args) {
        exampleThree();
        System.out.println(5*7);
        exampleTwo();
        exampleOne();
        exampleFour();
    }
    public static void exampleOne() {
        // integer = int
        System.out.println(Math.pow(2, 15));
        System.out.println(Math.pow(2, 31));  // 2.147483648E9 = 2.147483648 * 10^9 экспонента
    }
    public static void exampleTwo() {
        System.out.println(((3+7)*(7+4))/3);
    }
    public static void exampleThree() {
        int a = 8;
        int b = 4;
        int c = a + b;
        System.out.println(c);
    }
    public static void exampleFour(){
        int a, b, c;
        a = 8;
        b = 5;
        c = a + b;
        System.out.println("Здесь мы распечатаем результат вычислений операции сложения " + c);
    }

}
