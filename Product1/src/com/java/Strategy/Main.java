package com.java.Strategy;

public class Main {
    public static void main(String[] args) {
        BookingContext context= new BookingContext(new ExpressBooking());
        context.book();

        context.setBookingStrategy(new NormalBooking());
        context.book();
    }
}
