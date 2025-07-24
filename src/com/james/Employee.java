package com.james;

/*
Case Study: Employee Tracker

Goal:
- Track individual employee details: name and department.
- Track the total number of employees created using a shared counter.
- Demonstrate use of both static and instance methods/variables.

static => shared across all instances.
instance (no static) => unique to each object
*/

public class Employee {
    static int numberOfEmployees; // Shared by all Employee objects

    // Unique to each employee
    String name;
    String department;

    // Constructor increments the shared count
    Employee(String name, String department) {
        this.name = name;
        this.department = department;
        numberOfEmployees++; // Increases total count for all instances
    }

    // Static method — belongs to the class
    public static void printNumberOfEmployees() {
        // Can access only static members
        System.out.println("Total employees: " + numberOfEmployees);
    }

    // Instance method — called on specific objects
    public void printNameAndDept() {
        // Can access both static and instance members
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
    }

    public static void main(String[] args) {
        // Creating employee objects
        Employee one = new Employee("James", "ICT");
        Employee two = new Employee("Alex", "HR");

        // Call static method using class name (preferred)
        Employee.printNumberOfEmployees();

        // Call instance methods on objects
        one.printNameAndDept();
        two.printNameAndDept();
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////


/*
Case Study: Bank System

Goal:
- Each account has a name, number, and balance.
- Support deposit and withdrawal actions per account.
- Track the total number of accounts created (shared).
- Demonstrate correct use of static vs. instance members.
*/

class Account {
    static int numberOfAccounts; // Shared across all accounts

    // Unique to each account
    String accountName;
    String accountNumber;
    int balance;

    // Constructor initializes instance values and increments shared counter
    Account(String accountName, String accountNumber) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.balance = 0;
        numberOfAccounts++; // Shared count incremented for each account created
    }

    // Instance method — modifies individual account balance
    public void deposit(int amount) {
        balance += amount;
    }

    // Instance method — operates on specific account
    public void withdraw(int amount) {
        if (amount < balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance for account " + accountName);
        }
    }

    // Instance method — prints details of one specific account
    public void printAccountDetails() {
        System.out.println("Account name: " + accountName);
        System.out.println("Account balance: " + balance);
    }

    // Static method — prints total number of accounts created
    public static void printTotalNumberOfAccounts() {
        System.out.println("Total accounts: " + numberOfAccounts);
    }

    public static void main(String[] args) {
        // Create two account objects
        Account first = new Account("James", "1220078091");
        Account second = new Account("Alex", "1220078092");

        // Perform deposit operations
        first.deposit(5000);
        second.deposit(500);

        // Perform withdrawals
        first.withdraw(1000);
        second.withdraw(10000); // Triggers insufficient balance message

        // Print individual account details
        first.printAccountDetails();
        second.printAccountDetails();

        // Call static method to print total number of accounts
        Account.printTotalNumberOfAccounts();
    }
}
