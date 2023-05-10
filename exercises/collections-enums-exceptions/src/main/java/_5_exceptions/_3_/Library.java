package _5_exceptions._3_;

import _5_exceptions._3_.exceptions.BookNotAvailableException;
import _5_exceptions._3_.exceptions.OverdueBookException;
import _5_exceptions._3_.exceptions.AlreadyExistsException;
import _5_exceptions._3_.exceptions.BorrowLimitException;
import _5_exceptions._3_.exceptions.UnknownCustomerException;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Library {
  public static final int MAX_LOANS_PER_CLIENT = 3;

  private Map<Book, Integer> booksCopiesMap;
  private List<Loan> loansList;
  private Set<Customer> customers;

  public Library() {
    booksCopiesMap = new HashMap<>();
    loansList = new ArrayList<>();
    customers = new HashSet<>();
  }

  public void addBook(Book book) {
    if (!booksCopiesMap.containsKey(book)) {
      booksCopiesMap.put(book, 1);
    } else {
      // book already exists, so we add just a copy of it
      int numberOfCopies = booksCopiesMap.get(book);
      booksCopiesMap.put(book, numberOfCopies + 1);
    }
  }

  public void addCustomer(Customer customer) throws AlreadyExistsException {
    if (customers.contains(customer)) {
      throw new AlreadyExistsException("Customer " + customer.getName() + " already exists and cannot be added twice.");
    }
    customers.add(customer);
  }

  public void borrowBook(Book book, Customer customer, LocalDate checkoutDate)
      throws BookNotAvailableException, BorrowLimitException {

    if (!customers.contains(customer)) {
      throw new UnknownCustomerException("Customer " + customer.getName() + " is not registered in the library.");
    }

    if (!booksCopiesMap.containsKey(book) || booksCopiesMap.get(book) == 0) {
      throw new BookNotAvailableException("The book is not available for borrowing!");
    }

    int numBorrowed = 0;
    for (Loan loan : loansList) {
      if (loan.getCustomer().equals(customer)) {
        numBorrowed++;
      }
    }
    if (numBorrowed >= MAX_LOANS_PER_CLIENT) {
      throw new BorrowLimitException("Customer " + customer.getName() + " has reached the maximum number of borrowings");
    }

    loansList.add(new Loan(book, customer, checkoutDate, checkoutDate.plusDays(14)));
    booksCopiesMap.put(book, booksCopiesMap.get(book) - 1);
  }
  
  
  public void returnBook(Book book, Customer customer, LocalDate returnDate) throws OverdueBookException {
    Loan loan = null;
    for (Loan l : loansList) {
      if (l.getBook().equals(book) && l.getCustomer().equals(customer)) {
        loan = l;
        break;
      }
    }
    if (loan == null) {
      return;
    }

    loansList.remove(loan);
    booksCopiesMap.put(book, booksCopiesMap.get(book) + 1);

    if (returnDate.isAfter(loan.getDueDate())) {
      throw new OverdueBookException("Customer " + customer.getName() + "  has exceeded the borrowing limit deadline. Penalty would be applied!");
    }
  }

  public List<Book> getOverdueBooks(LocalDate currentDate) {
    List<Book> overdueBooks = new ArrayList<>();
    for (Loan loan : loansList) {
      if (loan.getDueDate().isBefore(currentDate)) {
        overdueBooks.add(loan.getBook());
      }
    }
    return overdueBooks;
  }
}

