package com.james;
import java.util.Scanner;
public class Zoezi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int sum = 0;
        while (number != 0) {
            sum = sum + (number % 10);
            number = number / 10;
        }
        System.out.println("Sum of digits => " + sum);
    }
}
