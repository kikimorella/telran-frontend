package de.telran.d210927.booleanexample;

public class HelloBoolean {
    public static void main(String[] args) {
        helloOne();
        helloTwo();
        System.out.println();
        helloThree();
        System.out.println();
    }

    public static void helloOne() {
        int roomTemp = 21, conditionTemp = 23;
        boolean bool = (roomTemp < conditionTemp);
        System.out.println(bool);
    }

    public static void helloTwo() {
        int roomTemp = 21, conditionTemp = 23;
        boolean bool = (roomTemp > conditionTemp);
        System.out.println(bool);
    }

    public static void helloThree() {
        boolean a = (7 + 8) * 5 > 7 + 8 * 5; // true
        boolean b = (7 + 8) * 4 != 7 + 4 * 5; // true
        boolean c = 3 + 4 > 9 + 1 && 16 - 5 > 3 * 4; // false&&false
        boolean d = 16 / 2 < 6 + 2 || 4 + 5 <= 4 + 5; // false||true
        boolean e = !(3 * 4 < 7 + 8); // !true = false

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        // можно было всё это не писать, а заменить: System.out.println(a + "\n" + b + "\n" + c + "\n" + d + "\n" + e);
        // символ \n - перевод строки
    }
}
