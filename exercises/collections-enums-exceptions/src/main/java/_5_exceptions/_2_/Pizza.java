package _5_exceptions._2_;

import java.util.List;

class Pizza {
    private PizzaSize size;
    private List<Toppings> toppings;

    public Pizza(PizzaSize size, List<Toppings> toppings) {
        this.size = size;
        this.toppings = toppings;
    }
    
    public PizzaSize getSize() {
        return size;
    }

    public List<Toppings> getToppings() {
        return toppings;
    }
}