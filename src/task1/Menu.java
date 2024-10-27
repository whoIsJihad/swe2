package src.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import src.task1.*;
import src.task1.FoodItems.*;
public class Menu{
    List<ComboInterface> allCombo;
    public Menu(){
        this.allCombo=new ArrayList<>();
    }
    public Menu(List<ComboInterface> combos){
        this.allCombo=combos;
    }
    public void addCombo(ComboInterface combo){
        allCombo.add(combo);
    }
    public void display(){
        System.out.println("Menu:");
        for(int i=0;i<allCombo.size();i++){
            System.out.println("\t"+(i+1)+":");
            System.out.println("\t");
            allCombo.get(i).display();
        }
    }
    public void removeCombo(ComboInterface combo){
        allCombo.remove(combo);
    }
    public void deliver(){

        allCombo.forEach(ComboInterface::deliver);
    }
    public Double getPrice(){
        return allCombo.stream().mapToDouble(ComboInterface::getPrice).sum();
    }
    public static void main(String[] args) {
        
        // Creating a list of ComboInterface objects
        Combos combos1 = new Combos(new LinkedList<>(), "Dinner deals");
        Combos combos2 = new Combos(new LinkedList<>(), "Last Supper");

        combos1.addComponent(new Burger("Beef Burger", 250.0, Arrays.asList("Beef Patty", "Lettuce", "Tomato", "Cheese"), "Regular", 2));
        combos1.addComponent(new Fries("French Fries", 100.0, true, true));
        combos1.addComponent(new Wedges("Potato Wedges", 150.0, true, true));

        combos2.addComponent(new Burger("Chicken Burger", 200.0, Arrays.asList("Chicken Patty", "Lettuce", "Tomato", "Cheese"), "Regular", 2));
        combos2.addComponent(combos1);
        // Creating a Menus object
        Menu menu = new Menu();
        menu.addCombo(combos1);
        menu.addCombo(combos2);
        // menu.removeCombo(combos2);
        // Displaying the menu
        menu.display();
    }


}