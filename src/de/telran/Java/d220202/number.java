package de.telran.d220202;

public class number {

    public static void main(String args[]) {
        int currentNumber = 1;

        int primesFound = 0;

        while (primesFound < 20000) {
            if (isPrime(currentNumber)) {
                primesFound++;

                System.out.print(currentNumber + " ");

                if (primesFound % 20 == 0) {
                    System.out.println();
                }
            }
            currentNumber++;
        }
    }

    public static boolean isPrime(int elt) {
        if (elt <= 1)
            return false;
        else if (elt <= 3)
            return true;
        else if (elt % 2 == 0 || elt % 3 == 0) // 2, 3
            return false;

        int next = 5;

        while (next * next <= elt) {

            if (elt % next == 0 || elt % (next + 2) == 0) // 5, 7 -> 11, 13 -> 17, 19
                return false;

            next = next + 6; // 11 -> 17
        }
        return true;
    }
}

