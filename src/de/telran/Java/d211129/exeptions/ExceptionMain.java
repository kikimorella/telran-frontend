package de.telran.d211129.exeptions;

public class ExceptionMain {
    /*
    Исключения - это непредвиденные ситуации или ошибки, возникающие в процессе исполнения программы.
    Исключение может быть брошено (throw) либо JVW, либо запрограммировано.
    Исключения в java представляют собой объекты классов наследующих класс Throwable, и в момент возникновения
    исключения пробивают программный стек до тех пор, пока не будет обработаны (если исключения нигде не ловятся
    и не обрабатываются, программа (поток в программе) завершается)
    программный стек - место где стопкой лежат вызванные данные
    _____________  intDiv
    _____________  main

    Throwable - Error (Ошибки, после возникновения которых исполнение программы невозможно)

    Throwable - Exception (исключения) - Checked Exception (обязательно отлавливать и обрабатывать)
    (исключения, которые легально могут возникать и не нарушают контракт. Допустим, считываются данные, установлено
    соединение с другим компьютером, соединение нарушено и при возникновении помех, нужно что-то сделать,
    чтоб сохранить данные)

    Throwable - Exception - RuntimeException - Unchecked Exception (не обязательно отлавливать и обрабатывать)
    (применяются, когда пишем контракт к методу, если он нарушается, то выскакивает исключение. Мы подразумеваем,
    что программист контракт не будет нарушать и не нарвется на исключение)
    */
    public static void main(String[] args) {
        int a = 6;
        int b = 2; // мы пробовали 0 и 3
/*
        try { // пытается исполнить код
            int res = intDiv2Wraper(a, b);
            System.out.println(res);
            System.out.println("After division");
        } catch (CustomArithmeticException e) { // обработка исключения, которые могли возникнуть при исполнении кода
            System.out.println("Inside catch Arithmetic Exception"); // попадем только в один из блоков catch
        } catch (RuntimeException e) { // обработка потомков (менее конкретного исключения) указывается после
            System.out.println("Inside catch");
        } finally { // срабатывает всегда было или нет исключение. Бывает, что finally есть, а catch - нет.
            // Такое исключение ловят в другом методе
            System.out.println("inside finally");
        }
*/
        try {
            trickFunction();
        } catch (ARuntimeException | BRuntimeException e) {
            System.out.println("catch ARuntimeException or BRuntimeException of tricky function");
        }

    }

    static void trickFunction() {
/*
        try {
            int res = intDiv2Wrapper(a, b);
            System.out.println(res);
            System.out.println("After division");
        } catch (CustomArithmeticException e) {
            System.out.println("inside catch Arithmetic exception");
        } catch (RuntimeException e) {
            System.out.println("inside catch");
 */
        try {
            trowsARuntimeException();
        } catch (ARuntimeException e) {
            System.out.println("Catches a runtime");
            trowsBRuntimeException();
        } finally { // имеет приоритет
            System.out.println("inside finally");
            trowsARuntimeException();
        }
    }

    static void trowsARuntimeException() {
        System.out.println("Inside trowsARuntimeException");
        throw new ARuntimeException();
    }

    static void trowsBRuntimeException() {
        System.out.println("Inside trowsBRuntimeException");
        throw new BRuntimeException();
    }

    /**
     * The method returns the result of int division a and b
     *
     * @param a
     * @param b
     * @return
     */
    static int intDiv(int a, int b) {
        //return a / b;   // Исключения in thread "main" java.lang.ArithmeticException: / by zero
        // Исключения.intDiv(Исключения.java:26)
        // Исключения.main(Исключения.java:15)
        int res = a / b; // стек пробит и программа завершается

        return res;
    }

    /**
     * The method divides a over b
     *
     * @param a
     * @param b
     * @return CustomArithmeticException if b equals 0 //за этим следит программист
     */
    static int intDiv2(int a, int b) {
        if (b == 0)
            throw new CustomArithmeticException();

        int res = a / b;

        return res;
    }

    static int intDiv2Wraper(int a, int b) {
        int res = intDiv2(a, b);
        return res;
    }
}
