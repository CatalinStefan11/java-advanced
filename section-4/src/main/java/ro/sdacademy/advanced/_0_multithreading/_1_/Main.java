package ro.sdacademy.advanced._0_multithreading._1_;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        /*
        Create and start threads.
        
        Create first a BankAccount class which will have a double balance and a String accountNumber.
        The class should  contain the following methods:
        - a constructor which initialize both fields
        - a method deposit which adds to the account balance
        - a method withdraw which subtracts from the account balance
        - toString() method which prints the account details

        We could have two people using a joint bank account at the same time.
        Create and start two threads that use the same BankAccount instance and an initial balance of $1000.00.
        One will deposit $300.00 into the bank account, and then withdraw $50.00.
        The other will deposit $203.75 and then withdraw $100.00
        
        After testing how multithreading non-safe behaviour is working, we need to make the methods thread-safe
        */
        final BankAccount account = new BankAccount("12345-678", 1000.00);

        Thread t1 = new Thread() {
            public void run() {
                account.deposit(300.00);
                account.withdraw(50.00);
            }
        };

        Thread t2 = new Thread() {
            public void run() {
                account.withdraw(100.00);
                account.deposit(203.75);
            }
        };

        t1.start();
        t2.start();
        
        Thread.sleep(100);

        System.out.println(account);
        
    }
}
