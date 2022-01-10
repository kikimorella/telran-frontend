package de.telran.d211108.advancedarray;

// мы это делаем, чтоб все объекты массива обладали дополнительной функциональностью
public class AdvancedIntArray { // это класс, который копирует массив (и описывает его функциональность)

    private int[] source; //приватное поле - основание/база текущего объекта AdvancedIntArray

    // инкапсулировать массив элементов (обернуть класс)
    // создаём конструктор, который эмитирует действия массива
    public AdvancedIntArray(int initialSize) { // устанавливает длину массива
        source = new int[initialSize]; // он не меняется
    } // создали О-т, в котором создается приватное поле source, которое является массивом с initialSize размером

    public void set(int index, int value) {
        source[index] = value;
    } // устанавливает элемент по индексу

    public int get(int index) {
        return source[index];
    }  // достаёт элемент по индексу

    public int size() {
        return source.length;
    } // возвращает длину массива

    public void append(int elt) { // добавить в конец элемент
        int[] newSource = new int[source.length + 1]; // возвращаем новый массив

        for (int i = 0; i < source.length; i++) {
            newSource[i] = source[i]; // копируем старые элементы
        }

        newSource[newSource.length - 1] = elt; // мы добавляем в конец! последний элемент, это новое число

        source = newSource; // важно! ссылка со старого массива на новый
    }

    public void insert(int index, int elt) { // засунуть дополнительный элемент
        int[] newSource = new int[source.length + 1]; // {1, 2, 3, 4} = {0, 0, 0, 0, 0}

        for (int i = 0; i < index; i++) { // до конкретного индекса мы заполняем элементы
            newSource[i] = source[i]; // копируем старые элементы {1, 2 , 0, 0, 0}
        }

        newSource[index] = elt; // вставляем в индекс элемент {1, 2 , 5, 0, 0}

        for (int i = index; i < source.length; i++) { // после конкретного индекса мы дозаполняем элементы
            newSource[i + 1] = source[i]; // {1, 2 , 5, 3, 4}
        }

        source = newSource; // важно!
    }

    public void append2(int elt) { // теперь можно и так добавить в конец элемент
        insert(source.length,  elt);
    }

    public void delete(int index) { // вырезать элемент по индексу
        int[] newSource = new int[source.length - 1];

        for (int i = 0; i < index; i++) {
            newSource[i] = source[i];
        }

        for (int i = index; i < newSource.length; i++) {
            newSource[i] = source[i + 1]; // на место индекса нового массива встаёт следующий элемент из старого массива
        }

        source = newSource;
    }

    public boolean contains(int elt) { // содержит ли массив тот или иной элемент
        for (int i = 0; i < source.length; i++) {
            if (elt == source[i])
                return true;
        }
        return false;
    }

    public void print() { // print 'this' advanced array out into the console
        for (int i = 0; i < source.length; i++) {
            System.out.print(source[i] + " ");
        }
        System.out.println();
    }
}
