package se.lexicon.booking;

import se.lexicon.customer.Customer;
import se.lexicon.service.Service;

/**
 * Represents a request to create a booking.
 * <p>
 * This is a simple immutable data carrier that holds:
 * - the customer making the booking
 * - the service being requested
 * <p>
 * It is used as input to BookingProcessor implementations,
 * which apply different business rules (e.g., member vs non-member)
 * to produce a final Booking.
 * <p>
 * Being a record, this class is:
 * - immutable (fields cannot be changed after creation)
 * - concise (constructor, accessors, toString, equals, and hashCode are auto-generated)
 *
 * @param customer the customer requesting the booking
 * @param service the service to be booked
 */
public record BookingRequest(Customer customer, Service service) {
}
