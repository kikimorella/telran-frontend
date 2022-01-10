package de.telran.d210927.booleanexample;

public class Cube {
    public static void main(String[] args) {
        /*3. Найти площадь и периметр куба со стороной 20*/
        int x = 20;
        System.out.println(findCubeArea(x));
        System.out.println(findCubePerimeter(x));
    }

    public static int findCubeArea(int size) {
        return 6 * size * size;
    }

    public static int findCubePerimeter(int size) {
        return 4 * size * 3;
    }
}