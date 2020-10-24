package com.OOP.Animal;

public class Animal {
    
    // properties
    private String species;
    private int brain;
    private int body;
    private int size;
    private int weight;

    // constructor
    Animal(String species, int brain, int body, int size, int weight) {
        this.species = species;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }

    // methods
    public String getSpecies() {
        return this.species;
    }

    public int getBrain(){
        return this.brain;
    }
    
    public int getBody(){
        return this.body;
    }
    
    public int getSize(){
        return this.size;
    }
    
    public int getWeight(){
        return this.weight;
    }

    public void eat(){
        System.out.println("Animal.eat() called");
    }
  
    public void move(int speed){
        System.out.println("Animal is moving at " + speed);
    }
}
