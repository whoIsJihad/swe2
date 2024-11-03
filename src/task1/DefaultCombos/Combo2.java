package src.task1.DefaultCombos;

import src.task1.*;

public class Combo2 implements ComboInterface {
    String name;
    Double price;
    public Combo2() {
        this.name = "Combo2";
        this.price = 215.0;
    }
    @Override
    public Double getPrice() {
        return this.price;
    }

    @Override
    public void display() {
        System.out.println(this.name + "(Shawarma+Drink)- " + this.price);
    }

    @Override
    public void deliver() {
        System.out.println("Delivering " + this.name);
    }
    @Override
    public String toString() {
        return this.name + "(Shawarma+Drink)- " + this.price;
    }

}
