package se.lexicon.customer;

import java.util.UUID;

public class Customer {
    private static int counter;
    private final String id;
    private final String name;
    private final boolean isMember;

    public Customer(String name, boolean isMember) {
        this.id = "C-" + String.format("%02d", ++counter);
        this.name = name;
        this.isMember = isMember;
    }

    public String getId(){
        return id;
    }
    public String getName() {
        return name;
    }

    public boolean isMember() {
        return isMember;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "ID = '" + id + '\'' +
                ", Name = '" + name + '\'' +
                ", Is Member = " + isMember +
                '}';
    }
}
