package de.telran.d210927.booleanexample;

public class MyLovelyByte {
    public static void main(String[] args) {
        helloByte();
        helloByte2();
    }
    public static void helloByte(){
        //int, long, byte, short
        byte b1 = 7;
        byte b2 = 120;
        byte b3 = (byte) (b1 + b2);
        System.out.println(b3);
    }
    public static void helloByte2() {
        byte b1 = 9;
        byte b2 = 120;
        byte b3 = (byte) (b1 + b2);
        System.out.println(b3);
    }
}
