package src.task1.FoodItems;
import src.task1.*;
public class Fries implements ComboInterface{
    String name;
    Double price;
    
    boolean isDeepFried;
    boolean mayoneeseIncluded;

    public Fries(String name, Double price, boolean isDeepFried, boolean mayoneeseIncluded) {
        this.name = name;
        this.price = price;
        this.isDeepFried = isDeepFried;
        this.mayoneeseIncluded = mayoneeseIncluded;
    }
    public void display(){
        System.out.println("🍟 Name: " + name);
        System.out.println("💵 Price: " + price + " tk");
        System.out.println("🔥 Deep Fried: " + (isDeepFried ? "Yes" : "No"));
        System.out.println("🍶 Mayoneese Included: " + (mayoneeseIncluded ? "Yes\n" : "No\n"));
    }

    public Double getPrice(){
        return price;
    }
    public void deliver(){
        System.out.println("Delivering " + name);
    }
}
