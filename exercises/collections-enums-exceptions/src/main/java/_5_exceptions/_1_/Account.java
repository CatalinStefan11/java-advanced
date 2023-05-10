package _5_exceptions._1_;

public class Account {
  private int accountId;
  private String accountName;
  private double balance;

  public Account(int accountId, String accountName, double balance) {
    this.accountId = accountId;
    this.accountName = accountName;
    this.balance = balance;
  }

  public int getAccountId() {
    return accountId;
  }

  public String getAccountName() {
    return accountName;
  }

  public double getBalance() {
    return balance;
  }

  public void deposit(double amount) {
    if(amount < 0){
      throw new IllegalArgumentException("Deposit amount cannot be negative");
    }
    balance += amount;
  }

  public void withdraw(double amount) throws InsufficientBalanceException {
    if(amount < 0){
      throw new IllegalArgumentException("Withdraw amount cannot be negative");
    }
    if (amount > balance) {
      throw new InsufficientBalanceException("Insufficient balance");
    }
    balance -= amount;
  }
}
