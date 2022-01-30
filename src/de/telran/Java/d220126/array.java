package de.telran.d220126;

import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        int i = 10;

        int[] ints = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int ints2[] = {1, 22, 3}; // старый способ указания массива из языка С
        int ints3[] = new int[3];

        String[] strings = {"Lena", "Anna", "Svetlana"};

        System.out.println(ints[0]);
        System.out.println(ints[2]);
        System.out.println(ints.length);
        System.out.println(ints[ints.length - 1]);
        System.out.println();
        printArray(ints);

        ints[2] = ints2[1];

        System.out.println();
        printArray(ints);

        System.out.println("Input array");
        Scanner sc = new Scanner(System.in);
        for (int j = 0; j < ints3.length; j++) {
            ints3[j] = sc.nextInt();
        }

        printArray(ints3);
        printArray(strings);
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void printArray(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + ". " + arr[i] + " " + arr[i].length()); // i+"." - если мы хотим добавить нумерацию
        }
    }
}
