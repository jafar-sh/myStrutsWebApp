package com.example.mystruts5.entitys;

public class DiaryProduct extends Prodouct{
private double fatContent;
    public DiaryProduct(String name, double price, double fatContent) {
        super(name, price);
        this.fatContent=fatContent;
    }

    @Override
    public void displayDetils() {
        System.out.println("Dairy product: "+getName() +" ,Price: $"+getPrice()+", FatContent: "+fatContent+"%");


    }
}
