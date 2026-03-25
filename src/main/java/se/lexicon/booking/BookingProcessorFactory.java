package se.lexicon.booking;

import se.lexicon.customer.Customer;
import se.lexicon.customer.CustomerType;

public class BookingProcessorFactory {

    public static BookingProcessor getProcessor(CustomerType type) {
        if (type == CustomerType.MEMBER) {
            return new MemberBookingProcessor();
        } else {
            return new NonMemberBookingProcessor();
        }
    }
}