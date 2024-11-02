package src.task1.DefaultCombos;

import src.task1.*;

public class Combo1 implements ComboInterface {
    String name;
    Double price;
    public Combo1() {
        this.name = "Combo1";
        this.price = 400.0;
    }
    @Override
    public Double getPrice() {
        return this.price;
    }

    @Override
    public void display() {
        System.out.println(this.name + "(Burger +Fries +Drink)- " + this.price);
    }

    @Override
    public void deliver() {
        System.out.println("Delivering " + this.name);
    }

}
