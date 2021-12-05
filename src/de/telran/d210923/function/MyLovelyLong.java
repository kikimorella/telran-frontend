package de.telran.d210923.function;

public class MyLovelyLong {

    public static void main(String[] args) {
        // дублирование стороки Ctrl + D
        myLongOne();
    }
    public static void myLongOne() {
        long a = 9223372036854775807L;
        long b = 9223372036854775807l;         // надо заменить на L, т.к. можно спутать с 1
        long c = 9_223_372_036_854_775_807L;
        int price = 148_99;                     // язык ввода только английский
        int veryInteresting = 1_2_3_4_5;
        System.out.println(veryInteresting);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(price);
    }


}
