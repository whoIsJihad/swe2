package src.task1.FoodItems;
import java.util.List;
// 
public class Burger {
    String name;
    Double price;
    List<String>ingredients;
    String size;
    Integer spiceLevel;
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
        System.out.println("🌶️ Spice Level: " + spiceLevel);
    } 
}
