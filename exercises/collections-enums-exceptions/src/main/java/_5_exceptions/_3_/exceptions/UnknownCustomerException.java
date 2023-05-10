package _5_exceptions._3_.exceptions;

public class UnknownCustomerException extends RuntimeException {
  public UnknownCustomerException(String message) {
    super(message);
  }
}
