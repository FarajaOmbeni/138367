package com.company;

public class Scooter extends Motorcycle{
    private int wheels;

    public Scooter(String name, float price, int wheels){
        super(name, price);
        this.wheels = wheels;

    }
    public void showAttributes(){
        System.out.printf("Name is: %s, Price is: %f, wheels: %d ",super.getName(),super.getPrice(), wheels);
        super.showDetails();
    }

    @Override
    public void showDetails(){
        System.out.println("Wheels: "+wheels);
    }

}