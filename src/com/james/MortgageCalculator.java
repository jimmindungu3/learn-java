package com.james;

import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter principal: ");
        long principal = Long.parseLong(scanner.nextLine());

        System.out.print("Enter annual interest rate (e.g., 5 for 5%): ");
        float annualRate = Float.parseFloat(scanner.nextLine());
        float monthlyRate = annualRate / 100 / 12;

        System.out.print("Enter loan term in years: ");
        float years = Float.parseFloat(scanner.nextLine());
        float numberOfPayments = years * 12;

        float monthlyPayment = (float) (
                principal * (monthlyRate * Math.pow(1 + monthlyRate, numberOfPayments)) /
                        (Math.pow(1 + monthlyRate, numberOfPayments) - 1)
        );

        System.out.printf("Monthly payment: %.2f%n", monthlyPayment);
    }
}
