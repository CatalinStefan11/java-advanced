package _5_exceptions._3_;

import _5_exceptions._3_.exceptions.AlreadyExistsException;

import java.time.LocalDate;

/*
  The following exercises aims to create a Library Management System.

  Create a Book class:
  -> The Book class should have private fields for title, author, and ISBN.
  -> The Book class should have a constructor that takes in a title, author, and ISBN.
  -> The Book class should have public getter methods for title, author, and ISBN.
  -> The equals method should be implemented to compare two Book objects based on their title, author, and ISBN fields.
  -> The hashCode method should be implemented to return a hash code for the Book object based on its title, author, and ISBN fields.
  
  Create a Customer class:
  -> The Customer class should have private fields for name, email, and phone number.
  -> The Customer class should have a constructor that takes in a name, email, and phone number.
  -> The Customer class should have public getter methods for name, email, and phone number.
  -> The equals method should be implemented to compare two Customer objects based on their name, email, and phone number fields.
  -> The hashCode method should be implemented to return a hash code for the Customer object based on its name, email, and phone number field
  
  Create a Loan class:
  -> The Loan class should have private fields for a Book, a Customer, a checkout date, and a due date. 
  -> The Loan class should have a constructor that takes in a Book, a Customer, a checkout date , and a due date (LocalDate).
  -> The Loan class should have public getter methods for the Book, Customer, checkout date, and due date.
  -> The Loan class should have a public method to update the due date.
  -> The dueDate should not be before the checkoutDate.
  
  Create a Library class:
  -> The Library class should have a maximum number of loans per customer, which should be set as a constant value, and it should be a public static final int.
  -> The Library class should contain a HashMap that maps each Book object to an integer value representing the number of available copies of that book.
  -> The Library class should have an ArrayList to hold all the loans that have been issued.
  -> The Library class should contain a HashSet to hold all the registered customers.
  -> The Library class should have a constructor that initializes the HashMap, ArrayList, and HashSet.
  
  -> The Library class should have a method named addBook that takes a Book object and adds it to the HashMap. 
  If the book already exists, it should just add one more copy to the existing number.
  
  -> The Library class should have a method named addCustomer that takes a Customer object and adds it to the HashSet. 
  If the customer already exists, it should throw an AlreadyExistsException.
  
  -> The Library class should have a method named borrowBook that takes a Book object, a Customer object, and a checkout date. 
  It should check whether the customer is registered with the library, whether the book is available, and whether 
  the customer has reached the maximum number of borrowings allowed. If all these conditions are satisfied, 
  it should add a new Loan object to the ArrayList and decrement the number of available copies of the book in the HashMap.
  
  -> The Library class should have a method named returnBook that takes a Book object, a Customer object, and a return date. 
  It should find the corresponding Loan object in the ArrayList and remove it. It should also increment the number of 
  available copies of the book in the HashMap. If the return date is after the due date of the loan, it should throw an OverdueBookException.
  
  -> The Library class should have a method named getOverdueBooks that takes a LocalDate object representing the current 
  date and returns an ArrayList of all the books that are overdue (i.e., the due date is before the current date)

 */

public class 

Main {

  public static void main(String[] args) {
    Library library = new Library();

    // Adding books to the library
    Book book1 = new Book("1984", "George Orwell", "9780451524935");
    Book book2 = new Book("Animal Farm", "George Orwell", "9780451526342");
    Book book3 = new Book("The Hitchhiker's Guide to the Galaxy", "Douglas Adams", "9780345391803");

    library.addBook(book1);
    library.addBook(book1); // adding a second copy of book1
    library.addBook(book2);
    library.addBook(book3);

    // Adding customers to the library
    Customer customer1 = new Customer("John Doe", "johndoe@example.com", "555-1234");
    Customer customer2 = new Customer("Jane Doe", "janedoe@example.com", "555-5678");

    try {
      library.addCustomer(customer1);
      library.addCustomer(customer1); // trying to add the same customer again, should throw AlreadyExistsException
    } catch (AlreadyExistsException e) {
      System.out.println(e.getMessage());
    }

    try {
      library.addCustomer(customer2);
    } catch (AlreadyExistsException e) {
      System.out.println(e.getMessage());
    }
    
    library.borrowBook(book1, customer1, LocalDate.now());
    
    
  }
}
