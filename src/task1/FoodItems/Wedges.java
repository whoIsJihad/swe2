package src.task1.FoodItems;

import src.task1.*;

public class Wedges implements ComboInterface {
    String name;
    Double price;
    boolean isDeepFried;
    boolean sauceIncluded;

    public Wedges() {
        this.name = "Wedges";
        this.price = 150.0;
        this.isDeepFried = true;
        this.sauceIncluded = true;
    }

    public Wedges(String name, Double price, boolean isDeepFried, boolean sauceIncluded) {
        this.name = name;
        this.price = price;
        this.isDeepFried = isDeepFried;
        this.sauceIncluded = sauceIncluded;
    }

    public String toString() {
        return name;
    }

    public void display() {
        System.out.println(name + " - " + price + " tk");

    }

    public Double getPrice() {
        return price;
    }

    public void deliver() {
        System.out.println("Delivering " + name);
    }
}
