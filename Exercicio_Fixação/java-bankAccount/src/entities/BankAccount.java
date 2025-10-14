package entities;

public class BankAccount {

    private int number;
    private String holder;
    private double balance;

    // construtor com dois argumentos (number, holder).
    public BankAccount(int number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    // coonstrutor com três argumentos (number, holder, initialDeposit).
    public BankAccount(int number, String holder, double initialDeposit) {
        this.number = number;
        this.holder = holder;
        deposit(initialDeposit);
    }

    public int getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        balance -= amount + 5.0;
    }

    public String toString(){
        return "BankAccount "
                + number
                + ", Holder: "
                + holder
                + ", Balance: $ "
                + String.format("%.2f", balance);
    }
}

