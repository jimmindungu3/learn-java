package com.james;

import java.util.Arrays;
import java.util.OptionalInt;

// ===============================
// PART 1: Basic Java Fundamentals
// ===============================

// EXERCISE 1: VARIABLES AND DATA TYPES
public class StudentInfo {
    public static void main(String[] args) {
        String studentName = "James Ndungu";
        int age = 31;
        double heightInMeters = 1.56;
        boolean isEnrolled = true;
        char grade = 'A';

        System.out.println("Name: " + studentName);
        System.out.println("Age: " + age);
        System.out.println("Height: " + heightInMeters + " meters");
        System.out.println("Enrolled: " + isEnrolled);
        System.out.println("Grade: " + grade);
    }
}

// EXERCISE 2: OPERATORS AND MATH
class OperatorsAndMath {
    public static void operators(int num1, int num2) {
        System.out.println("Sum: " + (num1 + num2));
        System.out.println("Difference: " + (num1 - num2));
        System.out.println("Product: " + (num1 * num2));
        System.out.println("Quotient: " + (num2 != 0 ? (num1 / num2) : "undefined"));
        System.out.println("Remainder: " + (num2 != 0 ? (num1 % num2) : "undefined"));

        System.out.println(num1 > num2 ? num1 + " is greater" : (num1 == num2 ? "Equal" : num2 + " is greater"));
        System.out.println("Max: " + Math.max(num1, num2));
        System.out.println("Min: " + Math.min(num1, num2));
        System.out.println("Sqrt of " + num1 + ": " + Math.sqrt(num1));
    }
}

// EXERCISE 3: TYPE CASTING
class TypeCasting {
    public static void casting() {
        int myAge = 31;
        double ageDouble = myAge; // Implicit
        double pi = 3.142;
        int intPI = (int) pi; // Explicit
        char fromNum = (char) 65;
        String numStr = "123";
        int fromString = Integer.parseInt(numStr);

        System.out.println("Age double: " + ageDouble);
        System.out.println("Int PI: " + intPI);
        System.out.println("Char from 65: " + fromNum);
        System.out.println("Parsed integer: " + fromString);
    }
}

// EXERCISE 4: STRINGS
class StringMethods {
    public static void stringMethods(String fullName) {
        System.out.println("Upper: " + fullName.toUpperCase());
        System.out.println("Lower: " + fullName.toLowerCase());
        System.out.println("Length: " + fullName.length());
        System.out.println("First name: " + fullName.split(" ")[0]);
        System.out.println("Contains 'Java': " + fullName.contains("Java"));
    }
}

// ========================
// PART 2: CONTROL FLOW
// ========================

// EXERCISE 5: IF-ELSE STATEMENTS
class ControlFlow {
    public static void controlFlow(int score) {
        if (score < 0 || score > 100) {
            System.out.println("Invalid score");
            return;
        }

        char grade;
        if (score >= 90) grade = 'A';
        else if (score >= 80) grade = 'B';
        else if (score >= 70) grade = 'C';
        else if (score >= 60) grade = 'D';
        else grade = 'F';

        System.out.println("Grade: " + grade);
        if (score >= 60) System.out.println("Hooray! You passed!");
    }
}

// EXERCISE 6: SWITCH STATEMENT
class Calc {
    public static double calculator(int num1, int num2, char operator) {
        return switch (operator) {
            case '+' -> num1 + num2;
            case '-' -> num1 - num2;
            case '*' -> num1 * num2;
            case '/' -> num2 != 0 ? (double) num1 / num2 : Double.NaN;
            default -> {
                System.out.println("Invalid operator");
                yield -1;
            }
        };
    }
}

// EXERCISE 7a: WHILE LOOP
class WhileLoop {
    public static void whileLoop() {
        int i = 2;
        while (i <= 20) {
            System.out.println(i);
            i += 2;
        }
    }
}

// EXERCISE 7b: FOR LOOP
class ForLoop {
    public static void forLoop(int num) {
        for (int i = 1; i <= 12; i++) {
            System.out.println(i + " * " + num + " = " + (i * num));
        }
    }
}

// EXERCISE 7c: NESTED LOOPS
class NestedLoops {
    public static void printTriangle(int height) {
        for (int i = 1; i <= height; i++) {
            System.out.println("*".repeat(i));
        }
    }
}

// ========================
// PART 3: ARRAYS
// ========================

// EXERCISE 8: ARRAY BASICS
class ArrayOfIntegers {
    public static void arrayOfInts() {
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = (int) (Math.random() * 100 + 1);

        double average = Arrays.stream(numbers).average().orElse(0);
        long aboveAvgCount = Arrays.stream(numbers).filter(n -> n > average).count();

        System.out.println("Numbers: " + Arrays.toString(numbers));
        System.out.println("Max: " + Arrays.stream(numbers).max().getAsInt());
        System.out.println("Min: " + Arrays.stream(numbers).min().getAsInt());
        System.out.println("Average: " + average);
        System.out.println("Above average count: " + aboveAvgCount);
    }
}

// EXERCISE 9: ARRAY METHODS
class ArrayMethods {
    int[] numbers = {1, 2, 3, 4, 5, 6, 7};

    public void printArray() {
        System.out.println("Array: " + Arrays.toString(numbers));
    }

    public int[] reversedArray(int[] arr) {
        int[] rev = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            rev[i] = arr[arr.length - 1 - i];
        }
        return rev;
    }

    public int findIndexOfElement(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == target) return i;
        return -1;
    }
}

// ========================
// PART 4: METHODS
// ========================

// EXERCISE 10: METHOD BASICS
class MathHelper {
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static int getFactorial(int number) {
        return (number <= 1) ? 1 : number * getFactorial(number - 1);
    }

    public static int power(int base, int exp) {
        return (int) Math.pow(base, exp);
    }

    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++)
            if (number % i == 0) return false;
        return true;
    }
}

// EXERCISE 11: METHOD OVERLOADING
class Calculator {
    public static int add(int a, int b) { return a + b; }
    public static double add(double a, double b) { return a + b; }
    public static int add(int a, int b, int c) { return a + b + c; }
    public static String add(String a, String b) { return a + b; }
}

// ========================
// PART 5: OOP
// ========================

// EXERCISE 12: CLASSES AND OBJECTS
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
        if (amount > 0) balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) balance -= amount;
        else System.out.println("Insufficient funds or invalid amount for " + ownerName);
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
        deposit(getBalance() * interestRate);
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
