package _5_exceptions._1_;

import java.util.ArrayList;
import java.util.List;

public class Bank {
  private List<Account> accounts;

  public Bank() {
    accounts = new ArrayList<>();
  }

  public void addAccount(Account account) {
    accounts.add(account);
  }

  public void deposit(int accountId, double amount) {
    Account account = findAccount(accountId);
    if (account == null) {
      throw new InvalidAccountException("Account not found");
    }
    account.deposit(amount);
  }

  public void withdraw(int accountId, double amount) throws InsufficientBalanceException {
    Account account = findAccount(accountId);
    if (account == null) {
      throw new InvalidAccountException("Account not found");
    }
    account.withdraw(amount);
  }

  private Account findAccount(int accountId) {
    for (Account account : accounts) {
      if (account.getAccountId() == accountId) {
        return account;
      }
    }
    return null;
  }
}

