package de.telran.d211021.array;

public class ArrayMax {
    public static void main(String[] args) {
        int[][] array = { // 255 - максимальноя мерность массива
                {1, 2, 3, 4},
                {5, 6, 7, 8, 9},
                {10, 11, 12, 13, 14, 15}
        };
        int[][] array2 = new int[3][4]; // массив, состоящий из 3 массивов с размером 5 и каждый элемент равен 0
/*        {
            {0, 0, 0, 0, 0};
            {0, 0, 0, 0, 0};
            {0, 0, 0, 0, 0};
        }
*/
        array2[1] = new int[]{1, 2};
/*        {
            {0, 0, 0, 0, 0};
            {1, 2};
            {0, 0, 0, 0, 0};
        }
*/
        array2[2] = null;
/*        {
            {0, 0, 0, 0, 0};
            {1, 2};
            null
        }
*/
        array2 = null;

        int[][] array3 = new int[3][]; // массив, состоящий из 3 массивов с размером null
/*        {
            null,
            null,
            null,
        }
*/
        int[][][] array4 = { // 3-херный массив, array.length = 2 , т.к. 2 подмассива
                {
                        {1, 2, 3, 4},
                        {5, 6, 7, 8, 9},
                        {10, 11, 12, 13, 14, 15}
                },
                {
                        {0, 0, 0, 0, 0},
                        {1, 2},
                        null
                }
        };
    }
    // в двумерном массиве определить есть ли в нем отрицательные элементы
    static boolean containsNegatives (int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) { // текущий подмассив и пробегаемся по эментов
                if (array[i][j] < 0) { //j элемент i массива
                    return true;
                }
            }
        }
        return false;
    }
}


