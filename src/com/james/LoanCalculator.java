package com.james;

import java.util.Scanner;

public class LoanCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter principle: ");
        long principle = Long.parseLong(scanner.nextLine());

        System.out.print("Enter interest rate: ");
        float rate = Float.parseFloat(scanner.nextLine());

        System.out.print("Enter period in years: ");
        float time = Float.parseFloat(scanner.nextLine());

        float monthlyPayment = (principle * rate/100 * time) / (time * 12);

        System.out.println("Monthly payments: " + monthlyPayment);
    }
}
