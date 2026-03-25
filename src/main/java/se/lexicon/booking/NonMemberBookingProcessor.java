package se.lexicon.booking;

import se.lexicon.service.Service;

public class NonMemberBookingProcessor implements BookingProcessor {

    @Override
    public Booking processBooking(BookingRequest request) {

        Service service = request.service();

        double price = service.calculatePrice();

        boolean priority = false;

        return new Booking(
                request.customer(),
                request.service(),
                price,
                priority
        );
    }
}
