package de.telran.d211115.list;

import de.telran.d211108.advancedarray.AdvancedIntArray;
import de.telran.d211115.list.list.*;

import java.util.Iterator;


public class ListMain {

    public static void main(String[] args) {
        CustomLinkedList<String> list = new CustomLinkedList<>();
        list.add("Vasia");
        list.add("Petia");
        list.add("Masha");
        System.out.println(list);

        // CustomList arrayList = new CustomArrayList();
        CustomList<Integer> arrayList = new CustomArrayList<>();

        CustomList<String> stringList = new CustomArrayList<>();
        stringList.add("hello");
        stringList.add("world");
        stringList.add("guys");
        stringList.println();

        AdvancedIntArray advancedIntArray = new AdvancedIntArray(3);

        arrayList.add(10);
        arrayList.add(18);
        arrayList.add(3);
        arrayList.add(-5);
        arrayList.add(50);

        arrayList.println(); //{10, 18, 3, -5, 50}

        advancedIntArray.set(0, 10);
        advancedIntArray.set(1, 5);
        advancedIntArray.set(2, 20);

        advancedIntArray.print();
/*
        try {
            arrayList.set(-2, 20);
            arrayList.toString();
        } catch (CustomOutOfBoundsException e){
            System.out.println("Inside catch CustomOutOfBoundsException");
        }
 */
        arrayList.add(99); //{10, 5, 20, -5, 50, 99}
        arrayList.println();

        arrayList.removeById(2);
        //arrayList.println(); //{10, 5, -5, 50, 99}

        // old way to iterate over a list
        // Не эффективный способ работы с Листом. Мы не можем вне Листа переходить по его узлам.
        // Сделано, чтоб нельзя было испортить Лист, поэтому проще сделать вложенный класс
        for (int i = 0; i < arrayList.size(); i++) {
            int number = arrayList.get(i);
        }

        // new way to iterate.
        // У каждого Листа есть Iterator, и все данные, которые нужно перебрать находятся внутри
        Iterator<Integer> iterator = arrayList.getIterator();
        while (iterator.hasNext()) {
            int number = iterator.next();
        }
        // Итератор прогнать можно только 1 раз, потом он сбрасывается на начало,
        // если мы хотим перебрать ещё раз мы создаём новый объект итератор

        // обычно вложенный класс private, а не public
        AdvancedArrayList<Integer> aList = new AdvancedArrayList<>(0);
        AdvancedArrayList.ListIterator iterator1 = aList.new ListIterator();
    }
// эта ссылка CustomList list указывает, что в этом объекте есть методы, которые описаны в интерфейсе, а реализованы
// в AdvancedArrayList. Тут нам важно, что они делают, но не важно как.
}
