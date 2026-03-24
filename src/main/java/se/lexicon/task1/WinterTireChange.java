package se.lexicon.task1;

public class WinterTireChange extends Service{

    public WinterTireChange() {
        super("Winter Tire Change", 100.0);
    }

    @Override
    public int getDuration() {
        return 60;
    }

    @Override
    public double calculatePrice() {
        return getBasePrice() * 1.2; //Will get an additional charge due to higher demand
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Service Duration=" + getDuration() + "min" +
                ", Total Price=" + calculatePrice();
    }
}
