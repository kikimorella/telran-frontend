package de.telran.d211115.list;

import de.telran.d211108.advancedarray.AdvancedIntArray;
import de.telran.d211115.list.list.*;


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
    }
// эта ссылка CustomList list указывает, что в этом объекте есть методы, которые описаны в интерфейсе, а реализованы
// в AdvancedArrayList. Тут нам важно, что они делают, но не важно как.
}
