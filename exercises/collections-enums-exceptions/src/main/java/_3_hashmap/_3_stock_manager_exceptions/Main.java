package _3_hashmap._3_stock_manager_exceptions;

public class Main {
    private static StockManager stockList = new StockManager();

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
          - equals() - override for hashmap
          - hashcode() - override for hashmap
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
        stockList.addStock(temp);
        
        StockItem stockItem = new StockItem("milk", 1.26, 6034);
        stockList.addStock(stockItem);

        temp = new StockItem("bread", 3.15, 323);
        stockList.addStock(temp);


        temp = new StockItem("rice", 2.58, 472);
        stockList.addStock(temp);
        
        System.out.println(stockList);
        
        
//        stockList.reserveStock("milk", 100);

        System.out.println(stockList);

        stockList.reserveStock("milk", 10000);


        System.out.println("AFTER HANDLED EXCEPTION");
        
        
//        System.out.println(stockList);
        


//        temp = new StockItem("eggs", 4.91, 250);
//        stockList.addStock(temp);
//
//        temp = new StockItem("cheese", 14.01, 357);
//        stockList.addStock(temp);
//
//        temp = new StockItem("chicken", 15.97, 125);
//        stockList.addStock(temp);
//
//        temp = new StockItem("beef", 21.19, 128);
//        stockList.addStock(temp);
//
//        temp = new StockItem("apple", 2.15, 369);
//        stockList.addStock(temp);
//
//        temp = new StockItem("banana", 1.93, 246);
//        stockList.addStock(temp);
//
//        temp = new StockItem("orange", 2.38, 229);
//        stockList.addStock(temp);
//
//        temp = new StockItem("tomato", 3.38, 364);
//        stockList.addStock(temp);
//
//        temp = new StockItem("potato", 2.05, 245);
//        stockList.addStock(temp);
//
//        temp = new StockItem("onion", 1.24, 212);
//        stockList.addStock(temp);
//
//        temp = new StockItem("lettuce", 2.22, 237);
//        stockList.addStock(temp);

        

     
    }
    
}
