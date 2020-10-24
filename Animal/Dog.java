package com.OOP.Animal;

public class Dog extends Animal {
 
    // specific properties to Dog
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    // constructor
    public Dog(String species, int size, int weight, int eyes, int legs, int tail, int teeth, String coat){
        // super calls the parents constructor with req. params
        super(species, 1, 1, size, weight);
        // initialize fields related to Dog
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    // methods
    private void chew(){
        System.out.println("Dog.chew() called");
    }

    // override method from parent (superclass)
    @Override
    public void eat(){
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }

    public void walk(){
        System.out.println("Dog.walk() call");
        move(3);
    }
    
    public void run(){
        System.out.println("Dog.run() call");
        move(10);
    }
}
