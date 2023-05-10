package _3_hashmap._2_stock_manager;

public class Main {
    private static StockManager stockManager = new StockManager();

    public static void main(String[] args) {
        /*
          * Create a class StockItem that has a "name" which is a String and "price" which is a double 
          a "quantityInStock" which is an int and a "reserved" which is also an int
          
          The class should contain the following methods:
          - a constructor that takes name, price and quantityInStock as parameters and initialize the fields and (reserved is initialized with 0)
          - getName() - getter for name
          - getPrice() - getter for price
          - setPrice(price) - setter for price (the price is set if and only if the new price is grater then 0.0)
          - availableQuantity() - returns the available quantity by subtracting "reserved" from quantityInStock
          - adjustStock(quantity) - adjust the quantityInStock (it could add or subtract also) - check if the new quantity will be greater or equal to 0
          - reserveStock(quant) - check if quant is lower or equal to availableQuantity() and if it is then add the quant to reserved (return reserved quant)
          - unreserveStock(quant) - check if quant is lower or equal the reserved and if it is then subtract quant from reserved (return unreserved quant)
          - finalizeStock(quant) - check if quant is lower or equal then reserved and if it is then subtract quant from quantityInStock and also subtract it from reserved (return quant) 
          - toString() - override
          
          
          * Create a class StockManager which has only one field (instance variable) which is a final Map<String, StockItem>
          
          The class should contain the following methods: 
          - a constructor which don't take any parameter but initialize the map with a new HashMap<>()
          - addStock(StockItem item) - check if item is not null, then check if the key (item name) already exists in the map, 
          if exists adjustQuantity() if not add the item to the list by putting the name as key and item as value
          - reserveStock(String item, int quant) - check if the item is in the map (by checking the key), check if quant is grater then 0
          if the item is in the map and quant is grater then 0 then call the method reserveStock(quant) for that item
          - sellStock(String item, int quant) - check if the item is in the map (by checking the key), check if quant is grater then 0
          if the item is in the map and quant is grater then 0 then call the method finalizeStock(quant) for that item
          - unreserveStock(String item, int quant) - check if the item is in the map (by checking the key), check if quant is grater then 0
          if the item is in the map and quant is grater then 0 then call the method unreserveStock(quant)
          - get(String key) - returns if a StockItem is in the map (map.get(key))
          - toString() - override to print the stock list (use map.entrySet() to iterate through map entries)
          The to string should return: 
          "Stock List:
          milk : price 1.26. reserved: 0. There are 6306 in stock. Value of items: 7945.56
          Total stock value 7945.56"
      
        */
        
        StockItem temp = new StockItem("milk", 1.26, 272);
        stockManager.addStock(temp);
        
        StockItem stockItem = new StockItem("milk", 1.26, 6034);
        stockManager.addStock(stockItem);

        temp = new StockItem("bread", 3.15, 323);
        stockManager.addStock(temp);


        temp = new StockItem("rice", 2.58, 472);
        stockManager.addStock(temp);
        
        System.out.println(stockManager);
        
        
        stockManager.reserveStock("milk", 1000);

        System.out.println(stockManager);


        stockManager.sellStock("milk", 1000);

        System.out.println(stockManager);
        
        
  


        temp = new StockItem("eggs", 4.91, 250);
        stockManager.addStock(temp);

        temp = new StockItem("cheese", 14.01, 357);
        stockManager.addStock(temp);

        temp = new StockItem("chicken", 15.97, 125);
        stockManager.addStock(temp);

        temp = new StockItem("beef", 21.19, 128);
        stockManager.addStock(temp);

        temp = new StockItem("apple", 2.15, 369);
        stockManager.addStock(temp);

        temp = new StockItem("banana", 1.93, 246);
        stockManager.addStock(temp);

        temp = new StockItem("orange", 2.38, 229);
        stockManager.addStock(temp);

        temp = new StockItem("tomato", 3.38, 364);
        stockManager.addStock(temp);

        temp = new StockItem("potato", 2.05, 245);
        stockManager.addStock(temp);

        temp = new StockItem("onion", 1.24, 212);
        stockManager.addStock(temp);

        temp = new StockItem("lettuce", 2.22, 237);
        stockManager.addStock(temp);

        
        
        

     
    }
    
}
