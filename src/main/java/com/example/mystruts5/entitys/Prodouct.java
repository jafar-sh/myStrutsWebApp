package com.example.mystruts5.entitys;

abstract class Prodouct {
    private String name;
    private double price;

    public Prodouct(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public  abstract  void  displayDetils();

}
