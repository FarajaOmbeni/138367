package com.company;

public class Motorcycle {

    private String name;
    private float price;

    public Motorcycle(String name){
        this.name=name;
    }
    public Motorcycle(String name, float Price){
        this.name=name;
        this.price=Price;
    }
    public void setPrice(float Price) {
        this.price = Price;}

    public String getName(){return this.name;}

    public float getPrice() {return this.price;}


    public void showDetails(){System.out.println("Name: "+name);
        System.out.println("Price: " +price);}

}
