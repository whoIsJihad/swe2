package src.task1;

import java.util.List;

import src.task1.FoodItems.*;

public interface ComboInterface {

    public void display();

    public Double getPrice();

    public void deliver();

}

class Combos implements ComboInterface {
    List<ComboInterface> components;

    public Combos(List<ComboInterface> components) {
        this.components = components;
    }

    public void addComponent(ComboInterface component) {
        components.add(component);
    }
    public void removeComponent(ComboInterface component) {
        components.remove(component);
    }

    public void display() {
        components.forEach(ComboInterface::display);
    }
    public void deliver() {
        components.forEach(ComboInterface::deliver);
    }
    public Double getPrice() {
        return components.stream().mapToDouble(ComboInterface::getPrice).sum();
    }
    
}

