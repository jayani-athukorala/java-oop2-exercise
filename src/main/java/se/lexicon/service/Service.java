package se.lexicon.service;

import java.util.UUID;

public abstract class Service {
    private static int counter;
    private final String id;
    private final String name;
    private final double basePrice;

    //Constructor
    protected Service(String name, double basePrice) {
        this.id = "S-" + String.format("%02d", ++counter);
        this.name = name;
        this.basePrice = basePrice;
    }

    //Getters for Encapsulation
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBasePrice() {
        return basePrice;
    }

    // Abstract methods (will be implemented in subclasses)
    public abstract int getDuration(); // in minutes

    public abstract double calculatePrice();

    @Override
    public String toString() {
        return "Service{" +
                "ID = '" + id + '\'' +
                ", Name = '" + name + '\'' +
                ", BasePrice = " + basePrice +
                '}';
    }
}
