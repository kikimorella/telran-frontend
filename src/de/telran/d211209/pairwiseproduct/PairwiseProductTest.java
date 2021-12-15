package de.telran.d211209.pairwiseproduct;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*; // Alt + Enter -> add library

class PairwiseProductTest {
// в тестах нужно стараться проверить краевые случаи
    PairwiseProduct pairwiseProduct = new PairwiseProduct(); // 1. поле тестируемого

    @Test // 2. @Test и название теста, имя тестируемого метода, исходные данные, результат теста
    public void testFindMaxPairwiseProduct_oneZeroOneNonZeroElements_Zero() {
        int[] array = {0, 100}; // создаём массив
        long res = pairwiseProduct.findMaxPairwiseProduct(array);

        assertEquals(0, res); // "проверить на равенство" с 2 аргументами, что ожидаем и то, что сравниваем
    }

    @Test
    public void testFindMaxPairwiseProduct_twoNonZeroElements_Zero() {
        int[] array = {15, 100};
        long res = pairwiseProduct.findMaxPairwiseProduct(array);

        assertEquals(1500, res);
    }

    @Test
    public void testFindMaxPairwiseProduct_twoNonZeroLargeElements_Zero() {
        int[] array = {100000, 100000};
        long res = pairwiseProduct.findMaxPairwiseProduct(array);

        assertEquals(10000000000L, res);
    }

    // write additional tests
    @Test
    public void testFindMaxPairwiseProduct_threeNonZeroElements_Zero() {
        int[] array = {5, 7, 14};
        long res = pairwiseProduct.findMaxPairwiseProduct(array);
        assertEquals(98, res);
    }

    @Test
    public void testFindMaxPairwiseProduct_fourNonZeroElements_Zero() {
        int[] array = {33, 50, 88, 101};
        long res = pairwiseProduct.findMaxPairwiseProduct(array);
        assertEquals(8888, res);
    }

    @Test
    public void testFindTwoMaxNumbers_threeNonZeroElements_Zero() {
        int[] array = {5, 7, 14};
        long res = pairwiseProduct.findMaxPairwiseProduct(array);
        assertEquals(98, res);
    }

    @Test
    public void testFindMaxPairwiseProduct2_mixedElements_Zero() {
        int[] array = {0, 35, 25, 5, 15, 10, 40, 20, 30};
        long res = pairwiseProduct.findMaxPairwiseProduct2(array);

        assertEquals(1400, res);
    }

    @Test
    public void testFindMaxPairwiseProduct2_unsortedArrayElements_Zero() {
        int[] array = {619, 302, 417, 232, 29, 456, 201, 620, 141, 318, 589, 706};
        long res = pairwiseProduct.findMaxPairwiseProduct2(array);

        assertEquals(437720, res);
    }
}
/*
Юнит тесты- это тесты, проверяющие один случай (кейс) одной единицы кода (как правила, это один метод)
Чтобы эти тесты было легче писать стоит проектировать методы таким образом, чтоб они были сравнительно небольшими и
решали единственную задачу (Single Responsibility - первый принцип SOLID (1 класс - 1 объект)).
*/