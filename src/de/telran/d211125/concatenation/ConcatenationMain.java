package de.telran.d211125.concatenation;

import java.util.SortedMap;

public class ConcatenationMain {

    public static void main(String[] args) {
       /*
        String helloWorld = "Hello world";
        String res = "";
        // конкатенация строки
        long currentTime = System.currentTimeMillis(); // команда выдает с 1970 г.
        for (int i = 0; i < 100000; i++) { // 11741 или 9785 сек, на 1000 - 79 сек, на 10000 - 248 сек
            res += helloWorld;
        }
        long delta = System.currentTimeMillis() - currentTime;

        System.out.println(delta);

        StringBuilder sb = new StringBuilder(); // похож на ArrayList, создан для того, чтоб конкатенировать строки

        currentTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) { // 8 сек, а результат такой же
            sb.append(helloWorld);
        }
        res = sb.toString();
        delta = System.currentTimeMillis() - currentTime;

        System.out.println(delta);
        */
        IConcatenator stringCon = new StringConcatenator();
        IConcatenator stringBufferCon = new StringBufferConcatenator();
        IConcatenator stringBuilderCon = new StringBuilderConcatenator();
        IConcatenator charCon = new CharsConcatenator();

        ConcatenationTester tester = new ConcatenationTester();

        System.out.println((tester.test(stringCon, "hello", 10000)));
        System.out.println((tester.test(stringBufferCon, "hello", 10000)));
        System.out.println((tester.test(stringBuilderCon, "hello", 10000)));
        System.out.println((tester.test(charCon, "hello", 10000)));

        String letters = "ABCDE";
        String numbers = "0123456789";

        System.out.println(ConcatenationTester.test(new StringBuilderConcatenator(), letters, 30000)); // 10
        System.out.println(ConcatenationTester.test(new StringBufferConcatenator(), letters, 30000)); // 0
        System.out.println(ConcatenationTester.test(new StringConcatenator(), letters, 30000)); // 814
        System.out.println(ConcatenationTester.test(new CharsConcatenator(), letters, 30000)); // 31

        System.out.println(ConcatenationTester.test(new StringBuilderConcatenator(), numbers, 50000)); // 15
        System.out.println(ConcatenationTester.test(new StringBufferConcatenator(), numbers, 50000)); // 16
        System.out.println(ConcatenationTester.test(new StringConcatenator(), numbers, 50000)); // 2265
        System.out.println(ConcatenationTester.test(new CharsConcatenator(), numbers, 50000)); // 0
    }
}

