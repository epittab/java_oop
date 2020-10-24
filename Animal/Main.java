package com.OOP.Animal;

public class Main {
    public static void main(String[] args) {
        Animal snake = new Animal("Python", 1, 12, 3, 13);
        Dog dog = new Dog("Yorkie", 8, 20, 2, 4, 1, 13, "Long and Silky");
        System.out.println("this is an animal: " + snake.getSpecies());
        System.out.println("this is a dog: " + dog.getSpecies());
        dog.eat();
        dog.walk();
        dog.run();
    }
}
