package de.telran.d211104.binarysearch;

import de.telran.d211104.binarysearch.animal.Human;

public class BinarySearchMain {
    /*
    {1, 5, 7, 12, 15, 17, 20, 27, 35, 100, 120, 147, 190, 200, 220, 239}, чтоб найти число 120 нужно сделать 11 итераций
    простым перебором. если не отсортирован это быстрее, чем сортировать и использовать другой способ поиска.
    смысл сортировки будет иметь место, если элементы повторяются и нужно найти количество раз.

    чтоб найти число в массиве нужно его перебрать, если массив из миллиона элементов, нужно пройти минимум половину, а
    это долго и много, но если массив отсортирован! (16 элементов это 2 в 4 степени - количество итераций. логорифм с
    основанием 2 по количеству элементов в массиве. Логарифм это число в которое надо возвести основание, чтоб получить
    аргумент. 124 элемента, значит итераций 10, миллион - 20 итераций)
    проще найти срединный элемент и сравнить его, следовательно мы берем индекс минимального элемента и максимального,
    складываем, находим индекс (в нашем случае это 7 индекс со значением 27) и сравниваем (за 1 шаг мы убираем половину
    массива). Дальше ищем от индекса 8 индекса до 15 (средний 11 со значением 147). сравниваем 120 и 147 и отрезаем то,
    что точно больше искомого значения. теперь нужно взять средний индекс между 8 и 10 (это индекс 9 со значением 100).
    так получилось, что мы ищем 120 между индексом 10. итого 4 шага.
    */    /*
    классы в java нужны, чтоб записывать объекты. описание однотипных сущностей,т.е. схожие свойства и характеристики
    Класс - шаблон или описание всех своих представителей (объектов типа этого класса). Например String - строка

    классы создаются отдельными файлами
    */
    public static void main(String[] args) {
        // создать представителя класса в коде можно в любом месте, но мы начинаем с main
        // нужна переменная, которая ссылается на объект
        /*
        Human vasia = new Human(); // создаем нового пердставителя класса человек
        // в данном случае - конструктор без аргументов (помощь в создании объектов)
        // чтоб обратиться к полю объекта нужно название переменной (vasia) и обратиться к ссылкам (name),т.е. отдельным
        // характеристикам объектов. (у массивов характеристика - длина)
        vasia.age = 20;
        vasia.name = "Vasia";
        vasia.surname = "Vasin";
        vasia.introduce();

        Human petya = new Human();
        petya.age = 27;
        petya.name = "Petya";
        petya.surname = "Petin";
        petya.introduce();

        // я хочу, чтоб объектт, получал все характеристики в момент создания и их нельзя было менять по ходу
        // например нельзя vasia.name = "Vasilisa"; vasia.introduce(); нужен конструктор со словом private
        vasia.name = "Vas"; - не работает, после добавления  private
        */

        // конструктор это метод, который помогает инициальзировать объкт с схарактеристиками
        Human vasia = new Human("Vasia", "Vasin", 20);
        vasia.introduce();
        System.out.println(vasia.getName());

        Human petya = new Human("Petya", "Petin", 22);
        petya.introduce();

        Human mariIvanova = new Human("Maria", "Ivanova",60);
        System.out.println(petya.getSurname());

        System.out.println(Human.getHumanNumber()); // вызвать статический метод через "Human."
        System.out.println(petya.getAge());
        System.out.println(Human.getAverageAge());
        petya.die();

        System.out.println(Human.getHumanNumber());
        System.out.println(Human.getAverageAge());

        petya.introduce();
        // модификаторы доступа - для полей и методов класса
        // 1. public - доступ отовсюду
        // 2. private - доступ только из методов того же класса
        // 3. default / package-private - доступ по умолчанию (без модификатора), только из классов того же пакета
        // 4. protected - доступ из наследников класса, либо из того же пакета

        // модификаторы доступов классов
        // public - доступны отовсюду
        // default - доступ только для того же пакета

    }
}
