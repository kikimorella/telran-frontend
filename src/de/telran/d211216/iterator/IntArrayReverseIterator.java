package de.telran.d211216.iterator;

import java.util.Iterator;

public class IntArrayReverseIterator implements Iterator {

    private int[] array;
    private int currentId;

    public IntArrayReverseIterator(int[] array) {
        this.array = array;
        this.currentId = array.length - 1;
    }

    @Override
    public boolean hasNext() {
        return currentId >= 0;
    }

    @Override
    public Integer next() {
        int res = array[currentId];
        currentId--;
        return res;
    }
}
