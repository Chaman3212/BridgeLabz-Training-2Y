package Assigment13;

package com.bridgelabz.oops.levelone;

public class BankAccount {
    private static String bankName = "State Bank of India";
    private static int totalAccounts = 0;

    private final String accountNumber;
    private String accountHolderName;
    private double balance;

    // Constructor using 'this' keyword
    public BankAccount(String accountHolderName, String accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        totalAccounts++;
    }

    // Display method with instanceof check
    public void displayDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Balance: ₹" + balance);
        }
    }

    // Static method
    public static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Ravi Kumar", "SBIN12345", 20000);
        BankAccount acc2 = new BankAccount("Neha Sharma", "SBIN67890", 50000);

        acc1.displayDetails();
        System.out.println();
        acc2.displayDetails();
        BankAccount.getTotalAccounts();
    }
}

