package de.telran.d210927.booleanexample;

public class Square {
    public static void main(String[] args) {
        /*Найти площадь и периметр квадрата со стороной 10*/
        System.out.println(findSquareArea(10));
        System.out.println(findSquareArea(50));
    }

    public static int findSquareArea(int size) {
        return size * size;
    }

    public static int findPerimeterArea(int size) {
        return 4 * size;
    }
}