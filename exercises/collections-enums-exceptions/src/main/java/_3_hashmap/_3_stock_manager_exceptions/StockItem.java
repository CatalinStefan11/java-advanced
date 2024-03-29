package _3_hashmap._3_stock_manager_exceptions;

public class StockItem  {
    private final String name;
    private double price;
    private int quantityInStock;
    private int reserved;

    public StockItem(String name, double price, int quantityInStock) {
        this.name = name;
        this.price = price;
        this.quantityInStock = quantityInStock;
        this.reserved = 0;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int availableQuantity() {
        return quantityInStock - reserved;
    }
    
    public void setPrice(double price) {
        if (price > 0.0) {
            this.price = price;
        }
    }

    public void adjustStock(int quantity)  {
        int newQuantity = this.quantityInStock + quantity;
        if (newQuantity >= 0) {
            this.quantityInStock = newQuantity;
        }
    }

    public int reserveStock(int quantity) throws UnavailableStockException {
        if (quantity <= availableQuantity()) {
            reserved += quantity;
            return quantity;
        }
        throw new UnavailableStockException("The quantity that you want to reserve is not available");
    }

    public int unreserveStock(int quantity) {
        if (quantity <= reserved) {
            reserved -= quantity;
            return quantity;
        }
        throw new StockNotReservedException("The quantity that you want to unreserve is too big!");
    }

    public int finalizeStock(int quantity) {
        if (quantity <= reserved) {
            quantityInStock -= quantity;
            reserved -= quantity;
            return quantity;
        }
        throw new StockNotReservedException("The stock should be reserved first!");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || (obj.getClass() != this.getClass())) {
            return false;
        }
        String objName = ((StockItem) obj).getName();
        return this.name.equals(objName);
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + 31;
    }

    @Override
    public String toString() {
        return this.name + " : price " + this.price + ". reserved: " + this.reserved;
    }
}
