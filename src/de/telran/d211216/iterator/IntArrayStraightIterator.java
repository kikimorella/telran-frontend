package de.telran.d211216.iterator;

import java.util.Iterator;

// {10, 7, 17, 25}
public class IntArrayStraightIterator implements Iterator<Integer> {

    private final int[] array;
    int currentId = 0;

    public IntArrayStraightIterator(int[] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() { // есть ли ещё элемент, который можно вернуть. Фактически это hasCurrent.
        return currentId < array.length;
    }

    @Override
    public Integer next() {
        int res = array[currentId];
        currentId++;
        return res;
    }
}
