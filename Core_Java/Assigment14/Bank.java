package Assigment14;

class BankAccount {
    private static String bankName = "State Bank of India";
    private final int accountNumber;
    private String accountHolderName;
    private static int totalAccounts = 0;

    public BankAccount(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }

    public static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

    public void displayDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank: " + bankName);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
        }
    }

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Rohit", 12345);
        acc1.displayDetails();
        BankAccount.getTotalAccounts();
    }
}

