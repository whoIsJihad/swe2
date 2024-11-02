package src.task1.FoodItems;
import src.task1.*;

public class Drink implements ComboInterface {
    String name;
    Double price;
    String size;
    Integer sugarLevel;
    String maker;
    boolean isCarbonated;

    public Drink() {
        this.name = "Drink";
        this.price = 25.0;
        this.size = "Regular";
        this.sugarLevel = 5;
        this.maker = "Coca Cola Company";
        this.isCarbonated = true;
    }
    public Drink(String name, Double price, String size, Integer sugarLevel, String maker, boolean isCarbonated) {
        this.name = name;
        this.price = price;
        this.size = size;
        this.sugarLevel = sugarLevel;
        this.maker = maker;
        this.isCarbonated = isCarbonated;
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
