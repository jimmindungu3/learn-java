package com.james;

import java.util.Scanner;
import java.util.InputMismatchException;

public class TryCatch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            double a = scanner.nextDouble();

            System.out.print("Enter second number: ");
            double b = scanner.nextDouble();

            double quotient = a / b;
            System.out.println("Result: " + quotient);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter numbers.");
        } finally {
            scanner.close();
            checkAge(12);
            System.out.println("Program finished.");
        }
    }

    public static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Access Denied! Below legal age!");
        } else {
            System.out.println("Access Granted");
        }
    }
}
