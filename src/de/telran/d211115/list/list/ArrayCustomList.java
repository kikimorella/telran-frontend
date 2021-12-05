package de.telran.d211115.list.list;

// ArrayList - эффективная реализация структурных данных List (список) через массив. Он обладает пустым конструктором.
/*
Увеличение происходит для эффективности
5  7  -3  10 --> емкость нового будет в 2 раза больше (8), следующее увеличение снова в 2 раза больше (16)
Когда вы создаете ArrayList, внутри класса ArrayList существует массив элементов. Эти элементы имеют значение null,
пока они не ссылаются на один экземпляр объекта.
*/
// public class ArrayCustomList implements CustomList {
//
//     private int[] source; // это не размер структуры данных!
//
//     private static final int INITIL_CAPACITY = 8; // или 16. это константа... (ёмкость)
//
//     private int size; // возвращает количество элементов в списке (сколько вы добавили в него), а не текущую емкость.
//     // Переменная, которая следит за реальным размером.
//
//     public ArrayCustomList() { // объект, инициализируем поля, как массив, состоящий из INITIL_CAPACITY элементов
//         source = new int[INITIL_CAPACITY];
//     }
//
//     // Мы добавляем в первое свободное место элемент, дойдя до конца source (массива), но теперь мы создаем количество
//     // ячеек равных длине массива, но когда он закончится, мы создаем новый массив с длиной в 2 раза больше и продолжаем
//     // его заполнять. Количество увеличений ограничено - 2 в 31 степени. Теперь (фактически) source подменяется реже.
//     @Override
//     public void add(int value) {
// //        if (size < source.length) // проверка
// //            source[size] = value; // мы новое значение должны засунуть на место size и оно должно лечь на 0 индекс
//         if (size == source.length)
//             increaseCapacity();
//
//         source[size++] = value; // сначала засовываем value по старому размеру source, а после чего size меняется
//         // size++; // не забываем менять размер массива (в remove и в insert) и мы можем засунуть его в строчку выше
//     }
//
//     private void increaseCapacity() {
//         int[] newSource = new int[source.length * 2]; // мы делаем source в 2 раза больше предыдущего
//
//         for (int i = 0; i < source.length; i++) {
//             newSource[i] = source[i];
//         }
//
//         source = newSource; // не забываем!
//     }
//
//     @Override // засунуть дополнительный элемент по индексу
//     public void insert(int index, int value) {
//         if (size == source.length) { // увеличить размер
//             increaseCapacity();
//         }
// //        for (int i = index; i < size; i++) {
// //            int temp = source[i]; // копируем значение во временную переменную
// //
// //            if (i == index) {
// //                source[index] = value; // вставляем на нужное место значение
// //            }
// //
// //            source[i + 1] = temp; // следующее значение берем из временного
// //        }
//         for (int i = size; i < index; i--) {
//             source[i] = source[i - 1];
//         }
//         source[index] = value;
//         size++;
//     }
//
//     @Override // убрать значение по индексу
//     public void removeById(int index) {
// //        for (int i = size; i <= index; i--) {
// //            int temp = source[size]; //
// //            source[i] = temp; // песледнее меняемое значение - индекс
// //        }
//
//         for (int i = index + 1; i < size; i++) {
//             source[i] = source[i - 1];
//         }
//         size--;
//     }
//
//     @Override
//     public int size() {
//         return size;
//     }
//
//     // оставниеся методы не меняются, т.к. совпадают с AdvancedArrayList?
//
//     @Override
//     public void set(int index, int value) {
//         if (index >= 0 && index < size)
//             source[index] = value; // но! что если index не в массиве (по хорошему нужно исключить)
//     }
//
//     @Override
//     public int get(int index) {
//         return source[index];
//     }
//
//     @Override
//     public boolean contains(int value) {
//         for (int i = 0; i < size; i++) { // идем до размера, т.к. не важно какой длинны наш массив
//             if (source[i] == value)
//                 return true;
//         }
//         return false;
//     }
//
//     @Override
//     public void println() {
//         for (int i = 0; i < size; i++) { // не source.length!
//             System.out.print(source[i] + " ");
//         }
//         System.out.println();
//     }
// }
