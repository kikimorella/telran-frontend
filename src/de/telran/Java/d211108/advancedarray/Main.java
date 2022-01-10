package de.telran.d211108.advancedarray;
// Задача: Описать класс, имитирующий массивы с расширенной функциональностью
// Хотим метод:
// set(int index, int value) - аналог array[idex] = value;
// get(int index) - аналог int value = array[index];
// size() - аналог int length = array.length;
// append (int elt) - добавить в конец элемент (расширить массив на 1 справа)
// insert (int index, int value) - void - раздвинуть массив, не подменить, а засунуть дополнительный элемент
// delete (int index) - void - вырезать элемент по индексу
// contains (int elt) - boolean - содержит ли массив тот или иной элемент
public class Main {
    // класс пишут: класс сущностей описывает класс (что мы хотим)
    public static void main(String[] args) {
        int[] array = new int[3];
        array[0] = 10;
        array[1] = 5;
        array[2] = 20;

        AdvancedIntArray advancedIntArray = new AdvancedIntArray(3); //
        advancedIntArray.set(0, 10); // засовываем в метод данные массива
        advancedIntArray.set(1, 5); // имитируем работу массива
        advancedIntArray.set(2, 20);

        int zeroElt = array[0]; // достать элемент через переменную
        System.out.println(zeroElt);

        int advancedZeroElt = advancedIntArray.get(0); // достать элемент из продвинутого массива
        System.out.println(advancedZeroElt);

        advancedIntArray.append(99); // теперь на последней позиции число индекс 3
        System.out.println(advancedIntArray.get(3));

        advancedIntArray.insert(2, 60); // {10, 5, 60, 20, 99}

        advancedIntArray.print();

        advancedIntArray.delete(2); // {10, 5, 99}

        System.out.println(advancedIntArray.contains(5)); //true

        advancedIntArray.print();
    }
}
