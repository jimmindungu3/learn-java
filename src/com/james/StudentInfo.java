package com.james;

import java.util.Arrays;
import java.util.OptionalInt;

public class StudentInfo {
    public static void main(String[] args) {
        String studentName = "James Ndungu";
        int age = 31;
        double heightInMeters = 1.56;
        boolean isEnrolled = true;
        char grade = 'A';

        System.out.println("My name is " + studentName);
        System.out.println("I am " + age);
        System.out.println("I am " + heightInMeters + "Meters tall");
        System.out.println("My name is " + studentName);
        System.out.println("My enrollment status is " + isEnrolled);
        System.out.println("I am a great student. I always score " + grade + "'s");
    }
}

class OperatorsAndMath {
    public static void operators(int num1, int num2) {
        System.out.println("Sum of " + num1 + "and " + num2 + "is " + (num1 + num2));
        System.out.println("Difference of " + num1 + "and " + num2 + "is " + (num1 - num2));
        System.out.println("Product of " + num1 + "and " + num2 + "is " + num1 * num2);
        System.out.println("Quotient of " + num1 + "and " + num2 + "is " + num1 / num2);
        System.out.println("Remainder of " + num1 + "and " + num2 + "is " + num1 % num2);

        if (num1 > num2) {
            System.out.println(num1 + "is greater than " + num2);;
        } else if (num2 > num1) {
            System.out.println(num2 + "is greater than " + num1);
        } else
            System.out.println("Numbers are equal!");

        System.out.println("The max of " + num1 + "and " + num2 + " is " + Math.max(num1, num2));
        System.out.println("The min of " + num1 + "and " + num2 + " is " + Math.min(num1, num2));
        System.out.println("The square root of " + num1 + " is" + Math.sqrt(num1));
    }
}

class TypeCasting {
    public static void casting () {
        int myAge = 31;
        double PI = 3.142;
        int num = 65;
        String intString = "123";

        double ageDouble = (double) myAge; // castable
        int intPI = (int) PI; // castable
        char castedChar = (char) (num); // castable to A
        // int number = (int) intString; // cannot cast string to integer
    }
}

class StringMethods {
    public static void stringMethods (String fullName) {
        System.out.println(fullName.toUpperCase());
        System.out.println(fullName.toLowerCase());
        System.out.println(fullName.length());
        System.out.println(fullName.split(" ")[0]);
        System.out.println(fullName.contains("Java"));
    }
}

class ControlFlow {
    public static void controlFlow(int score) {
        char grade;

        if (score > 100 || score < 0) {
            System.out.println("Invalid score");
            return;
        } else if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("Grade: " + grade);
        if (score >= 60) {
            System.out.println("Hooray! You passed!");
        }
    }
}

class Calc {
    public static double calculator(int num1, int num2, char operator) {
        if (num2 == 0 && operator == '/') throw new ArithmeticException("Division by zero");

        return switch (operator) {
            case ('+') -> num1 + num2;
            case ('-') -> num1 - num2;
            case ('*') -> num1 * num2;
            case ('/') -> (double) num1 / num2;
            default -> -1;
        };
    }
}

class WhileLoop {
    public static void whileLoop (int num) {
       int i = 2;
       while (i <= 20) {
           System.out.println(i);
           i += 2;
       }
    }
}


class ForLoop {
    public static void forLoop (int num) {
        for (int i = 1; i <= 12; i++) {
            System.out.println(i + " * " + num + " =" + num * i );
        }
    }
}

class NestedLoops {
    public static void printTriangle(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


class ArrayOfIntegers {
    public static void arrayOfInts() {
        int[] numbers = new int[10];

        for (int i = 0; i < 10 ; i++) {
            numbers[i] = (int) (Math.random() * 100 + 1);
        }
         double average = Arrays.stream(numbers).average().getAsDouble();
        System.out.println("Max number: " + Arrays.stream(numbers).max());
        System.out.println("Min number: " + Arrays.stream(numbers).min());
        System.out.println("Numbers average: " + Arrays.stream(numbers).average());

        int aboveAverageCount = 0;
        for (int num : numbers) {
            if (num > average) aboveAverageCount++;
        }
    }
}

// EXERCISE 9: ARRAY METHODS
class ArrayMethods {
    int[] numbers = {1, 2, 3, 4, 5, 6, 7};

    public void printArray() {
        System.out.println(Arrays.toString(numbers));
    }

    public int[] reversedArray(int[] input) {
        int[] reversed = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            reversed[i] = input[input.length - 1 - i];
        }
        return reversed;
    }

    public OptionalInt findIndexOfElement(int number) {
        return Arrays.stream(numbers).findAny();
    }
}

class MathHelper {
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static int getFactorial(int number) {
        if (number == 0 || number == 1) {
            return 1;
        }

        return number * getFactorial(number - 1);
    }

    public static int power(int base, int exponent) {
        return (int) Math.pow(base, exponent);
    }

    public static boolean isPrime(int number) {
        if (number <= 1) return false;

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }

        return true;
    }
}

class Calculator {

    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static String add(String a, String b) {
        return a + b;
    }
}


class BankAccount {
    private String accountNumber;
    private double balance;
    private String ownerName;

    public BankAccount(String accountNumber, double balance, String ownerName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.ownerName = ownerName;
    }

    public String getAccountNumber() { return accountNumber; }
    public double getBalance() { return balance; }
    public String getOwnerName() { return ownerName; }

    public void setAccountNumber(String accountNumber) { this.accountNumber = accountNumber; }
    public void setBalance(double balance) { this.balance = balance; }
    public void setOwnerName(String ownerName) { this.ownerName = ownerName; }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds or invalid amount for " + ownerName);
        }
    }

    public String getAccountInfo() {
        return "Account: " + accountNumber + ", Owner: " + ownerName + ", Balance: " + balance;
    }
}

class SavingsAccount extends BankAccount {
    private final double interestRate;

    public SavingsAccount(String accountNumber, double balance, String ownerName, double interestRate) {
        super(accountNumber, balance, ownerName);
        this.interestRate = interestRate;
    }

    public void calculateInterest() {
        double interest = getBalance() * interestRate;
        deposit(interest);
    }

    @Override
    public String getAccountInfo() {
        return super.getAccountInfo() + ", Interest Rate: " + (interestRate * 100) + "%";
    }
}

class BankDemo {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("001", 5000, "Alice");
        BankAccount acc2 = new BankAccount("002", 3000, "Bob");

        SavingsAccount sav1 = new SavingsAccount("003", 7000, "Carol", 0.05);

        acc1.deposit(1000);
        acc2.withdraw(500);
        sav1.calculateInterest();
        sav1.withdraw(1000);

        BankAccount[] accounts = {acc1, acc2, sav1};

        for (BankAccount acc : accounts) {
            System.out.println(acc.getAccountInfo());
        }
    }
}






















