package src.task1.FoodItems;
import src.task1.*;

public class Wedges implements ComboInterface{
    String name;
    Double price;
    boolean isDeepFried;
    boolean sauceIncluded;

    public Wedges(String name,Double price,boolean isDeepFried,boolean sauceIncluded){
        this.name=name;
        this.price=price;
        this.isDeepFried=isDeepFried;
        this.sauceIncluded=sauceIncluded;
    }
    public void display(){
        System.out.println("🍟 Name: " + name);
        System.out.println("💵 Price: " + price + " tk");
        System.out.println("🔥 Deep Fried: " + (isDeepFried ? "Yes" : "No"));
        System.out.println("🍶 Sauce Included: " + (sauceIncluded ? "Yes" : "No"));
    }
    public Double getPrice(){
        return price;
    }
    public void deliver(){
        System.out.println("Delivering " + name);
    }
}
