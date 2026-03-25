package se.lexicon.booking;

import se.lexicon.customer.Customer;
import se.lexicon.service.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Booking {
    private static int counter;
    private final String id;
    private final Customer customer;
    private final Service service;
    private final LocalDate date;
    private final double finalPrice;
    private final boolean priority;

    public Booking(Customer customer, Service service, double finalPrice, boolean priority) {
        this.id = "B-" + String.format("%02d", ++counter);
        this.date = LocalDate.now();
        this.customer = customer;
        this.service = service;
        this.finalPrice = finalPrice;
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Booking{\n" +
                "\t ID = '" + id + "'\n" +
                "\t Date = '" + date + "'\n" +
                "\t Customer : " + customer + "\n"+
                "\t Service : " + service + "\n"+
                "\t Final Price : $" + finalPrice + "\n"+
                "\t Priority : " + priority +
                '}';
    }
}
