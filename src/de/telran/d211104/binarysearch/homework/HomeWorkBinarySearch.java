package de.telran.d211104.binarysearch.homework;

public class HomeWorkBinarySearch {
    /*
    1.(**) Написать Binary Search. static int binarySearch(int[] array, int number) (см. условие 3 задачи из
    предыдущего дз, только реализовав алгоритм Binary Search)
    Написать метод, который принимает отсортированный массив и число, а возвращает либо реальный индекс, по
    которому находится число, либо число, равное индексу, на который можно поставить элемент, не нарушая порядка
    (сортированность), плюс 1 и число с минусом (negated).
    Пример 1: func({1, 5, 7, 12, 15}, 7) -> 2
    Пример 2: func({1, 5, 7, 12, 15}, 6) -> -3
    Пример 3: func({1, 5, 7, 12, 15}, 0) -> -1
    пример 4: func({1, 5, 7, 12, 15}, 20) -> -6
    */
    public static void main(String[] args) {
        int[] array = {1, 5, 7, 12, 15};
        System.out.println(binarySearch1(array, 7)); //2
        System.out.println(binarySearch1(array, 0)); //-1
        System.out.println(binarySearch1(array, 13)); //-5
        System.out.println(binarySearch1(array, 15)); //4
        System.out.println(binarySearch1(array, 17)); //-6
        int[] sortedArray = {0, 5, 14, 28, 32, 52, 58, 71, 82, 84, 92, 95, 100, 114, 152, 282, 258, 271, 332, 364, 396};
        binarySearch2(sortedArray, 52);
        binarySearch2(sortedArray, 332);
        binarySearch2(sortedArray, 425);
    }

    static int binarySearch1(int[] array, int number) {
        int minIndeks = 0; // первый индекс
        int maxIndeks = array.length - 1; // последний индекс
        int middleIndex = 0;

//        if (number > array[maxIndeks])
//            return -array.length - 1;

        while (minIndeks <= maxIndeks) { // проходимся по массиву до середины
            middleIndex = (minIndeks + maxIndeks) / 2; // серединный индекс

            if (array[middleIndex] < number) {
                minIndeks = middleIndex + 1;
            } else if (array[middleIndex] >= number) {
                maxIndeks = middleIndex - 1;
            } else {
               return middleIndex;
            }
        }
        // 1, 4, 8 - 5
        //       8, 5 --- min = max

            return -(middleIndex + 1);
    }

    static void binarySearch2(int[] sortedArray, int requiredNumber) {
        int first = 0; // первый индекс
        int last = sortedArray.length - 1; // последний индекс
        int middle = (first + last) / 2; // серединный индекс

        boolean isFound = false; // переменная на поиск числа в массиве

        while (first <= last) { // проходимся по массиву до середины
            if (sortedArray[middle] < requiredNumber) { // если число больше значения среднего индекса
                first = middle + 1; // ищем число во второй половине массива
            } else if (sortedArray[middle] == requiredNumber) { // если число равно значению среднего индекса
                isFound = true; // мы его нашли
                break; // дальнейший поиск не имеет смысла
            } else { // если число меньше значения среднего индекса
                last = middle - 1; // ищем число в первой половине массива
            }
            middle = (first + last) / 2; // если нам нужно продолжить поиск, ищем новую середину
        }

        if (isFound) { // мы нашли число
            System.out.println(requiredNumber + " found at index " + middle);
        } else System.out.println(requiredNumber + " is not present"); // если числа в массиве нет
    }
}