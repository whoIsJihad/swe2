package src.task1.FoodItems;
import src.task1.*;
public class Shawarma implements ComboInterface {
    String name;
    Double price;
    String type;
    String filling;
    String sauce;
    boolean isSpicy;

    public Shawarma() {
        this.name = "Shawarma";
        this.price = 150.0;
        this.type = "Regular";
        this.filling = "Chicken";
        this.sauce = "Garlic";
        this.isSpicy = true;
    }
    public String toString() {
        return name;
    }
    public Shawarma(String name, Double price, String type, String filling, String sauce, boolean isSpicy) {
        this.name = name;
        this.price = price;
        this.type = type;
        this.filling = filling;
        this.sauce = sauce;
        this.isSpicy = isSpicy;
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
