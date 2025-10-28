// BankingSystem.java
import java.util.*;

abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    protected double balance;

    public BankAccount(String acc,String holder,double bal){
        this.accountNumber = acc; this.holderName = holder; this.balance = bal;
    }
    public String getAccountNumber(){ return accountNumber; }
    public String getHolderName(){ return holderName; }
    public double getBalance(){ return balance; }

    public void deposit(double amt){ if(amt>0) balance += amt; }
    public boolean withdraw(double amt){ if(amt>0 && balance>=amt){ balance -= amt; return true; } return false; }
    public abstract double calculateInterest();
}

interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}

class SavingsAccount extends BankAccount implements Loanable {
    public SavingsAccount(String acc,String holder,double bal){ super(acc,holder,bal); }
    public double calculateInterest(){ return balance * 0.04; } // 4%
    public void applyForLoan(double amount){ System.out.println("Savings: loan applied " + amount); }
    public boolean calculateLoanEligibility(){ return balance >= 50000; }
}

class CurrentAccount extends BankAccount {
    public CurrentAccount(String acc,String holder,double bal){ super(acc,holder,bal); }
    public double calculateInterest(){ return balance * 0.02; } // 2%
}

public class BankingSystem {
    public static void main(String[] args){
        List<BankAccount> accounts = Arrays.asList(
                new SavingsAccount("S001","Ravi",60000),
                new CurrentAccount("C001","Maya",20000)
        );
        for(BankAccount a: accounts){
            System.out.println(a.getHolderName() + " interest: " + a.calculateInterest());
            if(a instanceof Loanable){
                Loanable l = (Loanable)a;
                System.out.println("Loan eligible? " + l.calculateLoanEligibility());
            }
        }
    }
}
