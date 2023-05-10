package _5_exceptions._3_;

import java.time.LocalDate;

public class Loan {
    private Book book;
    private Customer customer;
    private LocalDate checkoutDate;
    private LocalDate dueDate;

    public Loan(Book book, Customer customer, LocalDate checkoutDate, LocalDate dueDate) {
        this.book = book;
        this.customer = customer;
        this.checkoutDate = checkoutDate;
        this.dueDate = dueDate;
    }

    public Book getBook() {
        return book;
    }

    public Customer getCustomer() {
        return customer;
    }

    public LocalDate getCheckoutDate() {
        return checkoutDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }
}
