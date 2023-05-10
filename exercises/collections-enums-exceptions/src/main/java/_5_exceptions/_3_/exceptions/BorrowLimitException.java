package _5_exceptions._3_.exceptions;

public class BorrowLimitException extends RuntimeException {
  public BorrowLimitException(String message) {
    super(message);
  }
}
