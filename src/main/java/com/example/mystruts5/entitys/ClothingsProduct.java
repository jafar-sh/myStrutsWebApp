package com.example.mystruts5.entitys;

public class ClothingsProduct extends Prodouct{
    private String brand;
    public ClothingsProduct(String name, double price,String brand) {

        super(name, price);
        this.brand=brand;
    }

    @Override
    public void displayDetils() {
        System.out.println("Clothing: "+getName()+", Price: $"+getPrice()+" ,Brand: "+brand);

    }
}
