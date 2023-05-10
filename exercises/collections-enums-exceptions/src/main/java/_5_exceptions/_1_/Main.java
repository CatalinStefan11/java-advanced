package _5_exceptions._1_;

/*
    Create an Account class with tho following:
    - iban (String): a private field representing the unique identifier of the account.
    - accountName (String): a private field representing the name of the account.
    - balance (double): a private field representing the current balance in the account.
    - a constructor that initialize all the fields
    - getIban(): a method that returns the account IBAN.
    - getAccountName(): a method that returns the account name.
    - getBalance(): a method that returns the current balance in the account.
    - deposit(double amount): a method that takes in a double representing the amount to be deposited, 
              and adds it to the balance. Throws an IllegalArgumentException if the amount is negative.
    - withdraw(double amount): a method that takes in a double representing the amount to be withdrawn,and subtracts it 
              from the balance. Throws an IllegalArgumentException if the amount is negative, and an 
              InsufficientBalanceException if the balance is insufficient.
              
              
    Create a Bank class -> A class representing a bank that can store and manage multiple accounts.
    - the class contains a List of Account objects.
    - has a constructor that initializes an empty ArrayList for accounts.
    - addAccount(Account account): a method that takes in an Account object and adds it to the list of accounts.
    - deposit(int accountId, double amount): a method that takes in an int representing the account ID and a double representing the amount to deposit, finds the Account object with the given ID and deposits the amount to the account. If the account is not found, it throws an InvalidAccountException.
    - withdraw(int accountId, double amount): a method that takes in an int representing the account ID and a double representing the amount to withdraw, finds the Account object with the given ID and withdraws the amount from the account. If the account is not found, it throws an InvalidAccountException. If the balance is insufficient, it throws an InsufficientBalanceException.
    - findAccount(int accountId): a private helper method that takes in an int representing the account ID and returns the Account object with the given ID if it exists in the list of accounts. If the account is not found, it returns null.

 */

public class Main {
  public static void main(String[] args) {
    // Create a new instance of the BankAccount class
    Account account = new Account(1000, "Ronaldo", 1000);

    // Withdraw an amount that exceeds the balance
    try {
      account.withdraw(1500);
    } catch (InsufficientBalanceException e) {
      System.out.println(e.getMessage());
    }

    // Withdraw a valid amount
    try {
      account.withdraw(500);
    } catch (InsufficientBalanceException e) {
      System.out.println(e.getMessage());
    }

    // Withdraw a negative amount
    try {
      account.withdraw(-100);
    } catch (InsufficientBalanceException e) {
      System.out.println(e.getMessage());
    }
  }
}
