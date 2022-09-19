package ro.sdaacademy.advanced.hashmap;

import java.util.HashMap;
import java.util.Map;

public class StockList {
  private final Map<String, StockItem> list;

  public StockList() {
    this.list = new HashMap<>();
  }

  public void addStock(StockItem item) {
    if (item != null) {
      StockItem inStock = list.get(item.getName());
      if (inStock != null) {
        inStock.adjustStock(item.availableQuantity());
      } else {
        list.put(item.getName(), item);
      }
    }
  }

  public int sellStock(String item, int quantity) {
    StockItem inStock = list.get(item);
    if (inStock != null && quantity > 0) {
      return inStock.finalizeStock(quantity);
    }
    return 0;
  }

  public int reserveStock(String item, int quantity) {
    StockItem inStock = list.get(item);
    if (inStock != null && quantity > 0) {
      return inStock.reserveStock(quantity);
    }
    return 0;
  }

  public int unreserveStock(String item, int quantity) {
    StockItem inStock = list.get(item);
    if (inStock != null && quantity > 0) {
      return inStock.unreserveStock(quantity);
    }
    return 0;
  }

  public StockItem get(String key) {
    return list.get(key);
  }

  @Override
  public String toString() {
    String s = "Stock List:\n";
    double totalCost = 0.0;
    for (Map.Entry<String, StockItem> item : list.entrySet()) {
      StockItem stockItem = item.getValue();
      double itemValue = stockItem.getPrice() * stockItem.availableQuantity();
      s = s + stockItem + ". There are " + stockItem.availableQuantity() + " in stock. Value of items: ";
      s = s + String.format("%.2f", itemValue) + "\n";
      totalCost += itemValue;
    }
    return s + "Total stock value " + totalCost;
  }
}
