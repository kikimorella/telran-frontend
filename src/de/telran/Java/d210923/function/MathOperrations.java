package de.telran.d210923.function;

public class MathOperrations {
    public static void main(String[] args) {
        concatenation();
        plus();
        minus();
        multiply();
        declaration();
    }

    public static void concatenation() {
        System.out.println("Слово Один" + " " + "Слово Два");
        System.out.println("Слово Один " + " Слово Два");
    }

    public static void plus() {
        int a, b, c;
        a = 6;
        b = 7;
        c = a+ b;
        System.out.println(c);
        c = c + 1;
        c += 2;             // короткая запись увеличить с на 2
        c++;                // короткая запись с=с+1, команда (postincrement) сначала выведи, потом прибавь 1
        ++c;                // короткая запись с=с+1, команда (preincrement) сначала прибавь 1, потом выведи
        System.out.println(c);

        int x = 4, y = 6;

        System.out.println(++x); // outputs 5
        System.out.println(x); // outputs 5

        System.out.println(y++); // outputs 6
        System.out.println(y); // outputs 7
    }
    public static void minus() {
        int a, b, c;
        a = 10;
        b = 20;
        c = a-b;
        c = c - 1;
        c--;
        --c;        // cинтаксический сахар
        c=1;
        System.out.println(c);
        // = Знак присваивания
        // == знак равно, равняется
    }
    public static void multiply() {
        int a, b, c;
        a = 2;
        b = 3;
        c = a * b;
        c = c * 2;
        c *= 2;
        System.out.println(c);
    }
    public static void declaration(){
        int b = 48;
        int a;
        a = 45;

        /*
        a;
        int a;
        a = 45
        */

        // 1. Объявнение переменной (Definition)
        // 2. Определение переменной (тип) (Declaration)
        // 3. Присваивание значения (Initialisation)
}
}
