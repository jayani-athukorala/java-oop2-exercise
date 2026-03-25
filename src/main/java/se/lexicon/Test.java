package se.lexicon;

import se.lexicon.booking.*;
import se.lexicon.customer.*;
import se.lexicon.service.*;
import java.util.ArrayList;
import java.util.List;

public class Test {

    static void main() {
        IO.println("------------Exercise 1---------------");
        Service service1 = new SummerTireChange();
        IO.println(service1);
        Service service2 = new WinterTireChange();
        IO.println(service2);

        IO.println("------------Exercise 2 ---------------");
        List<Service> services = new ArrayList<>();

        services.add(new WinterTireChange());
        services.add(new SummerTireChange());

        //Runtime polymorphism
        for (Service service : services) {
            IO.println(service);
        }

        IO.println("------------Exercise 3 ---------------");
        // Create customers (mix of members and non-members)
        Customer c1 = new Customer("John Smith", CustomerType.MEMBER);  // member
        Customer c2 = new Customer("Alice Johnson", CustomerType.MEMBER);   // member
        Customer c3 = new Customer("Bob Brown", CustomerType.NON_MEMBER);   // non-member
        Customer c4 = new Customer("Emma Davis", CustomerType.MEMBER);  // member
        Customer c5 = new Customer("Liam Wilson", CustomerType.NON_MEMBER); // non-member

        // Create services
        Service summer = new SummerTireChange();
        Service winter = new WinterTireChange();

        // List to store all bookings (simulates a system/database)
        List<Booking> bookings = new ArrayList<>();

        // Bookings
        bookings.add(processBooking(c1, summer));
        bookings.add(processBooking(c2, winter));
        bookings.add(processBooking(c3, winter));
        bookings.add(processBooking(c4, summer));
        bookings.add(processBooking(c5, summer));

        IO.println("====== All Bookings ======");
        for (Booking booking : bookings) {
            IO.println(booking);
        }
    }

    /**
     * Helper method to avoid duplicating booking logic.
     * This method:
     * 1. Creates a BookingRequest
     * 2. Selects correct processor (member/non-member)
     * 3. Processes booking
     */
    private static Booking processBooking(Customer customer, Service service) {
        // New Booking request
        BookingRequest request = new BookingRequest(customer, service);

        // Factory decides which processor to use
        BookingProcessor processor = BookingProcessorFactory.getProcessor(customer.getType());

        // Process and return booking
        return processor.processBooking(request);
    }
}
