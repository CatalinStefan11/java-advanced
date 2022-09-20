package ro.sdacademy.advanced._1_stockmanager_exceptions;

public class StockNotReservedException extends RuntimeException{

  public StockNotReservedException(String message) {
    super(message);
  }
}
