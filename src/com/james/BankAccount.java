package com.james;

public class BankAccount {
    String accountName;
    String accountNumber;
    double balance;

    BankAccount(String accountName, String accountNumber) {
        this.balance = 0;
        this.accountName = accountName;
        this.accountNumber = accountNumber;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    int minimumBalance = 500;

    SavingsAccount(String accountName, String accountNumber) {
        super(accountName, accountNumber);
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount < minimumBalance) {
            System.out.println("Insufficient balance");
        } else {
            balance -= amount;
        }
    }
}

class FixedDepositAccount extends BankAccount {
    boolean isMature = false;

    FixedDepositAccount(String accountName, String accountNumber) {
        super(accountName, accountNumber);
    }

    @Override
    public void withdraw(double amount) {
        if (isMature) {
            balance -= amount;
        } else {
            System.out.println("Your maturity date is not due");
        }
    }
}

class Main {
    public static void main(String[] args) {
        // Create accounts using polymorphism (BankAccount reference, subclass objects)
        BankAccount general = new BankAccount("James", "J001");
        BankAccount savings = new SavingsAccount("Nganga", "N001");  // Has a minimum balance rule
        BankAccount fixed = new FixedDepositAccount("Ndungu", "N002"); // Withdrawal only after maturity

        // Deposit money into each account
        general.deposit(200);      // General account: balance becomes 200
        savings.deposit(1000);     // Savings account: balance becomes 1000
        fixed.deposit(2000);       // Fixed deposit account: balance becomes 2000

        // Withdraw from each account
        general.withdraw(100);     // Allowed: balance reduces to 100
        savings.withdraw(800);     // Not allowed: would go below minimumBalance (500), so balance stays 1000
        fixed.withdraw(1000);      // Not allowed: isMature is false, so balance stays 2000

        // Display final balances
        System.out.println("General Account Balance: " + general.getBalance());
        System.out.println("Savings Account Balance: " + savings.getBalance());
        System.out.println("Fixed Deposit Account Balance: " + fixed.getBalance());
    }
}
