package org.example;

public class Pigeon extends Bird {
    private String species;

    public Pigeon() {
        super();
        this.species = "Unknown";
    }

    public Pigeon(String name, String species) {
        super(name, "Unknown");
        this.species = species;
    }

    public Pigeon(String name, int age, double weight, String featherColor, String species) {
        super(name, age, weight, featherColor);
        this.species = species;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " the pigeon eats seeds and breadcrumbs.");
    }

    @Override
    public String getVoice() {
        return "Coo!";
    }

    public void deliverMessage() {
        System.out.println(getName() + " carries a message back to its home loft.");
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public String toString() {
        return super.toString() + " [species=" + species + "]";
    }
}
