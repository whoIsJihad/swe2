package src.task1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import src.task1.*;
import src.task1.FoodItems.*;
import src.task1.DefaultCombos.*;

public class Menu {
    List<ComboInterface> allCombo;

    public Menu() {
        this.allCombo = new ArrayList<>();
        // add a burger,fries,wedges,shawarma,drink
        allCombo.add(new Burger());
        allCombo.add(new Fries());
        allCombo.add(new Wedges());
        allCombo.add(new Shawarma());
        allCombo.add(new Drink());
        allCombo.add(new Combo1());
        allCombo.add(new Combo2()); 
    }

    public Menu(List<ComboInterface> combos) {
        this.allCombo = combos;
    }

    public void addCombo(ComboInterface combo) {
        allCombo.add(combo);
    }

    public void display() {
        for (int i = 0; i < allCombo.size(); i++) {
            allCombo.get(i).display();
            System.out.println("");
        }
        System.out.println("");
    }
    public void removeCombo(String name) {
        allCombo.removeIf(combo -> combo instanceof Combos && ((Combos) combo).name.equals(name));
    }

    public void deliver() {
        allCombo.forEach(ComboInterface::deliver);
    }
    List<ComboInterface> getCombos() {
        return allCombo;
    }

}