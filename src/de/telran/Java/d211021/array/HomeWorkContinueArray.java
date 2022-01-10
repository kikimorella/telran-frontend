package de.telran.d211021.array;

public class HomeWorkContinueArray {
    /*
    1. Заполнить массив числами от 0 до его длины минус 1 в обратном порядке. ({5,4,3,2,1,0}) .
    Написать функцию static void function(int[]array)
    2. (*) развернуть массив. static void function(int[]array) {5, 10, 7, 15} -> {15, 7, 10, 5}.
    Написать функцию static void function(int[]array)
    3. Заполнить массив элементами, равными 3 * на номер индекса. Написать функцию static void function(int[]array)
    4. Заменить все отрицательные элементы на абсолютное значение (-3 -> 3, -239 -> 239).
    Написать функцию static void function(int[]array)
    5. Если номер кредита делится на 13, его никто не выдает. Если номер кредита делится на 3, его выдает Маша.
    Если остаток от деления номера кредита равен 1, его выдает Петя. Если 2, то Вася. Вывести в консоль, кто выдал
    текущий кредит, а также после всех выданных кредитов вывести их количество. Если известен номер послднего
    выданного кредита. static void function(int creditNumber)
    6. В двумерном массиве посчитать количество строк с отрицательными элементами (использовать break) .
    Написать функцию static int function(int[][]array)
    */
    public static void main(String[] args) {
        int[] array = new int[15]; // {0, 0, 0, .., 0}
        int[] simpleArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] anotherArray = {40, -35, -30, 25, 20, -15, -10, 5, 0};
        int[][] matrix = {
                {-1, 2, -3, 4, -5, 6, -7},
                {8, -9, 10, -11, 12, -13, 14}, // matrix [1][2] = 10 (это адрес конкретного значения)
                {-15, 16, -17, 18, -19, 20, -21, 22},
                {-23, 24, -25, 26, -27, 28, -29, 30}
        };
        //1
        fillArray(simpleArray);
        printArray(simpleArray);
        fillArray(array);
        printArray(array);
        //3
        fillArrayIncrease3(simpleArray);
        printArray(simpleArray);
        fillArrayIncrease3(array);
        printArray(array);
        //4
        replaceNegativeElements(anotherArray);
        printArray(anotherArray);
        //6
        System.out.println("Has " + findNegativeCountInRow(matrix) + " negative elements");
        System.out.println("Has " + findRowWithNegativeCount(matrix) + " negative Rows");
        System.out.println("Has " + findRowWithNegativeCount2(matrix) + " negative Rows");
        //2
        arrayReversed(anotherArray);
        printArray(anotherArray);
        arrayReversed2(simpleArray);
        //5
        lastCredit(2700);
    }

    // лучше, чтоб метод/модуль/класс делал что-то одно, т.е. sout запихивать в main
    static void printArray(int[] array) { // функция, которая распечатывает массив
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // 1 Заполнить массив числами от 0 до его длины минус 1 в обратном порядке. ({5,4,3,2,1,0}) .
    static void fillArray(int[] arr) { // желательно не использовать названия из main
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr.length - 1 - i; // с увеличением индекса массива нужно уменьшать значение
        }
    }

    // 3 Заполнить массив элементами, равными 3 * на номер индекса.
    static void fillArrayIncrease3(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 3;
        }
    }

    // 4 Заменить все отрицательные элементы на абсолютное значение (-3 -> 3, -239 -> 239).
    static void replaceNegativeElements(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array[i] = -array[i];
            } // чтобы число стало положительным его нужно умножить на -1
        }
    }

    //6 В двумерном массиве посчитать количество строк с отрицательными элементами (использовать break) .
    static int findNegativeCountInRow(int[][] array) {
        int negativeCount = 0;
        for (int i = 0; i < array.length; i++) { // перебираем массив массивов
            for (int j = 0; j < array.length; j++) { // пробегаемся по эментов текущего подмассива
                if (array[i][j] < 0) { //j элемент i массива
                    negativeCount++; //добавляем элемент
                }
            }
        }
        return negativeCount;
    }

    static int findRowWithNegativeCount(int[][] array) {
        int negativeRow = 0;
        for (int i = 0; i < array.length; i++) { // 4 этерации (строки), т.е. перебираем массив массивов
            for (int j = 0; j < array[i].length; j++) { // пробегаемся по эментам текущего подмассива (строки)
                if (array[i][j] < 0) { //когда находим подходящий j элемент i массива
                    negativeRow++; // добавляем строку
                    break; // идем к следующей строке
                }
            }
        }
        return negativeRow;
    }
    static int findRowWithNegativeCount2(int[][] array) {
        int negativeRow = 0;
        // label - резко используются метки, как правило в сложных алгоритмах,
        // когда нужно перейти через несколько действий
        outerFor:
        for (int i = 0; i < array.length; i++) { // 4 этерации (строки), т.е. перебираем массив массивов
            for (int j = 0; j < array[i].length; j++) { // пробегаемся по эментам текущего подмассива (строки)
                if (array[i][j] < 0) { //когда находим подходящий j элемент i массива
                    negativeRow++; // добавляем строку
                    continue outerFor; // идем к следующей строке
                }
            }
        }
        return negativeRow;
    }

    //2 развернуть массив. static void function(int[]array) {5, 10, 7, 15} -> {15, 7, 10, 5}.
    static void arrayReversed(int[] array) {
        for (int i = 0; i < array.length / 2; i++) { //Находим делением на 2 "срединую точку массива"
            //срединный элемент (в нечетном массиве) нас не интересует, т.к. он останется на своем месте при развороте.
            int tmp = array[i]; // Начнем с элемента из первой половины массива(нулевого).
            // Отправляем его во временное хранилище, а в 0 положение массива помещаем крайний/последний элемент.
            array[i] = array[array.length - 1 - i];
            array[array.length - i - 1] = tmp;
            // Из временного хранилища в последний элемент массива помещаем то, что было в 0 положении
        }
    }

    static void arrayReversed2(int[] array) { // не правильно! т.к. новый массив не будет сущ-ть, ссылки на него нет,
        // он существует только внутри этого метода
        int[] array2 = new int[array.length];// создать новый массив и наполнить числами из старого с конца
        for (int i = 0; i < array.length; i++) {
            array2[i] = array[array.length - 1 - i];  // развернули имеющийся
            System.out.print(array2[i] + " ");
        }
    }

    //5
    /*Если номер кредита делится на 13, его никто не выдает. Если номер кредита делится на 3, его выдает Маша.
    Если остаток от деления номера кредита равен 1, его выдает Петя. Если 2, то Вася. Вывести в консоль, кто выдал
    текущий кредит, а также после всех выданных кредитов вывести их количество. Если известен номер послднего
    выданного кредита.*/
    static void lastCredit (int creditCount) {
        int maryCredit = 0;
        int peterCredit = 0;
        int vasiaCredit = 0;
        if (creditCount % 13 == 0) {
            System.out.println("This is a happy loan");
        } else if (creditCount % 3 == 0) {
            System.out.println("Mary is the last");
        } else if (creditCount % 3 == 1) {
            System.out.println("Peter is the last");
        } else if (creditCount % 3 == 2) {
            System.out.println("Vasia is the last");
        }
        for (int creditNumber = 1; creditNumber <= creditCount; creditNumber++) {
            if (creditNumber % 13 == 0) {
                continue;
            }
            if (creditNumber % 3 == 0) {
                maryCredit++;
            }
            if (creditNumber % 3 == 1) {
                peterCredit++;
            }
            if (creditNumber % 3 == 2) {
                vasiaCredit++;
            }
        }
        int totalCredit = maryCredit + peterCredit + vasiaCredit;
        System.out.println(totalCredit);
    }
    // записать, как сделал женя
}
