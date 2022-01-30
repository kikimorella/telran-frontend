package de.telran.d220126;

public class stringexample {
    public static void main(String[] args) {
        String abc = "abcdefg";
        String num = "123456789";
        System.out.println(getEvenString(num));
        System.out.println(getEvenString2(abc));
    }

    public static String getEvenString(String str) {
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                res += str.charAt(i);
            }
        }
        return res;
    }

    public static String getEvenString2(String str) {
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                res += str.charAt(i);
            }
        }
        return res;
    }
}
