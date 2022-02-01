package com.publicis.sample;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        double result = 0.0;

        System.out.println("Enter first number:");
        double a = sc.nextDouble();

        System.out.println("Enter second number:");
        double b = sc.nextDouble();

        System.out.print("Enter any operator (+, -, *, /): ");
        char option = sc.next().charAt(0);

        try {
            switch (option) {
                case '+':
                    result = addition(a, b);
                    break;

                case '-':
                    result = substraction(a, b);
                    break;

                case '*':
                    result = multiplication(a, b);
                    break;

                case '/':
                    result = division(a, b);
                    break;

                default:
                    System.out.println("Wrong Choice.");
                    return;
            }

            System.out.println("The result for " + option + "is :" + result);
        } catch (Exception e) {
            System.out.println("Error occured:" + e.getMessage());
        }

    }

    private static double division(double a, double b) {
        return a/b;
    }

    private static double multiplication(double a, double b) {
        return a * b;
    }

    private static double substraction(double a, double b) {
        return a - b;
    }

    private static double addition(double a, double b) {
        return a + b;
    }
}
