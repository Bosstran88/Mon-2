package javaprogram;

public class Bank {
    private double balance;
    private double rate;

    public Bank() {
        this.balance = balance;
        this.rate = rate;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double calculateInterest(){
        double interest = balance*(rate/1200);
        return interest;
    }

    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.setBalance(1000);
        bank.setRate(10);
        System.out.println(bank.calculateInterest());
    }
}
