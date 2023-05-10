package _5_exceptions._2_;

class IncompleteOrderException extends Exception {
  public IncompleteOrderException(String message) {
    super(message);
  }
}