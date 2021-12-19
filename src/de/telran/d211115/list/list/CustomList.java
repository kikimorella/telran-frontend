package de.telran.d211115.list.list;

import java.util.Iterator;

/**
 * The insterface describes a data structure called List. It is a ordered data structure.
 */
// public interface CustomList // override toString for all inherited classes
public interface CustomList<T> { // все методы в interface - public. Важно - описание чем мы будем пользоваться
    // Описания должны быть! Подробными! Тот, кто будет читать должен понял. (добавляем /** перед public)

    /**
     * The method swaps the value on the index position
     *
     * @param index the position
     * @param value a new value for the index position
     * @throws CustomOutOfBoundsException if index < 0 or >= size
     */
    public void set(int index, T value); // устанавливает элемент по индексу

    /**
     * The method gets the value on the index position
     *
     * @param index the position, whose value to be returned
     * @return the value by its position
     * @throws CustomOutOfBoundsException if index < 0 or >= size
     */
    public T get(int index); // достаёт элемент по индексу

    /**
     * @return The number of elements in the list
     */
    public int size(); // возвращает длину

    /**
     * @param value to be found
     * @return whether the value is in the list
     */
    public boolean contains(T value); // содержит ли тот или иной элемент

    /**
     * removes the value by its position. The elements which are after the index move to the left by 1 position
     *
     * @param index of the value to remove
     * @return the value being removed
     * @throws CustomOutOfBoundsException if index < 0 or >= size
     */
    public T removeById(int index); // (был void) вырезать элемент по индексу и вернуть его значение

    /**
     * removes the element by its value. Only one element will be removed if exists
     *
     * @param value of the element to remove
     * @return true if element exists and removed, false otherwise
     * @throws CustomOutOfBoundsException if index < 0 or >= size
     */
    public boolean removeByValue (T value); // вырезать элемент по значению. {10, 15, 10, 7} -> {15, 10, 7}

    /**
     * Add an element to the end of the list
     *
     * @param value to append
     */
    public void add(T value); // добавить в конец элемент

    /**
     * Inserts the value to the index place. All the elements which are after the index move to the right by 1 position
     *
     * @param index the place to insert
     * @param value the element to insert
     * @throws CustomOutOfBoundsException if index < 0 or > size
     */
    public void insert(int index, T value); // засунуть дополнительный элемент по индексу

    /**
     * prints the element out to the console (one by one)
     */
    public void println();

    /**
     * The method must return an iterator, which iterates the list from the most left element (first) to the
     * @return
     */
    Iterator<T> getIterator();

}
/*
    Interface - это набор правил, реализовать которые должны классы, его имплементирующие (наследующие - реализующие).
    Отвечает на вопрос: что делать, а не как это делать.
    Интерфейс - это своего рода контракт, описание того, как должны вести себя объекты классов, его наследующих.
    (системный блок на нем есть кнопка Power (включает), но нас не волнует, что находится внутри и как это работает)
    Интерфейсы похожи на абстрактные классы, но не содержат полей (реализации методов). Есть исключения после java 8.
    Все методы интерфейсов являются абстрактными (просто сигнатура).
    Массив - упорядоченная структура данных с 3 операциями.
    Лист - тоже структура данных. Упорядоченный. Сортируемый.
    Структура данных (data structure) - это описание объектов, содержащих в себе множество сходных по типу (однотипных)
    данных (переменных/объектов/ссылок) и имеющих определенный набор правил (методов) для работы с этими данными.
    */
