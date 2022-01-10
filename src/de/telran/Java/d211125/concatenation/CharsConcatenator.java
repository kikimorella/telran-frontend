package de.telran.d211125.concatenation;

public class CharsConcatenator implements IConcatenator {
    @Override
    public String concat(String[] strs) {
        // compose a char array which will contain the chars from all the strings and return the res string
        // created from this array

        int resLength = 0;
        for (int i = 0; i < strs.length; i++) {
            resLength += strs[i].length(); // сложили все длины строк массива
        }
        char[] chars = new char[resLength];

        int position = 0;

        for (int i = 0; i < strs.length; i++) { // идём по строкам
            for (int j = 0; j < strs[i].length(); j++) { // по конкретной строке
            //    chars[position] = strs[i].charAt(j);
            //    position++;
                chars[position++] = strs[i].charAt(j); // поэлементно вставляем символы в строке
            }
        }
        /*
        for (int i = 0; i < strs.length; i++) {
            System.arraycopy(strs[i].toCharArray(), 0, chars, position, strs[i].length());
            position+= strs[i].length();
        }
        */
        return new String(chars);
    }
}
/*
        StringBuilder strBuilder = new StringBuilder();

        for (int i = 0; i < str.length; i++) { // превращаем массив в строку
            strBuilder.append(str[i]);
            strBuilder.append("; ");
        }

        char[] chars = strBuilder.toString().toCharArray(); // преобразует данную строку в массив символов

        return chars.toString();
*/
