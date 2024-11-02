package src.task1;

import java.util.LinkedList;
import java.util.List;

import src.task1.FoodItems.*;

public interface ComboInterface {

    public void display();

    public Double getPrice();

    public void deliver();

}

class Combos implements ComboInterface {
    //a list of objects which implements ComboInterface
    List<ComboInterface> components;
    //a list of objects which implements ComboInterface and also free 

    List<ComboInterface> freeItems;
    //to calculate the discounted price
    Double discountPercentage;
    //
    String name;

    // constructor
    public Combos(List<ComboInterface> components, String name) {
        this.components = components;
        this.name = name;
    }
    @Override
    public String toString() {
        return name;
    }

    public Combos(String name) {
        this.components = new LinkedList<>();
        this.freeItems = new LinkedList<>();
        this.name = name;
    }
    //copy constructor
    public Combos(Combos combo) {
        this.components = new LinkedList<>(combo.components);
        this.freeItems = new LinkedList<>(combo.freeItems);
        this.name = combo.name;
        this.discountPercentage = combo.discountPercentage;
    }

    // add custom created component from menu
    public void addComponent(ComboInterface component) {
        components.add(component);
    }
    public void addComponent(Menu menu, String name) {
        boolean matchFound = false;
        //search for the combo in the menu
        for (ComboInterface combo : menu.getCombos()) {
            if (combo instanceof Combos && ((Combos) combo).name.equalsIgnoreCase(name)) {
                Combos newCombo = new Combos((Combos) combo);
                components.add(newCombo);
                matchFound = true;
                break;
            }
        }
        if (!matchFound) {
            System.out.println("Combo with name " + name + " not found in the menu.");
        }
    }
    // add default component from menu
    public void addItem(String name) {
        switch (name.toLowerCase()) {
            case "burger":
                components.add(new Burger());
                break;
            case "fries":
                components.add(new Fries());
                break;
            case "drink":
                components.add(new Drink());
                break;
            case "shawarma":
                components.add(new Shawarma());
                break;
            case "wedges":
                components.add(new Wedges());
                break;
            default:
                System.out.println("Item not recognized.");
                break;
        }
    }

    // how to remove a component from combo
    public void removeComponent(ComboInterface component) {
        components.remove(component);
    }

    public void removeComponent(String name) {
        boolean matchFound = false;
        for (ComboInterface component : components) {
            if (component.toString().equalsIgnoreCase(name)) {
                components.remove(component);
            matchFound = true;
            break;
            }
        }
        if (matchFound) {
            System.out.println("Component with name " + name + " removed.");
        } else {
            System.out.println("Component with name " + name + " not found.");
        }
    }

    public void setDiscountPercentage(Double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }
    public void addFreeItem(String name) {
        switch (name.toLowerCase()) {
            case "burger":
                freeItems.add(new Burger());
                break;
            case "fries":
                freeItems.add(new Fries());
                break;
            case "drink":
                freeItems.add(new Drink());
                break;
            case "shawarma":
                freeItems.add(new Shawarma());
                break;
            case "wedges":
                freeItems.add(new Wedges());
                break;
            default:
                System.out.println("Item not recognized.");
                break;
        }
    }
    public void display() {
        System.out.println("Combo: " + name);
        if(components.size()>0){
            System.out.println("Items:");
            components.forEach(ComboInterface::display);
        }
        
        if(freeItems.size()>0){
            System.out.println("Free Items:");
            freeItems.forEach(ComboInterface::display);
        }
       
    }

    public void deliver() {
        components.forEach(ComboInterface::deliver);
    }

    public Double getPrice() {
        return components.stream().mapToDouble(ComboInterface::getPrice).sum() * (1 - discountPercentage / 100);
    }

}
