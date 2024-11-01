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
    List<ComboInterface> components;
    List<ComboInterface> freeItems;
    Double discountPercentage;
    String name;

    // constructor
    public Combos(List<ComboInterface> components, String name) {
        this.components = components;
        this.name = name;
    }

    public Combos(String name) {
        this.components = new LinkedList<>();
        this.name = name;
    }
    // discount percentage setter

    // add custom created component from menu
    public void addComponent(ComboInterface component) {
        components.add(component);
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
        components.removeIf(component -> component instanceof Combos && ((Combos) component).name.equals(name));
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
        System.out.println("Combo: " + name + "\n");
        components.forEach(ComboInterface::display);
        freeItems.forEach(ComboInterface::display);
    }

    public void deliver() {
        components.forEach(ComboInterface::deliver);
    }

    public Double getPrice() {
        return components.stream().mapToDouble(ComboInterface::getPrice).sum() * (1 - discountPercentage / 100);
    }

}
