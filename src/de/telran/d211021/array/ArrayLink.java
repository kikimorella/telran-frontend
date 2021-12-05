package de.telran.d211021.array;

public class ArrayLink {
    public static void main(String[] args) {
    int[]array1 = new int[]{3, -2, 9, 6}; // создаются переменнае (левая часть), резервируется память (правая часть) и
        // присваивается значения и формируется связь (ссылка) на объект (массив)
    int[]array2 = new int[]{5, -8, 19, 27, 36};
    printArray(array1);
    printArray(array2);
    array2 = new int [] {5, 2, -10, 15, 7, 100, 200};
    printArray(array2);
    array2 = array1; // когда место изменяется, все ссылочные переменные изменяются
    printArray(array2);

    array1[2] = 90;
    printArray(array1);
    printArray(array2); //ссылочный тип
    }
    static void printArray (int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
/*
stack - все локальные переменные тут живут, а все переменные живут в Heap (Memory)
 */
