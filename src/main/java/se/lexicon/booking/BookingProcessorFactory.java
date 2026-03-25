package se.lexicon.booking;

import se.lexicon.customer.Customer;

public class BookingProcessorFactory {

    public static BookingProcessor getProcessor(Customer customer) {
        if (customer.isMember()) {
            return new MemberBookingProcessor();
        } else {
            return new NonMemberBookingProcessor();
        }
    }
}