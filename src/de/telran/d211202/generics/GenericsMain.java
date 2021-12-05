package de.telran.d211202.generics;

import java.util.ArrayList;
import java.util.List;

/*
Дженерики (обобщения) — это особые средства языка Java для реализации обобщённого программирования: особого подхода к
описанию данных и алгоритмов, позволяющего работать с различными типами данных без изменения их описания. Механизм в
java, позволяющий одинаково работать с различными типами данных, не зная заранее какой тип данных будет использован.
Позволяют избежать проблем приведения типов путём перекладывания ответственности за это с runtime (время исполнения
программы) на шаг компиляции.
*/
public class GenericsMain {
    public static void main(String[] args) {
//        String str = returnItself("Hello");
        String str = (String) returnItself("Hello");
        System.out.println(str);

//        String falseString = (String) returnItself(Integer.valueOf(1));
//        String falseString = (String) returnItself(1); // throws ClassCastException

        str = returnItselfGenerified("Hello");
        System.out.println(str);
//        String falseString = (String) returnItselfGenerified(1); // error while compilation

        GenerifiedClass<String> generified = new GenerifiedClass<>() ;
        // new GenerifiedClass<>() получает знания о том, что такое Т из GenerifiedClass<String>
        // GenerifiedClass generified = new GenerifiedClass() ; // так, Т будет простейшим не конкретным типом Object
        str = generified.returnItselfGenerified("hello");

//        List<Integer> ints = new ArrayList<>(); // List<Integer> - мы теперь можем добавлять только инты
//        List<Double> ints = new ArrayList<>();
        List ints = new ArrayList(); // самый удобный вариант
        ints.add("hello");
        ints.add(25);
        ints.add(1.5);

    }

    static Object returnItself(Object obj) {
        return obj;
    }

    static <T> T returnItselfGenerified(T obj) { // <> - генерифицируем метод
        return obj;
        } // генерифицируем функцию. Т - будет определено в момент написания кода
}

class GenerifiedClass<T> { // плавающий класс
    public T returnItselfGenerified(T obj){ // NOT static
        return obj;
    }
}

class OurInteger {
    private final int value;

    public OurInteger(int value) {
        this.value = value;
    }

    public static OurInteger valueOf(int number) {
        return new OurInteger(number);
    }

    public int getValue() {
        return value;
    }
}