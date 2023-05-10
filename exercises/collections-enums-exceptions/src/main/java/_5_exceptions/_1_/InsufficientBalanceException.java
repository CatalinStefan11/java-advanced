package _5_exceptions._1_;

public class InsufficientBalanceException extends Exception {
  public InsufficientBalanceException(String message) {
    super(message);
  }
}