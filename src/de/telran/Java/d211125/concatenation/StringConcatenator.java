package de.telran.d211125.concatenation;

public class StringConcatenator implements IConcatenator{
    @Override
    public String concat(String[] strs) {
        //concatenate the strings just adding them to each other

        String res = ""; // создаём строку
        for (int i = 0; i < strs.length; i++) {
            res += strs[i]; // заполняем строку значениями из массива
        } // периодически помять заполняется и память нужно очищать java делает это сама,
        // но частый вызов garbagecollection требует времени
        return res;
    }
}
/*
используется, когда нужно конкатенировать пару строк, а не сотни

- - - - - - res массив создается
- - - - - - res + - - - - - -str[i]
- - - - - - - - - - - -  временно создаётся массив res + str[]i
каждый перенос это 1 операция, считай "каждый знак"!
 */
