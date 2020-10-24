package com.OOP.Toy;

public class Toy {
    
    private String model;
    private String brand;
    private int numOfParts;

    public Toy (String model, String brand, int numOfParts){
        // code here
        this.model = model;
        this.brand = brand;
        this.numOfParts = numOfParts;
    }
    

    public int getParts(){
        return this.numOfParts;
    }
}
