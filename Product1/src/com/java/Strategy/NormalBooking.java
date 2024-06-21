package com.java.Strategy;

public class NormalBooking implements BookingStrategy{
    @Override
    public void Book() {
        System.out.println("Normal booking completed.");
    }
}
