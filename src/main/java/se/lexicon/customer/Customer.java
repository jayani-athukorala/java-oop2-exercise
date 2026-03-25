package se.lexicon.customer;

public class Customer {
    private static int counter;
    private final String id;
    private final String name;
    private final CustomerType type;

    public Customer(String name, CustomerType type) {
        this.id = "C-" + String.format("%02d", ++counter);
        this.name = name;
        this.type = type;
    }

    public String getId(){
        return id;
    }
    public String getName() {
        return name;
    }

    public CustomerType getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "ID = '" + id + '\'' +
                ", Name = '" + name + '\'' +
                ", Is Member = " + type +
                '}';
    }
}
