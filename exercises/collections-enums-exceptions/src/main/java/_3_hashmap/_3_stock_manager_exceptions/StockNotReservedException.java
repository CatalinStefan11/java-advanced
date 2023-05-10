package _3_hashmap._3_stock_manager_exceptions;

public class StockNotReservedException extends RuntimeException{

  public StockNotReservedException(String message) {
    super(message);
  }
}
