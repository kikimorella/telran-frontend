package de.telran.d211115.list.list; // generify this

import java.util.Iterator;

// Название интерфейса пишут в конце
public class AdvancedArrayList<T> implements CustomList<T> {
    // Чтобы класс применил интерфейс, надо использовать ключевое слово implements
    // это реализация интерфейса!!!
    // Generate -> implement Methods
    private T[] source;

    public AdvancedArrayList(int initialSize) {
        //source = new int[initialSize];
        source = (T[]) new Object[initialSize];
    }

    // ссылки могут быть вида интерфейс, а объекты - нет
    // все интерфейсы (абстрактные методы) должны быть реализованы в реальном классе, т.е. надо учитывать, что если
    // класс применяет интерфейс, то он должен реализовать все методы интерфейса. Если класс не реализует какие-то
    // методы интерфейса, то такой класс должен быть определен как абстрактный, а его неабстрактные классы-наследники
    // затем должны будут реализовать эти методы.
    @Override
    public void set(int index, T value) {
        if (index < 0 || index >= source.length)
            throw new CustomOutOfBoundsException();

        source[index] = value;
    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= source.length)
            throw new CustomOutOfBoundsException();

        return source[index];
    }

    @Override
    public int size() {
        return source.length;
    }

    @Override
    public void insert(int index, T elt) {
        if (index < 0 || index > source.length)
            throw new CustomOutOfBoundsException();

        //int[] newSource = new int[source.length + 1];
        T[] newSource = (T[]) new Object[source.length + 1];

        for (int i = 0; i < index; i++) {
            newSource[i] = source[i];
        }
        newSource[index] = elt;

        for (int i = index + 1; i < newSource.length; i++) {
            newSource[i] = source[i - 1];
        }

        source = newSource;
    }

    @Override
    public boolean contains(T elt) {
        for (int i = 0; i < source.length; i++) {
            if (source[i] == elt)
                return true;
        }

        return false;
    }

    @Override // public void removeById(int index) {
    public T removeById(int index) {
        if (index < 0 || index >= source.length)
            throw new CustomOutOfBoundsException();

        //int[] newSource = new int[source.length - 1];
        T[] newSource = (T[]) new Object[source.length - 1];

        T removedElt = source[index]; // запоминаем элемент
        for (int i = 0; i < index; i++) {
            newSource[i] = source[i];
        }

        for (int i = index + 1; i < source.length; i++) {
            newSource[i - 1] = source[i];
        }

        source = newSource;
        return removedElt;
    }

    @Override
    public boolean removeByValue(T value) {
        for (int i = 0; i < source.length; i++) {
            if (source[i].equals(value))
                removeById(i);
            return true;
        }
        return false;
    }

    @Override
    public void add(T value) { // самый часто используемый метод
        insert(source.length, value); // количество операций эквивалентно длине массива
    }

    @Override
    public void println() {
        for (int i = 0; i < source.length; i++) {
            System.out.print(source[i] + " ");
        }
        System.out.println();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < source.length; i++) {
            sb.append(source[i]);
        }
        return sb.toString();
    }

    @Override
    public Iterator<T> getIterator() {
        return new ListIterator(); // наследование определенности <T> становится <E>. Mы перебираем source.
    }
/*
    private static class ListIterator<E> implements Iterator<E> { // нужен вложенный класс т.к. нет доступа к source
// его поля не зависят от класса, в которой он вложен
        private final E[] array;
        int currentId = 0;

        public ListIterator(E[] array) {
            this.array = array;
        }

        @Override
        public boolean hasNext() {
            return currentId < array.length;
        }

        @Override
        public E next() {
            E res = array[currentId];
            currentId++;
            return res;
        }
    }
*/
// understand the difference between static and not static inner classes
    public class ListIterator implements Iterator {

        int currentId = 0;

        @Override
        public boolean hasNext() {
            return currentId < source.length;
        }

        @Override
        public T next() {
            T res = source[currentId];
            currentId++;
            return res;
        }
    }

}
/*
Модификатор static в Java напрямую связан с классом. Если поле или метод статичны, значит они принадлежит классу.
Исходя из этого, можно обращаться к статическому методу или полю, используя имя класса.
Static — модификатор, применяемый к полю, блоку, методу или внутреннему классу. Данный модификатор указывает на
привязку субъекта  к текущему классу.
При обозначении переменной уровня класса мы указываем на то, что это значение относится к классу.
Если этого не делать, то значение переменной будет привязываться к объекту, созданному по этому классу.
Если переменная не статическая, то у каждого нового объекта данного класса будет своё значение этой переменной,
меняя которое мы меняем его исключительно в одном объекте.
public class Car {int km;} Тогда в main: Orange car - 100, Blue car - 85
Ну а если у нас переменная статическая, то это глобальное значение — одно для всех.
public class Car {static int km;} Тогда тот же код в main: Orange car - 85, Blue car - 85

Статические методы отличаются от обычных тем, что они также привязаны к классу, а не к объекту.
Важным свойством статического метода является то, что он может обратиться только к статическим переменным/методам.

Статическим классом может быть только внутренний класс.
По сути статический вложенный класс ничем не отличается от любого другого внутреннего класса за исключением того,
что его объект не содержит ссылку на создавший его объект внешнего класса.
Для использования статических методов/переменных/класса нам не нужно создавать объект данного класса.
 */