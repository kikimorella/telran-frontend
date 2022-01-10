package de.telran.d211103.arrayoperations;

import java.util.Arrays;

public class ArrayOperations {
    /* по сути массив делает 3 вещи:
    записать элемент по индексу
    узнать значение элемента по индексу
    узнать длинну массива */
    // {4, 8, 3} -> {4, 8, 3, 15} хотим добавить в конец элемент - addend
    // {4, 8, 3, 15} -> {4, 8, 15} хотим удалить элемент - delete
    // {4, 8, 15} -> {4, 8, -3, 15} хотим вставить элемент - insert
    public static void main(String[] args) {
        int[] array = new int[5]; // создать массив
        array[2] = 10; // {0, 0, 10, 0, 0}
        int fromArray = array[2];
        int length = array.length;

        int[] array2 = append(array, 7);//{0,0,10,0,0,7}

        // Arrays java.util содержит функции например .toString чтоб не писать каждый раз printArray
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));

        array2 = insert(array2, 3, 11);//{0,0,10,11,0,0,7}
        System.out.println(Arrays.toString(array2));

        array2 = delete(array2, 4);//{0,0,10,11,0,7}
        System.out.println(Arrays.toString(array2));

        array2 = delete(array2, 4);//{0,0,10,11,7}
        System.out.println(Arrays.toString(array2));
    }

    /**
     * creates a new array in memory, which is a copy of the old array, and then returns a reference to it
     *
     * @param array to copy
     * @return a copy
     */
    static int[] copy(int[] array) { // метод, берёт ставый массив, а возвращает ссылку на новый массив, копию старого
        int[] res = new int[array.length]; // берем массив с тем же размером

        for (int i = 0; i < array.length; i++) { // пройтись и почленно скопировать
            res[i] = array[i]; // элемент нового массива = элементу старого
        }

        return res;
    }

    static int[] append(int[] array, int element) { // добавить в конец элемент. помним! размер массива изменить нельзя
        int[] res = new int[array.length + 1]; // берем массив с размером больше на 1

        for (int i = 0; i < array.length; i++) { // копируем старые элементы в новый массив
            res[i] = array[i];
        }
        // у любого массива последнее мето это array.length - 1
        res[res.length - 1] = element; // добавляем на последнее место (последний индекс) значение
        return res; // записали результат
    }

    static int[] insert(int[] array, int index, int element) { //вставить элемент в массив на место (индекс)
        int[] res = new int[array.length + 1];

        for (int i = 0; i < index; i++) { // // до конкретного индекса мы копируем элементы
            res[i] = array[i];
        }

        res[index] = element; // вставляем нужный элемент

        for (int i = index; i < array.length; i++) { // после конкретного индекса мы дозаполняем элементы
            res[i + 1] = array[i]; // раздвинули элементы массива на 1 ячейку
        }

        return res;
    }
    // {4, 8, 15} -> {0, 0, 0, 0} (строка 48) -> {4, 8, 0, 0} (строки 50-52) {4, 8, -3, 0} (строка 54)
    // -> {4, 8, -3, 15} (строки 56-58)

    static int[] delete(int[] array, int index) { // Удаление элемента из массива по индексу
        int[] res = new int[array.length - 1];  // берем массив с размером меньше на 1

        for (int i = 0; i < index; i++) { // скопировать все элементы до индекса
            res[i] = array[i];
        }
        // мы идем по длине старого массива!
        for (int i = index + 1; i < array.length; i++) { // добавить элементы после индекса
            res[i - 1] = array[i]; // индекс из старого массива копируем на предыдущее место
        }
        /*
        for (int i = index; i < res.length; i++) { // тоже самое
            res[i] = array[i + 1]; // на место индекса нового массива должен встать следующий элемент из старого массива
        } */
        return res;
    }

}
