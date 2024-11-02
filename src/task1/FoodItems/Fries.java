package src.task1.FoodItems;
import src.task1.*;
public class Fries implements ComboInterface{
    String name;
    Double price;
    
    boolean isDeepFried;
    boolean mayoneeseIncluded;
    public Fries(){
        this.name="Fries";
        this.price=100.0;
        this.isDeepFried=true;
        this.mayoneeseIncluded=true;
    }
    public Fries(String name, Double price, boolean isDeepFried, boolean mayoneeseIncluded) {
        this.name = name;
        this.price = price;
        this.isDeepFried = isDeepFried;
        this.mayoneeseIncluded = mayoneeseIncluded;
    }
    public String toString() {
        return name;
    }
    public void display(){
        System.out.println(name + " - " + price + " tk");

    }

    public Double getPrice(){
        return price;
    }
    public void deliver(){
        System.out.println("Delivering " + name);
    }
}
