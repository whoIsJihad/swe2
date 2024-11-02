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
        //add a burger,fries,wedges,shawarma,drink 
        allCombo.add(new Burger());
        allCombo.add(new Fries());
        allCombo.add(new Wedges());
        allCombo.add(new Shawarma());
        allCombo.add(new Drink());
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
           
            allCombo.get(i).display();
        }
        System.out.println("");
    }
    public void removeCombo(ComboInterface combo){
        allCombo.remove(combo);
    }
    public void removeCombo(String name){
        allCombo.removeIf(combo -> combo instanceof Combos && ((Combos) combo).name.equals(name));
    }
    public void deliver(){

        allCombo.forEach(ComboInterface::deliver);
    }
    // public Double getPrice(){
    //     return allCombo.stream().mapToDouble(ComboInterface::getPrice).sum();
    // }
    List<ComboInterface> getCombos(){
        return allCombo;
    }

}