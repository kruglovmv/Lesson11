package com.company;

import java.util.ArrayList;

public class Box <T extends Fruit> {
    private ArrayList <T> quantity = new ArrayList<>();
    public Box() {
    }
    public void addFruit(T fruit){
        this.quantity.add(fruit);
    }
    public double getWightBox () {
        if(!this.quantity.isEmpty())
         return  this.quantity.size()*quantity.get(0).getWight();
        else return 0;
    }

    public boolean compare (Box <?> box){
       return this.quantity.size() == box.quantity.size();
    }

    public void pourIntoBox(Box<T> box) {
        this.quantity.addAll(box.quantity);
        box.quantity.clear();
    }
}
