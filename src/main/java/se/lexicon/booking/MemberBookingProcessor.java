package se.lexicon.booking;

import se.lexicon.service.Service;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class MemberBookingProcessor implements BookingProcessor {

    @Override
    public Booking processBooking(BookingRequest request) {

        Service service = request.service();

        double basePrice = service.calculatePrice();
        double discountedPrice = basePrice * 0.85; // 15% discount for members
        BigDecimal bd = BigDecimal.valueOf(discountedPrice).setScale(2, RoundingMode.HALF_UP);
        double roundedPrice = bd.doubleValue();

        boolean priority = true;

        return new Booking(
                request.customer(),
                request.service(),
                roundedPrice,
                priority
        );
    }
}
