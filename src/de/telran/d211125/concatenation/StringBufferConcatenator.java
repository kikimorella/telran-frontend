package de.telran.d211125.concatenation;

public class StringBufferConcatenator implements IConcatenator {
    @Override
    public String concat(String[] strs) {
        //concatenate the strings using StringBuffer
        StringBuffer strBuffer = new StringBuffer(); // создаём строку
        for (int i = 0; i < strs.length; i++) {
            strBuffer.append(strs[i]); //Метод append() добавляет подстроку в конец StringBuffer
        }
        return strBuffer.toString();
    }
}
/*
Для создания нового объекта используется один из его конструкторов, например:
StringBuffer() - создаст пустой (не содержащий символов) объект
StringBuffer(String str) - создаст объект на основе переменной (содержащий все символы str в той же последовательности)

- - - - - -  массив заполнен на 2, далее мы записываем пока место не закончится, и только тогда пересоздаём массив,
как в ArrayList но только 31 раз
*/
