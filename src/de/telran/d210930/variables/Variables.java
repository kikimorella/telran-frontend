package de.telran.d210930.variables;

public class Variables {

    public static void main(String[] args) {
        int a ; // declaration
        a = 0; // initialization

        System.out.println(a + " - a"); // команда вывода значения на экран

        int b = 5;
        b = 90;

        a = -10;
        System.out.println(a + " - a");
        System.out.println(b + " - b"); // распечатывается текущее значение
        System.out.println( );

        // (10) 1_2_3 ... 7_8__9__10_11
        // (8)  1_2_3 ... 7_10_11_12_13
        // 10(8)*1+1=9

        // 1953=1000*1+100*9+10*5+3=10^3*1+10^2*9+10^1*5+10^0*3 - десятичная система исчисления
        // 456(8)=4*100(8)+5*10(8)+6=4*8^2+5*8+6=302(10) - восьмиричная система исчисления
        // 302=8^3(512>302)*0+8^2(64)*4+8*5(40)+6

        int nummer = 2*7*7*7+5*7*7+3*7+1; //2531(7)
        System.out.println(nummer + " - семиричная система");
        // 953 = 7*136+1
        // 136 = 7*19+3
        // 19 = 7*2+5
        // 2 = 7*0+2
        // => 2531 искомое число
        System.out.println( );
        // byte (1 byte), min = -2^7, max = 2^7-1 это означает 2^7+2^7-1+1=2*2^7=2^8=256 вариантов
        // short (2 bytes), min = -2^15, max 2^15-1, т.е. от -32768 до 32767
        // int (4 bytes), min = -2^31, max 2^31-1, т.е. от -2.147.483.648 до 2.147.483.647
        // long (8 bytes), min = -2^63, max 2^63-1,т.е. от -9223372036854775808 до 9223372036854775807

        byte byte1 = 7;
        short short1 = 239;
        int someInt = short1 * byte1; // всё что меньше чем int, после арифметических операций переводится в int
        int anotherInt = byte1 + byte1; // не получится написать short short1 = byte1 + byte1;
                                        // не получится написать byte byteInt = byte1 + byte1;
                                        // int maxInt = 2^31 -1; уйдет в минимальное значение
                                        // int something = maxInt+1
        long long1 = 400;
        long long2 = long1 + someInt;
        int integer = 200 + 300;

        byte maxByte = 127; // просто отсекаются неиспользуемые биты
        int maxBytePlus1 = maxByte+1;
        System.out.println(maxBytePlus1);

        System.out.println(Integer.MAX_VALUE);

        short maxByteInShort = 128;
        byte downcastedByte = (byte) maxByteInShort;
        System.out.println(downcastedByte);

        byte minByte = -128;
        short minByteInShort = minByte; // просто отсекаются неиспользуемые биты
        System.out.println(minByteInShort);
        System.out.println( );

        // arifmetical oprrations (+ - * /)
        int divison = 10/3; // 3 - функция деления
        // 11/3 -> 3
        // 12/3 -> 4
        System.out.println("divison = 10/3 =" + divison);
        int remainderAfterDivision = 10 % 3; // остаток 1
        System.out.println("divison = 10%3 =" + remainderAfterDivision);
        // 11 % 3 -> 2
        // 12 % 3 -> 0
        // -10%3->-1
        int c = 10;
        c = c+5; // 15
        c += 5; // 20
        c = a + c; // 10
        System.out.println(c + " значения С");
        c *=10; // 100
        System.out.println(c);
        c++; // c = c + 1 // c += 1
        ++c; // 102
        System.out.println(c);
        c--;
        --c; // 100
        System.out.println(c);
        System.out.println( );
    }
}
