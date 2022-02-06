package de.telran.d220202;

public class task {
    public static void main(String[] args) {
        String str = "I always do my homework"; //сформировать массив

        //System.out.println(countWords(str));

        String[] words = new String[countWords(str)];

        words = getWordsArray(words, str);

        printArray(words);

        //найти самое длинное слово
    }

    public static int countWords(String str) {
        int res = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') { //находим новое слово , через пробел
                res++;
            }
        }
        return ++res;
    }

    public static String[] getWordsArray(String[] words, String str) {

        int index = 0;

        String word = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ') { // && i != str.length() - 1
                word += ch; // все перебранные символы это слово
            } else {
                words[index++] = word; // записали слово в массив
                //index++;
                word = "";
            }
        }
        words[index] = word; // это действие, т.к. проблема с последним словом, за ним нет пробела

        return words;
    }

    public static void printArray(String[] str){
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
    }


}
