package org.example;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[6];
        animals[0] = new Mammal();
        animals[1] = new Bird("Robin", "Red");
        animals[2] = new Fish("Goldie", 2, 0.3, "fresh");
        animals[3] = new Dog("Rex", 5, 28.5, "Black", "German Shepherd");
        animals[4] = new Pigeon("Percy", "Rock Dove");
        animals[5] = new Blowfish();

        System.out.println("All animals:");
        for (Animal animal : animals) {
            System.out.println(animal);
            animal.eat();
            System.out.println("Voice: " + animal.getVoice());
            System.out.println();
        }

        System.out.println("Selected methods on individual indexes:");

        animals[0].setName("Bella");
        ((Mammal) animals[0]).setFurColor("Brown");
        ((Mammal) animals[0]).feedMilk();
        System.out.println(animals[0]);

        ((Bird) animals[1]).fly();
        System.out.println(animals[1].getName() + " has " + ((Bird) animals[1]).getFeatherColor() + " feathers.");

        ((Fish) animals[2]).swim();

        animals[3].setAge(6);
        ((Dog) animals[3]).fetch();
        System.out.println(animals[3].getName() + " is now " + animals[3].getAge() + " years old.");

        animals[4].setWeight(0.35);
        ((Pigeon) animals[4]).deliverMessage();
        System.out.println(animals[4]);

        animals[5].setName("Puffy");
        ((Blowfish) animals[5]).setSpikeCount(350);
        ((Blowfish) animals[5]).inflate();
        System.out.println(animals[5]);
    }
}
