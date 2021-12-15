package de.telran.d211209.pairwiseproduct;

import java.util.Arrays;

public class PairwiseProduct { // UnitTest - Alt + Enter -> Create test -> JUnit5 + Fix -> Ok

    /**
     * The method must return the max Pairwise Product from the array
     *
     * @param array with non-negative numbers
     * @return
     */
    // {12, 1, 8, 10, 3} -> 120
    public long findMaxPairwiseProduct(int[] array) {
        long max = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
//                long mul = array[i] * array[j]; // int * int = int нужно один из array сделать long, иначе bag
                long mul = (long) array[i] * array[j];
                if (mul > max)
                    max = mul;
            }
        }
        return max;
    }

    //optimize the solution by finding two max numbers from the array
    public long findMaxPairwiseProduct2(int[] array) {
//        Arrays.sort(array); //отсортировали массив, но это долго
//        int lastIndex = array.length - 1;
//        long max1 = array[lastIndex];
//        long max2 = array[lastIndex - 1];
        int maxIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[maxIndex] < array[i])
                maxIndex = i;
        }

        int max = array[maxIndex];
        array[maxIndex] = array[0];
        array[0] = max;

        int maxNext = 0;

        for (int i = 1; i < array.length; i++) {
            if (maxNext < array[i])
                maxNext = i;
        }

        return (long) max * maxNext;
    }
}
