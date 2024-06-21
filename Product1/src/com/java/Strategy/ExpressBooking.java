package com.java.Strategy;

public class ExpressBooking implements BookingStrategy {
    @Override
    public void Book() {
        System.out.println("Express booking completed.");
    }
}
