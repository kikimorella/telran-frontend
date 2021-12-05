package de.telran.d211018.breakarray;

public class Break {

    public static void main(String[] args) {
        printFirstNumberFromA(14);
        printFirstNumberFromA2(15);
    }

    // print out the minimal number which is greater than A and divided by 11, 13 or 17
    static void printFirstNumberFromA(int a) {
        for (int i = a; i < a + 17; i++) {
            if (i % 11 == 0 || i % 13 == 0 || i % 17 == 0) {
                System.out.println(i);
                break; // как только встречаем подходящее число, то break ломает ближайшие вычисления
            }
        }
    }

    static void printFirstNumberFromA2(int a) { // послушать ещё раз
        int i = a;
        while (true) {
            if (i % 11 == 0 || i % 13 == 0 || i % 17 == 0) {
                System.out.println(i);
                break;
            }
            i++;
        }
    }
}

