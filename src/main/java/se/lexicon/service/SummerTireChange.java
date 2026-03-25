package se.lexicon.service;

public class SummerTireChange extends Service{

    public SummerTireChange() {
        super("Summer Tire Change", 80.0, "S-001");
    }

    @Override
    public int getDuration() {
        return 45;
    }

    @Override
    public double calculatePrice() {
        return getBasePrice() * 0.9 ; //Will get a discount
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Service Duration = " + getDuration() + "min" +
                ", Total Price = " + calculatePrice();
    }
}
