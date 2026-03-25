package se.lexicon.service;

public class WinterTireChange extends Service{

    public WinterTireChange() {
        super("Winter Tire Change", 100.0, "S-002");
    }

    @Override
    public int getDuration() {
        return 60;
    }

    @Override
    public double calculatePrice() {
        double storageFee = 20.0;
        return getBasePrice() + storageFee;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Service Duration = " + getDuration() + "min" +
                ", Total Price = " + calculatePrice();
    }
}
