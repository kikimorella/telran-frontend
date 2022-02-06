package de.telran.d220202;

public class image {
    public static void main(String[] args) {
        /*
         ****
         ****
         ****
         ****

         */
        // System.out.println("*"); *N
        printStars(5);
    }

    public static void printStars(int n) {

        for (int j = 0; j < n; j++) {

            for (int i = 0; i < n; i++) {
                if (j == 0 || j == n - 1) {
                    System.out.print("* ");
                } else {
                    if (i == 0 || i == n - 1) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }
}
