/* # Java Comprehensive Practical Test

## Instructions
- Complete all exercises in order
- Test your code to make sure it runs correctly
- Pay attention to proper naming conventions and code structure
- Time yourself: Aim to complete this in 2-3 hours

---

## Part 1: Basic Java Fundamentals (20 points)

### Exercise 1: Variables and Data Types (5 points)
Create a class called `StudentInfo` that stores and displays the following information:
- Student name (String)
- Age (int)
- Height in meters (double)
- Is enrolled (boolean)
- Grade letter (char)

Print all information in a formatted way.

### Exercise 2: Operators and Math (5 points)
Write a program that:
- Takes two numbers as input
- Performs all arithmetic operations (+, -, *, /, %)
- Uses comparison operators to check if first number is greater than second
- Uses Math class to find the maximum, minimum, and square root of the first number

### Exercise 3: Type Casting (5 points)
Demonstrate both implicit and explicit casting:
- Convert an int to double (implicit)
- Convert a double to int (explicit)
- Show what happens when you cast 65 to char
- Convert a string "123" to an integer

### Exercise 4: Strings (5 points)
Create a program that:
- Takes a full name as input
- Converts it to uppercase and lowercase
- Finds the length of the name
- Extracts the first name (before the space)
- Checks if the name contains "Java"

---

## Part 2: Control Flow (25 points)

### Exercise 5: If-Else Statements (8 points)
Write a program that determines a student's grade based on their score:
- 90-100: A
- 80-89: B
- 70-79: C
- 60-69: D
- Below 60: F

Also check if the student passed (score >= 60) and provide encouragement messages.

### Exercise 6: Switch Statement (7 points)
Create a simple calculator using switch statement that:
- Takes two numbers and an operator (+, -, *, /)
- Performs the calculation based on the operator
- Handles division by zero
- Provides error message for invalid operators

### Exercise 7: Loops (10 points)
Write three separate programs:

**a) While Loop:** Print numbers from 1 to 20, but only print even numbers

**b) For Loop:** Create a multiplication table for a given number (1-12)

**c) Nested Loops:** Print this pattern:
```
*
**
***
****
*****
```

---

## Part 3: Arrays (15 points)

### Exercise 8: Array Basics (8 points)
Create a program that:
- Creates an array of 10 integers
- Fills it with random numbers between 1-100
- Finds and prints the largest and smallest numbers
- Calculates and prints the average
- Counts how many numbers are above average

### Exercise 9: Array Methods (7 points)
Write a program with the following methods:
- `printArray(int[] arr)` - prints all elements
- `reverseArray(int[] arr)` - returns a new reversed array
- `findElement(int[] arr, int target)` - returns index of target or -1 if not found

Test all methods with a sample array.

---

## Part 4: Methods (20 points)

### Exercise 10: Method Basics (10 points)
Create a utility class called `MathHelper` with these static methods:
- `isEven(int number)` - returns true if number is even
- `factorial(int n)` - calculates factorial using recursion
- `isPrime(int number)` - checks if a number is prime
- `power(int base, int exponent)` - calculates base^exponent

### Exercise 11: Method Overloading (10 points)
Create a class called `Calculator` with overloaded `add` methods:
- `add(int a, int b)` - adds two integers
- `add(double a, double b)` - adds two doubles
- `add(int a, int b, int c)` - adds three integers
- `add(String a, String b)` - concatenates two strings

Test all overloaded methods.

---

## Part 5: Object-Oriented Programming (20 points)

### Exercise 12: Classes and Objects (20 points)
Create a complete program with the following requirements:

**Create a `BankAccount` class with:**
- Private attributes: `accountNumber` (String), `balance` (double), `ownerName` (String)
- Constructor that takes all three parameters
- Getter and setter methods for all attributes
- `deposit(double amount)` method
- `withdraw(double amount)` method (check for sufficient funds)
- `getAccountInfo()` method that returns formatted account information

**Create a `SavingsAccount` class that extends `BankAccount`:**
- Additional private attribute: `interestRate` (double)
- Constructor that calls parent constructor and sets interest rate
- `calculateInterest()` method that calculates and adds interest to balance
- Override `getAccountInfo()` to include interest rate information

**In your main method:**
- Create 2 regular BankAccount objects
- Create 1 SavingsAccount object
- Perform various operations (deposits, withdrawals, interest calculation)
- Display all account information
- Demonstrate polymorphism by storing different account types in a BankAccount array

---

## Bonus Challenge (Extra Credit - 10 points)

### Exercise 13: Advanced OOP
Create a simple **Library Management System**:

**Book class:**
- Attributes: title, author, ISBN, isAvailable
- Methods: borrowBook(), returnBook(), getBookInfo()

**Library class:**
- Array of Book objects
- Methods: addBook(), findBook(), displayAvailableBooks(), borrowBook(), returnBook()

**Main program:**
- Create a library with several books
- Implement a simple menu system for users to:
  - View available books
  - Borrow a book
  - Return a book
  - Add a new book

---

## Evaluation Criteria

### Code Quality (Check these for each exercise):
- [ ] Code compiles and runs without errors
- [ ] Proper variable naming conventions
- [ ] Appropriate use of access modifiers
- [ ] Good code organization and structure
- [ ] Proper exception handling where needed
- [ ] Clear and helpful comments

### Concept Understanding:
- **Basic Concepts (25%):** Variables, data types, operators, strings
- **Control Flow (25%):** If-else, switch, loops
- **Arrays & Methods (25%):** Array manipulation, method creation and overloading
- **OOP Concepts (25%):** Classes, objects, inheritance, encapsulation, polymorphism

---

## Scoring Guide
- **90-100:** Excellent - All concepts mastered
- **80-89:** Good - Strong understanding, minor gaps
- **70-79:** Satisfactory - Basic understanding, needs practice
- **60-69:** Needs Improvement - Review fundamental concepts
- **Below 60:** Requires Significant Study - Revisit course materials

---

## After Completing the Test

1. **Review your solutions** - Look for areas where you struggled
2. **Test edge cases** - Try unusual inputs to see if your code handles them
3. **Refactor your code** - Can you make it cleaner or more efficient?
4. **Practice the concepts** you found challenging

Good luck with your test! Remember, the goal is to learn and improve your Java programming skills. */

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


