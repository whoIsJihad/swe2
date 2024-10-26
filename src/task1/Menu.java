package src.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import src.task1.*;
import src.task1.FoodItems.*;
public class Menu{
    List<ComboInterface> combos;
    public Menu(List<ComboInterface> combos){
        this.combos=combos;
    }
    public void display(){
        combos.forEach(ComboInterface::display);
    }
    public void deliver(){
        combos.forEach(ComboInterface::deliver);
    }
    public Double getPrice(){
        return combos.stream().mapToDouble(ComboInterface::getPrice).sum();
    }
    public static void main(String[] args) {
        // Creating a list of ComboInterface objects
        Combos combos = new Combos(new ArrayList<>());
        combos.addComponent(new Burger("Beef Burger", 250.0, Arrays.asList("Beef Patty", "Lettuce", "Tomato", "Cheese"), "Regular", 2));
        combos.addComponent(new Fries("French Fries", 100.0, true, true));
        combos.addComponent(new Wedges("Potato Wedges", 150.0, true, true));
        // Creating a Menus object
        Menu menu = new Menu(Arrays.asList(combos));
        // Displaying the menu
        menu.display();
    }


}