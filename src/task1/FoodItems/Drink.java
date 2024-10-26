package src.task1.FoodItems;

public class Drink {
    String name;
    Double price;
    String size;
    Integer sugarLevel;
    String maker;
    boolean isCarbonated;

    public Drink(String name, Double price, String size, Integer sugarLevel, String maker, boolean isCarbonated) {
        this.name = name;
        this.price = price;
        this.size = size;
        this.sugarLevel = sugarLevel;
        this.maker = maker;
        this.isCarbonated = isCarbonated;
    }

    public void display() {
        System.out.println("🥤 Name: " + name);
        System.out.println("💵 Price: " + price + " tk");
        System.out.println("🍾 Size: " + size);
        System.out.println("🍬 Sugar Level: " + sugarLevel);
        System.out.println("🏢 Maker: " + maker);
        System.out.println("🔘 Carbonated: " + (isCarbonated ? "Yes" : "No"));
    }

    public static void main(String[] args) {
        Drink drink = new Drink("Coca Cola", 50.0, "500ml", 35, "Coca Cola Company", true);
        drink.display();
    }

}
