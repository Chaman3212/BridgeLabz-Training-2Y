package Assignment7;

public class Hierarchical {
    // Hierarchical Inheritance Example
    class BankAccount {
        String accountNumber;
        double balance;

        BankAccount(String accountNumber, double balance) {
            this.accountNumber = accountNumber;
            this.balance = balance;
        }
    }

    class SavingsAccount extends BankAccount {
        double interestRate;

        SavingsAccount(String accNo, double bal, double rate) {
            super(accNo, bal);
            this.interestRate = rate;
        }

        void displayAccountType() {
            System.out.println("Savings Account | Interest Rate: " + interestRate + "%");
        }
    }

    class CheckingAccount extends BankAccount {
        double withdrawalLimit;

        CheckingAccount(String accNo, double bal, double limit) {
            super(accNo, bal);
            this.withdrawalLimit = limit;
        }

        void displayAccountType() {
            System.out.println("Checking Account | Withdrawal Limit: ₹" + withdrawalLimit);
        }
    }

    public class HierarchicalInheritanceDemo {
        public static void main(String[] args) {
            SavingsAccount s = new SavingsAccount("S123", 50000, 4.5);
            CheckingAccount c = new CheckingAccount("C321", 20000, 10000);

            s.displayAccountType();
            c.displayAccountType();
        }
    }

}
