package com.java.Strategy;

public class BookingContext {

    private BookingStrategy bookingStrategy;

    public BookingContext(BookingStrategy bookingStrategy) {
        this.bookingStrategy = bookingStrategy;
    }

    public void setBookingStrategy(BookingStrategy bookingStrategy) {
        this.bookingStrategy = bookingStrategy;
    }

    public void book(){
        bookingStrategy.Book();
    }
}
