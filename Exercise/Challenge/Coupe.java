package com.OOP.Exercise.Challenge;

public class Coupe extends Car {
    public Coupe(){
        super(2);
    }
    

    @Override
    public void countDoors(){
        System.out.print("You have " + getDoors() + " in your coupe.");
    }
}
