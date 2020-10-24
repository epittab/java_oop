package com.OOP.Exercise.Challenge;

public class Car extends Vehicle {
    
    private int gear;
    private int doors;

    public Car(int doors){
        //Constructor
        super();
        this.gear = 1;
        this.doors = doors;
    }

    public void changeGear(){        
        // instance method
        
    }

    public int getDoors(){
        return doors;
    }

    public void countDoors(){
        System.out.println("You have " + this.doors + "doors.");
    }
}
