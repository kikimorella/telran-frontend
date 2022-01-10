package de.telran.d211122.strings.strings;

import java.util.Arrays;
import java.util.Locale;

public class MyString {

    public static void main(String[] args) { // вызов библиотеки -> ctrl + пкм
        char[] chars = {'H', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd'};
        /*
        char a ='a';
        System.out.println(a + 0); // java "а" через int
        System.out.println('b' + 0);
        */
        String helloWorld = new String(chars); // эта строка создается вне пула строк
        System.out.println(helloWorld); // Hello world

        String str = "Hello world"; // строки это объекты, который невозможно изменить, 1 раз его создав
        String str2 = "Hello world"; // пул строк

        System.out.println(str == str2); // true, но так сравнивать не правильно! нужно использовать equals
        System.out.println(helloWorld == str); //false

        // методы строк

        // charAt() -> char - возвращает символ
        System.out.println(helloWorld.charAt(4)); // o
        // concat() - instead of + (это "плюс")
        System.out.println(helloWorld.concat(str)); // Hello worldHello world
        // contains() -> boolean
        System.out.println(str.contains("a")); // false
        // endsWith() -> boolean
        System.out.println(str.endsWith("world")); // true
        // startsWith() -> boolean
        // the same
        // equals(Object str2) -> boolean
        System.out.println(str.equals(str2));//true
        System.out.println(helloWorld.equals(str2));//true
        // equalsIgnoreCase(String) -> boolean
        System.out.println("Hello".equalsIgnoreCase("HeLlO"));//true
        // indexOf() -> int
        System.out.println(str.indexOf('l'));//2
        System.out.println(str.indexOf('l', 3));//3
        System.out.println(str.indexOf("l", 4));//9
        System.out.println(str.indexOf("world"));//6
        // lastIndexOf() -> int
        System.out.println(str.lastIndexOf('l'));//9
        // length() -> int
        System.out.println(str.length());//11
        // split() -> String[] - метод разделяет строку на массив строк исходя из заданного разделителя
        System.out.println(Arrays.toString(str.split("l"))); // [He, , o wor, d]
        // toCharArray() -> char[] - преобразует данную строку в новый массив символов
        System.out.println(Arrays.toString(str.toCharArray())); //[H, e, l, l, o,  , w, o, r, l, d]
        // toLowerCase() -> String - преобразует все символы строки в нижний регистр, используя правила яз. стандарта
        System.out.println(str.toLowerCase()); //hello world
        // toUpperCase() -> String
        System.out.println(str.toUpperCase()); // HELLO WORLD
        // substring() -> String
        // имеет два варианта и возвращает новую строку, которая является подстрокой данной строки. Подстрока
        // начинается с символа, заданного индексом, и продолжается до конца данной строки или до endIndex-1, если
        // введен второй аргумент. beginIndex — начальный индекс, включительно; endIndex — конечный индекс, не включая.
        System.out.println(str.substring(6)); // world
        System.out.println(str.substring(0, 5)); // Hello

        System.out.println(reverse(str)); // dlrow olleH
        System.out.println(reverse2(str)); // dlrow olleH

        String forExample = "Hello world guys";
        System.out.println(cutToN(forExample, 16)); // Hello world guys
        System.out.println(cutToN(forExample, 17)); // Hello world guys
        System.out.println(cutToN(forExample, 18)); // Hello world guys
        System.out.println(cutToN(forExample, 15)); // Hello world
        System.out.println(cutToN(forExample, 12)); // Hello world
        System.out.println(cutToN(forExample, 13)); // Hello world
        System.out.println(cutToN(forExample, 11)); // Hello world
        System.out.println(cutToN(forExample, 7)); // Hello
        System.out.println(cutToN(forExample, 6)); // Hello
        System.out.println(cutToN(forExample, 4)); // -
        System.out.println(cutToN(forExample, 0)); // -

        System.out.println(countOccurrences(forExample, "l")); // 3
        System.out.println(countOccurrences(forExample, "ll")); // 1
        System.out.println(countOccurrences2(forExample, "l")); // 3

    }

    static String reverse(String str) { // метод, получающий строку и возвращающий развернутую строку
        char[] chars = str.toCharArray();
        char[] newChars = new char[chars.length];

        for (int i = 0; i < chars.length; i++) {
            newChars[i] = chars[chars.length - i - 1];
        }

        return new String(newChars);
    }

    static String reverse2(String str) {
        String res = ""; // переменная

        for (int i = 0; i < str.length(); i++) { // берем символы исходной строки с конца строки до начала
            // res += str.charAt(str.length() - 1 - i);
            res = res + str.charAt(str.length() - 1 - i);
        }

        return res;
    }

    public static boolean isPalindrome(String str) {
        String reversedString = reverse(str);
        return str.equalsIgnoreCase(reversedString); // есть такой метод в библиотеке, сам игнорирует заглавные буквы
    }

    // вопрос с собеседования на кодилити
    static String cutToN(String str, int N) { // Hello world guys
        int length = str.length();

        if (N >= length) // -> N после guys (N >= 16)
            return str;

        String subString = str.substring(0, N + 1); // N + 1, т.к. если индекс попадаем на пробел, при N выпадает слово
        // N = 15 -> Hello world guy
        int lastSpaceIndex = subString.lastIndexOf(" ");

        if (lastSpaceIndex >= 0)
            return subString.substring(0, lastSpaceIndex);

        return "-";
    }

    static int countOccurrences(String str, String pattern) {
        int res = 0;
        int index = 0;

        while ((index = str.indexOf(pattern, index)) > -1) {
            res++;
            index++;
        }
        return res;
    }

    static int countOccurrences2(String str, String pattern) {
        str = str.toLowerCase();
        pattern = pattern.toLowerCase();

        int res = 0;
        int index = str.indexOf(pattern);

        while (index > -1){
            res++;
            index++;
            index = str.indexOf(pattern, index);
        }
        return res;
    }
}
/*
Класс String
Этот класс представляет собой последовательность символов. Все определенные в программ строковые литералы,
вроде "This is String" — это экземпляры класса String.

У String есть две фундаментальные особенности:
это immutable (неизменный) класс
это final класс

В общем, у класса String не может быть наследников(final) и экземпляры класса нельзя изменить после создания(immutable).

Это дает классу String несколько важных преимуществ:
Благодаря неизменности, хэшкод экземпляра класса String кэшируется. Его не нужно вычислять каждый раз, потому что
значения полей объекта никогда не изменятся после его создания. Это дает высокую производительность при использовании
данного класса в качестве ключа для HashMap.

Класс String можно использовать в многопоточной среде без дополнительной синхронизации.

Еще одна особенность класса String — для него перегружен оператор "+" в Java. Поэтому конкатенация (сложение) строк
выполняется довольно просто:

public static void main(String[] args) {
    String command = "Follow" + " " + "the" + " " + "white" + " " + "rabbit";
    System.out.println(command); // Follow the white rabbit
}

У класса String есть еще одна особенность. Все строковые литералы, определенные в Java коде, вроде "asdf",
на этапе компиляции кэшируются и добавляются в так называемый пул строк.

Если мы запустим следующий код:

String a = "Wake up, Neo";
String b = "Wake up, Neo";
System.out.println(a == b);

Мы увидим в консоли true, потому что переменные a и b в действительности будут ссылаться на один и тот же экземпляр
класса String, добавленный в пул строк на этапе компиляции. То есть, разные экземпляры класса с одинаковым значением не
создаются, и память экономится.


                    String	                         StringBuffer	              StringBuilder
Изменяемость	    Immutable (нет)	                 mutable (да)	             mutable (да)
Расширяемость	    final (нет)	                     final (нет)	               final (нет)
Потокобезопасность	Да, за счет неизменяемости	    Да, за счет синхронизации	    Нет
Когда использовать:
String - При работе со строками, которые редко будут модифицироваться
StringBuffer - При работе со строками, которые часто будут модифицироваться в многопоточной среде
StringBuilder - При работе со строками, которые часто будут модифицироваться, в однопоточной среде
*/