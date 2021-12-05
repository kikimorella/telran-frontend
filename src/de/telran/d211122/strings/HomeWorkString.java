package de.telran.d211122.strings;

import java.util.Locale;

/*
1. Написать метод, получающий строку и возвращающий развернутую строку (static String reverse(String str) - сделали)
2. Написать метод, определяющий, является ли строка палиндромом (helleh), игнорируя регистр (пробелы не игнорируем)
3*. Метод принимает строку, состоящую только из слов, и число N, а возвращает новую строку, которая является обрезанной
первой строкой так, что её длина не превосходит число N (возвращаем левую сторону), строка состоит только из целых слов
и имеет максимально возможную длину. ("Hello world Vasia", 10 -> "Hello") (Hello world Vasia", 14 -> "Hello world")
4. Посчитать количество вхождений паттерна в строку ("Hello world", "l" -> 3)("Hello world", "lL" -> 1)
 */
public class HomeWorkString {
    public static void main(String[] args) {
        // 1
        String latinString = "Sum summus mus"; // загуглила: палиндром "Я — сильнейшая мышь"
        String myString = "Need to practice";

        System.out.println(reverse(latinString)); // sum summus muS
        System.out.println(reverse2(myString)); // ecitcarp ot deeN
        // 2
        String number = "161161";
        String name = "Eve";
        String name2 = "Hannah";

        System.out.println(isPalindrome(number)); // true
        System.out.println(isPalindrome(name)); // false, т.к. имя с большой буквы
        System.out.println(isPalindrome2(name2)); // true
        System.out.println(isPalindrome2(latinString)); // true
        // 4
        System.out.println("The String contains " + count(latinString, 'u') + " sought letters.");
        System.out.println("The String contains " + count2(latinString, "sum") + " sought letter combinations.");
        // 3
        String phrase = "it was very difficult to do, especially in the evening.";
        System.out.println(trimStringAtIndex(phrase, 28));

    }

    static String reverse(String str) { // метод, получающий строку и возвращающий развернутую строку
        char[] chars = str.toCharArray();
        char[] newChars = new char[chars.length];

        for (int i = 0; i < chars.length; i++) {
            newChars[i] = chars[chars.length - i - 1];
        }

        return new String(newChars);
    }

    static String reverse2(String str) { // мы делали на занятии
        String res = ""; // переменная

        for (int i = 0; i < str.length(); i++) { // берем символы исходной строки с конца строки до начала
            res += str.charAt(str.length() - 1 - i); // конкатенация строки?
        } // для каждого res мы создаем новый массив (пересоздаём одну и ту же строку). представим 1000 итераций. долго.

        return res;
    }

    public static boolean isPalindrome(String str) { //надо создать строку обратную данной и сравнить полученные строки
        String reversedString = reverse(str); // получаем перевернутую строку, используя имеющийся метод
        // return str.equals(reversedString); // сравниваем строки, возвращаем результат
        return str.equalsIgnoreCase(reversedString); // есть такой метод в библиотеке, сам игнорирует заглавные буквы
    }

    public static boolean isPalindrome2(String str) { // не эффективный вариант
        str = str.toLowerCase(); // будет игнорировать заглавные буквы

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) { // Сравниваем символ с начала и конца
                return false; // символы не равны, не полиндром
            }
        }
        return true; // проверка не выявила несовпадающих символов
    }

    public static int count(String str, char letter) { // подходит только для одного символа конкретного размера
        int count = 0; // переменная

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == letter) { // значение в буквенном массиве
                count++;
            }
        }
        return count;
    }

    public static int count2(String str, String sub) {
        str = str.toLowerCase(); // важно!

        int count = 0; // переменная сохраняет количество
        int index = 0;
        int subLength = sub.length(); // переменная, чтоб павильно считать на сколько символов нам нужно двигать индекс

        while (str.indexOf(sub, index) > -1) { // ищем значение в буквенном массиве
            int res = str.indexOf(sub, index); // переменная, которая сохраняет индекс, встреченной комбинации
            index = res + subLength; // достаточно + 1 (т.к. не охватывает случай поиска abab -> cccabababddd
            count++;
        }

        return count;
    }

    public static String trimStringAtIndex(String str, int number) {
        // если индекс внутри первого слова или индекс больше строки
        // если индекс посреди слова, то возвращаем то, что до пробела
        // если индекс является пробелом, то возвращаем то, что до него

        /*
        char[] chars = str.toCharArray(); // строка теперь это массив символов
        char[] newChars = new char[number]; // новая строка, длина которой не превосходит число N

        for (int i = 0; i <= newChars.length; i++) {
            newChars[i] = chars[i]; // заполняем новую строку символами из данной строки
        } дальше ищем первый пробел с конца, НО не будут показаны случае, если N в/после 1 слова
        */

        // сразу проверяем N больше или равно длинны строки!!!
        if (number >= str.length()) {
            return str;
        }
        // если меньше
        String[] words = str.split(" "); // получаем массив слов (без пробелов)
        // длина 1 слова входит или нет!
        if (number < words[0].length()) {
            return "";
        }

        int charCount = 0; // счётчик длинны новой строки
        // lastIndexOf
        for (int i = 0; i < words.length; i++) {
            int currentLength = words[i].length(); // длинна строки, без пробелов!
            charCount += currentLength; // в текущей строке добавились символы из слов

            if (charCount > number) {
                charCount = charCount - currentLength - 1;
                // если индекс в середине слова, то оно нас не интересует и пробел до него!
                break;
            } else if (charCount == number) { // значит у нас целое слово
                break;
            }
            charCount++; // добавляем пробел между словами
        }

        return str.substring(0, charCount); // возвращаем новую строку
    }

}
