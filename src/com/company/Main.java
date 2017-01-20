package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type in a number to check if it's a fibonacci number.");
        while (true) {
            if (input.hasNextInt()) {
                break;
            }
            else {
                System.out.println("Please only use numbers.");
                input.next();
            }
        }
        int y = input.nextInt();
        Fibonacci z = new Fibonacci(y);
        if (z.method1()) {
            System.out.println("True, that is a fibonacci number.\nThe numbers leading up to it are " +
            z.method2());
        }
        else
            System.out.println("False, that is not a fibonacci number.");
    }
}
