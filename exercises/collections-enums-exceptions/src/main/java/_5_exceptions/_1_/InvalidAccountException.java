package _5_exceptions._1_;

public class InvalidAccountException extends RuntimeException {
  public InvalidAccountException(String message) {
    super(message);
  }
}
