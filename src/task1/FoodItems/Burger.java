package src.task1.FoodItems;
import src.task1.*;

import java.util.List;
public class Burger implements ComboInterface{
    String name;
    Double price;
    List<String>ingredients;
    String size;
    Integer spiceLevel;
    //default burger structure
    public Burger(){
        this.name="Beef Burger";
        this.price=300.0;
        this.ingredients=List.of("Beef Patty","Cheese","Lettuce","Tomato","Onion","Pickles","Ketchup","Mayonnaise");
        this.size="Regular";
        this.spiceLevel=1;
    }
    public Burger(String name,Double price,List<String>ingredients,String size,Integer spiceLevel){
        this.name=name;
        this.price=price;
        this.ingredients=ingredients;
        this.size=size;
        this.spiceLevel=spiceLevel;
    }
    public void display() {
        System.out.println("🍔 Name: " + name);
        System.out.println("💵 Price: " + price + " tk");
        System.out.println("🥗 Ingredients:");
        
        System.out.println("📏 Size: " + size);
        System.out.println("🌶️ Spice Level: " + spiceLevel+"\n");
    } 
    public Double getPrice(){
        return price;
    }

    public void deliver(){
        System.out.println("Delivering " + name);
    }
}
