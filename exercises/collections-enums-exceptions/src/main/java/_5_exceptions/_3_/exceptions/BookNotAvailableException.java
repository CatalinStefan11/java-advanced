package _5_exceptions._3_.exceptions;

public class BookNotAvailableException extends RuntimeException {
  public BookNotAvailableException(String message) {
    super(message);
  }
}
