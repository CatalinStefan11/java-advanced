package _0_multithreading._1_;

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

        We could have three people using a joint bank account at the same time.
        Create and start three threads that use the same BankAccount instance and an initial balance of $1000.00.
        One will deposit $300.00 into the bank account, and then withdraw $50.00.
        Another will deposit $203.75 and then withdraw $100.00
        And the last one will withdraw 103.25 and deposit 600
        
        --> for each Thread add a Thread.sleep(100) before the operations to the account
         to mimic some heavy work that takes 100 milliseconds for each thread
         
        --> add Thread.sleep(1000) in main method in order for the main thread to not exit the program 
        before the other threads complete their executions
        
        After testing how multithreading non-safe behaviour is working, we need to make the methods thread-safe
        
        Hint: 
        - use synchronized keyword for the methods from BankAccount class
      
        */
        final BankAccount account = new BankAccount("12345-678", 1000.00);

        Thread t1 = new Thread() {
            public void run() {

                // heavy work that takes some milliseconds
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                
                account.deposit(300.00);
                account.withdraw(50.00);
            }
        };
        
        // 1250

        Thread t2 = new Thread() {
            public void run() {

                // heavy work that takes some milliseconds
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                
                account.withdraw(100.00);
                account.deposit(203.75);
            }
        };


        // 1353,75
        
        Thread t3 = new Thread() {
            public void run() {

                // heavy work that takes some milliseconds
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                account.withdraw(103.25);
                account.deposit(600);
            }
        };

        // 1850,5
        
        t1.start();
        t2.start();
        t3.start();
        
        // if the threads run in order result is 1850,5
        
        Thread.sleep(1000);

        System.out.println(account);
        
    }
}
