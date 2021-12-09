package de.telran.d211115.list.list;

public class CustomArrayList<T> implements CustomList<T> { // CustomArrayList<T> - Т для класса, CustomList<T>

    // private int[] source;
    private T[] source;
    private int size;

    private static final int INITIAL_CAPACITY = 8;

    public CustomArrayList() { // объект, инициализируем поля, как массив, состоящий из INITIL_CAPACITY элементов
        // source = new int[INITIAL_CAPACITY]; // T obj = new T; не всегда возможен, т.к. методы Т приватные
        source = (T[]) new Object[INITIAL_CAPACITY];// массив типа Т, (T[]) - кастинг
    }

    @Override
    public void set(int index, T value) { 
        //    if (index >= 0 || index < size)
        //        source[index] = value;
        if (index < 0 || index >= size)
            throw new CustomOutOfBoundsException();

        source[index] = value;
    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= size)
            throw new CustomOutOfBoundsException();
        return source[index];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean contains(T value) {
        for (int i = 0; i < size; i++) {
            if (source[i].equals(value)) // if (source[i] == value) исключение значение null
                return true;
        }
        return false;
    }

    @Override // убрать значение по индексу
    public void removeById(int index) { // метод делает не то, что нужно. должно {10 5 -5 50 99}, а у нас {10 18 3 3 3}
        if (index < 0 || index >= size)
            throw new CustomOutOfBoundsException();
        for (int i = index + 1; i < size; i++) {
            source[i] = source[i - 1];
        }
        size--;
    }

    @Override
    public void add(T value) { 

        if (size == source.length)
            increaseCapacity();

        source[size++] = value;
    }

    private void increaseCapacity() {
        //int[] newSource = new int[source.length * 2];
        T[] newSource = (T[]) new Object[source.length * 2];

        for (int i = 0; i < source.length; i++) {
            newSource[i] = source[i];
        }

        source = newSource;
    }

    @Override // засунуть дополнительный элемент по индексу
    public void insert(int index, T value) { 
        if (index < 0 || index > size)
            throw new CustomOutOfBoundsException();
        if (size == source.length) {
            increaseCapacity();
        }

        for (int i = size; i < index; i--) {
            source[i] = source[i - 1];
        }
        source[index] = value;
        size++;
    }

    @Override // использовать StringBuilder
    public void println() {
        for (int i = 0; i < size; i++) {
            System.out.print(source[i] + " ");
        }
        System.out.println();
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < size; i++) {
            sb.append(source[i]); //Метод append() добавляет подстроку в конец StringBuffer
        }
        return sb.toString();
    }
}
