package de.telran.d220126;

/*
Implement the method that takes two Strings and as result return the index of the first character tha not the same in
both Strings.
Example: "Hello", "Hi" -> 1
"Hello", "Hello, and lets start" -> 5
"Hello", "Hello" -> -1
*/
public class scanner2 {
    public static void main(String[] args) {
        System.out.println(findFirstDiff("Hello", "Hi"));
        System.out.println(findFirstDiff("Hello", "Hello, and lets start"));
        System.out.println(findFirstDiff("Hello", "Hello"));

        System.out.println(findFirstDiff2("Hello", "Hi"));
        System.out.println(findFirstDiff2("Hello", "Hello, and lets start"));
        System.out.println(findFirstDiff2("Hello", "Hello"));
    }

    static public int findFirstDiff(String str1, String str2) {
        if (str1.equals(str2)) { //абсолютное равенство строк
            return -1;
        }
        int i = 0;
        while (i < str1.length() && i < str2.length() && str1.charAt(i) == str2.charAt(i)) {
            i++;
        }
        return i;
    }

    static public int findFirstDiff2(String str1, String str2) {
        if (str1.equals(str2)) {
            return -1;
        }

        int i = 0;

        for(i = 0; i < str1.length() && i < str2.length() && str1.charAt(i) == str2.charAt(i); i++);
        // получился бестелесный цикл, но работает так же, как и while

        return i;
    }
}
