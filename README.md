# Java OOP2 Concepts Exercises : Answers

## 🛠  How to Run :
1. Clone the Repository
    ```bash
    git clone https://github.com/jayani-athukorala/java-oop2-exercise.git
    ```
2. Open the project in preferred IDE.
3. Buld and Run ```Main.java```

---

## 📌 Exercise Document

You can find the exercise description here:

[Exercise Document](OOP2_Exercises.md)

---

## 🧱 UML Class Diagrams

```mermaid
classDiagram
%% --------------------------
%% Customer
class Customer {
-String id
-String name
-CustomerType type
+Customer(String name, boolean isMember)
}

%% --------------------------
%% Service (Abstract)
class Service {
<<abstract>>
-String id
-String name
-double basePrice
+Service(String name, double basePrice)
+int getDuration()
+double calculatePrice()
}

%% --------------------------
%% Subclasses of Service
class SummerTireChange {
+SummerTireChange()
+int getDuration()
+double calculatePrice()
}

class WinterTireChange {
+WinterTireChange()
+int getDuration()
+double calculatePrice()
}

%% --------------------------
%% BookingRequest (record)
class BookingRequest {
+BookingRequest(Customer customer, Service service)
+Customer customer()
+Service service()
}

%% --------------------------
%% Booking (record)
class Booking {
+Booking(Customer customer, Service service, double finalPrice, boolean priority)
+Customer customer()
+Service service()
+double finalPrice()
+boolean priority()
}

%% --------------------------
%% BookingProcessor (Interface)
class BookingProcessor {
<<interface>>
+Booking processBooking(BookingRequest request)
}

%% --------------------------
%% Implementations of BookingProcessor
class MemberBookingProcessor {
+Booking processBooking(BookingRequest request)
}

class NonMemberBookingProcessor {
+Booking processBooking(BookingRequest request)
}

%% --------------------------
%% Factory
class BookingProcessorFactory {
+getProcessor(Customer customer) : BookingProcessor
}

%% --------------------------
%% CustomerType
class CustomerType {
    <<enumeration>>
    MEMBER
    NON_MEMBER 
}

%% --------------------------
%% Relationships
    Customer --> BookingRequest : creates
    Service --> BookingRequest : used in

    Customer --> Booking : associated with
    Service --> Booking : associated with

    BookingProcessor <|.. MemberBookingProcessor
    BookingProcessor <|.. NonMemberBookingProcessor

    BookingProcessorFactory --> BookingProcessor : returns
```
---
## ⚡ Expected Output :

```
------------Exercise 1---------------
Service{ID = 'S-01', Name = 'Summer Tire Change', BasePrice = $80.0}, Service Duration = 45 min, Total Price = $72.0
Service{ID = 'S-02', Name = 'Winter Tire Change', BasePrice = $100.0}, Service Duration = 60 min, Total Price = $120.0
------------Exercise 2 ---------------
Service{ID = 'S-02', Name = 'Winter Tire Change', BasePrice = $100.0}, Service Duration = 60 min, Total Price = $120.0
Service{ID = 'S-01', Name = 'Summer Tire Change', BasePrice = $80.0}, Service Duration = 45 min, Total Price = $72.0
------------Exercise 3 ---------------
====== All Bookings ======
Booking{
	 ID = 'B-01'
	 Date = '2026-03-25'
	 Customer : Customer{ID = 'C-01', Name = 'John Smith', Is Member = MEMBER}
	 Service : Service{ID = 'S-01', Name = 'Summer Tire Change', BasePrice = $80.0}, Service Duration = 45 min, Total Price = $72.0
	 Final Price : $61.2
	 Priority : true}
Booking{
	 ID = 'B-02'
	 Date = '2026-03-25'
	 Customer : Customer{ID = 'C-02', Name = 'Alice Johnson', Is Member = MEMBER}
	 Service : Service{ID = 'S-02', Name = 'Winter Tire Change', BasePrice = $100.0}, Service Duration = 60 min, Total Price = $120.0
	 Final Price : $102.0
	 Priority : true}
Booking{
	 ID = 'B-03'
	 Date = '2026-03-25'
	 Customer : Customer{ID = 'C-03', Name = 'Bob Brown', Is Member = NON_MEMBER}
	 Service : Service{ID = 'S-02', Name = 'Winter Tire Change', BasePrice = $100.0}, Service Duration = 60 min, Total Price = $120.0
	 Final Price : $120.0
	 Priority : false}
Booking{
	 ID = 'B-04'
	 Date = '2026-03-25'
	 Customer : Customer{ID = 'C-04', Name = 'Emma Davis', Is Member = MEMBER}
	 Service : Service{ID = 'S-01', Name = 'Summer Tire Change', BasePrice = $80.0}, Service Duration = 45 min, Total Price = $72.0
	 Final Price : $61.2
	 Priority : true}
Booking{
	 ID = 'B-05'
	 Date = '2026-03-25'
	 Customer : Customer{ID = 'C-05', Name = 'Liam Wilson', Is Member = NON_MEMBER}
	 Service : Service{ID = 'S-01', Name = 'Summer Tire Change', BasePrice = $80.0}, Service Duration = 45 min, Total Price = $72.0
	 Final Price : $72.0
	 Priority : false}
```

---