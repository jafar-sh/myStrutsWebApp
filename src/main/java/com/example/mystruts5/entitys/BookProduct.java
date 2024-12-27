package com.example.mystruts5.entitys;

public class BookProduct extends  Prodouct{
    private String author;
    public BookProduct(String name, double price,String author) {
        super(name, price);
        this.author=author;
    }

    @Override
    public void displayDetils() {
        System.out.println("Book: "+ getName()+" , Price: $"+getPrice()+" , Author: "+author);

    }
}
