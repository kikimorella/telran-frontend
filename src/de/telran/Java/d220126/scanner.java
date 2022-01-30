package de.telran.d220126;

import java.util.Scanner;

public class scanner {

    public static void main(String[] args) {
        int num1;
        int num2;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Input the first number:");
            num1 = scanner.nextInt();
            System.out.println("Input the second number:");
            num2 = scanner.nextInt();
        } while ((num1 != 0 && num2 != 0 && num1 % num2 != 0));
        //while(num1%num2!=0 77 num1!=0 && num2!=0); // not correct!!!
        if (num1 != 0 && num2 != 0) {
            System.out.println(num1 + " is divisible by " + num2);
        }
    }
}
