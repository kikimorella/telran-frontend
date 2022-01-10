package de.telran.d211216.iterator;

import java.util.Iterator;

public class IteratorMain {

    public static void main(String[] args) {
        int[] array = {10, 7, 17, 25}; // to iterate
        int[] anotherArray = {109, 208, 307, 406, 505, 604, 703, 802, 901, 0};
        int[] mixArray = {55, 33, 22, 77, 66, 11, 0, 99, 88, 44};

        // any Iterator must not change the collection it iterates
        Iterator<Integer> iterator = new IntArrayStraightIterator(array); // CustomIterator<Integer> iterator

        // how to use iterator
        while (iterator.hasNext()) { // hasNext сработает столько раз, сколько элементов в массиве. Контролирует.
            int currentElement = iterator.next(); // iterator.next выдает по очереди текущий элемент пока hasNext - true
            //some code working with c currentElement
            System.out.print(currentElement + " ");
        }

        // 1. Написать итератор, который перебирает целочисленный массив справа налево.
        System.out.println();

        Iterator<Integer> iteratorReverse = new IntArrayReverseIterator(anotherArray);

        while (iteratorReverse.hasNext()) {
            int currentElement = iteratorReverse.next();
            System.out.print(currentElement + " ");
        }

        // 2. Написать итератор, который перебирает массив в порядке возрастания (помнить о том, что массив должен
        // остаться неизменным после перебора). Для сортировки массива можно Array.sort().
        System.out.println();

        Iterator<Integer> iteratorSort = new IntArraySortedIterator(mixArray);

        while (iteratorSort.hasNext()) {
            int currentElement = iteratorSort.next();
            System.out.print(currentElement + " ");
        }
    }
}
/*
Итератор (iterator) - это паттерн программирования, целью которого является предоставить правило для перебора
какого-либо набора однотипных объектов (массив, структура данных с элементами, которые можно перебрать).
Используется для того, чтоб двигаться туда-обратно по связному списку.
При этом операция get будет довольно медленной, а операция next() очень быстрой.

Паттерн — это шаблон проектирования (поведение), которого должен придерживаться класс или множество связанных классов.

Не следует путать интерфейс iterator с паттерном iterator!
Дословно «Iterator» можно перевести как «переборщик». То есть это некая сущность, способная перебрать все элементы
в коллекции. При этом она позволяет это сделать без вникания во внутреннюю структуру и устройство коллекций.

Итератор – это специальный внутренний объект в коллекции, который с одной стороны имеет доступ ко всем ее private
данным и знает ее внутреннюю структуру, с другой – реализует общедоступный интерфейс Iterator.
Некоторые итераторы имеют внутри себя массив, куда копируются все элементы коллекции во время создания итератора.
Это гарантирует, что последующее изменение коллекции не повлияет на порядок и количество элементов.
Итератор позволяет поочередно получить все элементы коллекции.
Метод next() возвращает следующий (очередной) элемент коллекции.
Метод hasNext() используется, чтобы проверять, есть ли еще элементы.
Ну, а remove() – удаляет текущий элемент.

ListIterator. Списки, независимо от реализации, обладают порядком элементов, что в свою очередь позволяет работать
с ними через итератор чуть более удобно.
У интерфейса ListIterator<E> есть методы:
boolean hasNext()	Проверяет, есть ли еще элементы впереди.
E next()	Возвращает следующий элемент.
int nextIndex()	Возвращает индекс следующего элемента
void set(E e)	Меняет значение текущего элемента
boolean hasPrevious()	Проверяет, есть ли элементы позади.
E previous()	Возвращает предыдущий элемент
int previousIndex()	Возвращает индекс предыдущего элемента
void remove()	Удаляет текущий элемент
void add(E e)	Добавляет элемент в список.
 */