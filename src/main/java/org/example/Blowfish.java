package org.example;

public class Blowfish extends Fish {
    private int spikeCount;

    public Blowfish() {
        super();
        this.spikeCount = 0;
    }

    public Blowfish(String name, int spikeCount) {
        super(name, "Unknown");
        this.spikeCount = spikeCount;
    }

    public Blowfish(String name, int age, double weight, String waterType, int spikeCount) {
        super(name, age, weight, waterType);
        this.spikeCount = spikeCount;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " the blowfish cracks open shellfish with its beak.");
    }

    @Override
    public String getVoice() {
        return "Quiet teeth grinding";
    }

    public void inflate() {
        System.out.println(getName() + " inflates and raises its " + spikeCount + " spikes.");
    }

    public int getSpikeCount() {
        return spikeCount;
    }

    public void setSpikeCount(int spikeCount) {
        this.spikeCount = spikeCount;
    }

    @Override
    public String toString() {
        return super.toString() + " [spikeCount=" + spikeCount + "]";
    }
}
