package de.telran.d211028.insertionselectionsort;

public class HomeWorkInsertionAndSelectionSort {
    /*
    1. В двумерном массиве посчитать количество подмассивов, содержащих ТОЛЬКО положительные элементы.
    (использовать continue с меткой)
    2. Есть двумерный массив. Вернуть одномерный массив, содержащий суммы подмассивов, у которых есть положительные
    элементы (см.3 задача предыдущего ДЗ)
    3. Функция которая ищет минимальный элемент из массива.
    4. Написать сортировку выбором (Selection Sort) (Усложнить 3 - найти индекс минимума)
    5. Написать функция, которая ищет (возвращает) n-ое число Фибоначчи.
    */
    public static void main(String[] args) {
        int[][] array1 = new int[][]{
                {5, -3, 10},
                {15, 3, 10, 7},
                {5, -3, -8},
                {2, 1, 0},
                {-1, -5}
        };
        System.out.println(countSubarraysWithPositivesOnly(array1));//1

        printArray(countSumsSubarraysContainingPositives(array1));

        int[] unsortedArray = new int[]{12, -8, 5, 17, -1, 25};
        selectionSort(unsortedArray);
        printArray(unsortedArray);
    }

    static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // В двумерном массиве посчитать количество подмассивов, содержащих ТОЛЬКО положительные элементы.
    static int countSubarraysWithPositivesOnly(int[][] array) {
        int res = 0;

        outerFor:
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) { // прошли подмассив и не встретили отрицательный элемент
                if (array[i][j] <= 0) {
                    continue outerFor; // break не подходит
                }
            }
            res++;
        }
        return res;
    }

    // Есть двумерный массив. Вернуть одномерный массив, содержащий суммы подмассивов, у которых есть положительные
    // элементы
    static int[] countSumsSubarraysContainingPositives(int[][] array) {
        int[] res = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            boolean containsPositive = false;
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > 0) {
                    containsPositive = true;
                }
                sum += array[i][j];
            }

            if (!containsPositive)
                res[i] = 0;
            else
                res[i] = sum;
        }
        return res;
    }

    // Написать функцию, которая находит min элемент из массива.
    static int min(int[] array) {
        int min = array[0]; // передоб, пока не встретим самый минимальный элемент

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) { // если мы наткнулись на элемент меньше min, то он становится min
                min = array[i];
            }
        }
        return min;
    }

    // Написать сортировку выбором (Selection Sort)
    static void selectionSort(int[] array) { // найти минимальный элемент и ставить его на 1 позицию (мин индекс)
        for (int i = 0; i < array.length; i++) { // по хорошему for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            // search for the index of the min element of the elements being not on its place
            // если столкнулись с индексом (не значение!), который меньше, то мы обновляем минимальный индекс
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j; //индекс минимального элемента нашли и его теперь нужно переставить
                }
            }
            // земена
            // swap the min with the i-th element (placing the i-th element onto its place)
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    // Написать функция, которая ищет (возвращает) n-ое число Фибоначчи.
    static long fibonacci(int n) {
        if (n == 0 || n == 1) // отсекаем крайние случаи
            return n;

        int prev = 0;// 0th element - предыдущий элемент
        int current = 1;// 1st element - текущий элемент

        // если n=2 то for работает 1 раз: temp=1, current=1+0, prev=1
        // индекс    0 1 2 3 4 5 6
        // значение  0 1
        // движение    1 1
        //               1 2
        //                 2 3
        for (int i = 1; i < n; i++) { // передвинули текущий элемент и предыдущий на 1 индекс
            int temp = current;
            current = current + prev;
            prev = temp;
        }

        return current;
    }

    static long fibonacciArray(int n) { // второе решение через вспомагательный массив, более наглядное
        if (n == 0)
            return 0;

        int[] array = new int[n + 1];
        // создаем массив, который содержит больше элементов фибоначчи на 1, чтоб всегда было минимум 2 элемента
        array[1] = 1;

        for (int i = 2; i <= n; i++) { // т.к. размер массива n+1
            array[i] = array[i - 1] + array[i - 2];
        }
        return array[n]; // возвращаем по n недексу
    }
}
