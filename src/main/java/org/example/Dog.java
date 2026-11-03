package org.example;

public class Dog extends Mammal {
    private String breed;

    public Dog() {
        super();
        this.breed = "Unknown";
    }

    public Dog(String name, String breed) {
        super(name, "Unknown");
        this.breed = breed;
    }

    public Dog(String name, int age, double weight, String furColor, String breed) {
        super(name, age, weight, furColor);
        this.breed = breed;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " the dog eats dog food from its bowl.");
    }

    @Override
    public String getVoice() {
        return "Woof!";
    }

    public void fetch() {
        System.out.println(getName() + " fetches the ball.");
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return super.toString() + " [breed=" + breed + "]";
    }
}
