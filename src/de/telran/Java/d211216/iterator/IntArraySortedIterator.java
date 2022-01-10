package de.telran.d211216.iterator;

import java.util.Arrays;
import java.util.Iterator;

public class IntArraySortedIterator implements Iterator {
    private final int[] array;
    int currentId = 0;

    public IntArraySortedIterator(int[] array) {
        this.array = array;
        Arrays.sort(this.array);
    }

    @Override
    public boolean hasNext() {
        return currentId < array.length;
    }

    @Override
    public Integer next() {
        int res = array[currentId];
        currentId++;
        return res;
    }
}
