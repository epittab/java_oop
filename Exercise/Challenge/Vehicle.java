package com.OOP.Exercise.Challenge;

public class Vehicle {
    

    private int speed;

    public Vehicle () {
        //constructor
       this.speed = 0;
    }
    public void steer(){        
        // instance method
        System.out.println("You turned.");
    }
    
    public void move(int speed){        
        // instance method
        this.speed += speed;
        System.out.println("You are going at " + this.speed + " velocity.");
    }
}
