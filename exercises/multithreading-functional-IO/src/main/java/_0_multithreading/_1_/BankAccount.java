package _0_multithreading._1_;

class BankAccount {

    private double balance;
    private String accountNumber;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // add sync to make it thread safe
    public void deposit(double amount) {
        balance += amount;
    }

    // add sync to make it thread safe
    public void withdraw(double amount) {
        balance -= amount;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
            "balance=" + balance +
            ", accountNumber='" + accountNumber + '\'' +
            '}';
    }
}