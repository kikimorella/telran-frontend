package de.telran.d211025.arrayfibonacci;

public class HomeWorkArrayFibonacci {
    /* Fibonacci
    f0 = 0;
    f1 = 1;
    f2 = 1;
    f3 = 2;
    f4 = 3;
    f5 = 5;
    fn =< fn-1 + fn -2;
    */
    public static void main(String[] args) {
        int[] fibonacci = fillFibonacci(12); // можно и так создать массив с методом и его использовать

        printArray(fibonacci);

        int[][] matrix = {
                {1, 2, 3, 4, 5, 6, 7},
                {8, 9, 10, 11, 12, 13, 14},
                {15, 16, 17, 18, 19, 20, 21, 22},
                {23, 24, 25, 26, 27, 28, 29, 30}
        };

        printArray(getSumArray(matrix));

        System.out.println(findRowWithOdd(matrix) + " Rows with odd elements");

        printDoubleArray(createArray(10, 10));
/*
        int [][] array10x10 = new int[10][10]; // можно создать массив так
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                array10x10[i][j] = i * 10 + j;
            }
        }
*/
        int[] anotherArray = {40, -35, -30, 25, 20, -15, -10, 5, 1};

        printArray(multiplyBy3PositiveElements(anotherArray));

        replaceNegativeIndex(fibonacci);
        printArray(fibonacci);

    }

    static void printArray(int[] array) { // функция, которая распечатывает массив
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    static void printDoubleArray(int[][] array) { // функция, которая распечатывает массив массивов
        for (int i = 0; i < array.length; i++) {
            printArray(array[i]); // ссылаемся в методе на другой метод
        }
        System.out.println();
    }

    // 1. Есть целое положительное число n/ Написать функцию, которая принимает N, а возвращает массив,
    //    заполненный числоми Фибоначчи.
    static int[] fillFibonacci(int number) {
        if (number == 0){
            return new int[1]; // {0}
        }
        int[] fibonacci = new int[number + 1]; // создаем массив с длинной, равной переменной
        // если оставить new int[number], то последний элемент (n-1)ое число фибоначи, а надо n
        // нужно вставить if (number=0){return fibonacci;}
        fibonacci[1] = 1;
        for (int i = 2; i < fibonacci.length; i++) { // заполняем массив, со второго элемента, т.к. первые 2 уже есть
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        return fibonacci; // возвращаем массив
    }

    // 2. Есть двумерный массив. Вернуть одномерный массив, содержащий суммы подмассивов первого массива.
    static int[] getSumArray(int[][] array) {
        int[] sumArray = new int[array.length]; // новый массив с длинной массива моссивов (строк массива)
        for (int i = 0; i < array.length; i++) { // перебираем массив массивов (строки)
            int sumSubarray = 0; // переменная суммы
            for (int j = 0; j < array[i].length; j++) { // перебираем подмассивы (столбцы)
                sumSubarray += array[i][j]; // сумма элементов подмассива
            }
            sumArray[i] = sumSubarray; // присваиваем каждому элементу нового массива значения сумм подмассивов
        }
        return sumArray; // вернуть получившийся массив
    }

    // 3. Есть двумерный массив. Посчитать количество подмассивов, содержащих нечетные элементы.
    static int findRowWithOdd(int[][] array) {
        int oddRow = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] % 2 != 0) { // важно != 0
                    oddRow++;
                    break;
                }
            }
        }
        return oddRow;
    }
    // 4. Создать двумерный массив 10x10 и заполнить его числами от 0 до 99
    static int[][] createArray(int rowNum, int columnNum) { //так мы можем менять размеры
        int[][] array = new int[rowNum][columnNum]; //
        int element = 0; // вводим 1 элемент подмассива
        for (int i = 0; i < array.length; i++) { // перебираем массив массивов
            for (int j = 0; j < array[i].length; j++) {// перебираем подмассив
                array[i][j] = element;
                element++; // заполняем элемент числами от 0 до 99
            }
        }
        return array;
    }

    // 5. Функция принимает одномерный массив и умножает на 3 все его положительные элементы.
    static int[] multiplyBy3PositiveElements(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > 0) {
                arr[i] *= 3;
            }
        }
        return arr;
    }

    // 6. Функция принимает одномерный массив и меняет все элементы с нечетными индексами на 0.
    static void replaceNegativeIndex(int[] arr) { // меняет с нечетными индексами
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) { // если оставить if (i % 2 == 1), то при отриц.элементе не проверить, т.к. = - 1
                arr[i] = 0;
            }
        }
    }
    /*
    static void replaceNegativeElements(int[] arr) { // не верно, меняет с нечетными элементами
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                arr[i] = 0;
            }
        }
    }
    */
}
