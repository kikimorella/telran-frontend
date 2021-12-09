package de.telran.d211115.list.list; // generify this
// Название интерфейса пишут в конце
public class AdvancedArrayList<T> implements CustomList<T> {
    // Чтобы класс применил интерфейс, надо использовать ключевое слово implements
    // это реализация интерфейса!!!
    // Generate -> implement Methods
private T[] source;

    public AdvancedArrayList(int initialSize) {
        //source = new int[initialSize];
        source = (T[]) new Object [initialSize];                                                                         //          ?
    }
    // ссылки могут быть вида интерфейс, а объекты - нет
    // все интерфейсы (абстрактные методы) должны быть реализованы в реальном классе, т.е. надо учитывать, что если
    // класс применяет интерфейс, то он должен реализовать все методы интерфейса. Если класс не реализует какие-то
    // методы интерфейса, то такой класс должен быть определен как абстрактный, а его неабстрактные классы-наследники
    // затем должны будут реализовать эти методы.
    @Override
    public void set(int index, T value) {
        source[index] = value;
    }

    @Override
    public T get(int index) {
        return source[index];
    }

    @Override
    public int size() {
        return source.length;
    }

    @Override
    public void insert(int index, T elt) {
        //int[] newSource = new int[source.length + 1];
        T[] newSource = (T[]) new Object [source.length + 1];                                                             // !

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

    @Override
    public void removeById(int index) {
        //int[] newSource = new int[source.length - 1];
        T[] newSource = (T[]) new Object [source.length - 1];                                                            // !

        for (int i = 0; i < index; i++) {
            newSource[i] = source[i];
        }

        for (int i = index + 1; i < source.length; i++) {
            newSource[i - 1] = source[i];
        }

        source = newSource;
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
}
