package com.example.mystruts5.entitys;

public class SnackProduct extends Prodouct{
    private int calories;
    public SnackProduct(String name, double price,int calories) {
        super(name, price);
        this.calories=calories;
    }

    @Override
    public void displayDetils() {
        System.out.println("Snack Product: "+getName() + " ,Price:$"+getPrice()+" , calories"+calories);


    }
}
