package com.example.myfx;

public class Business extends Passenger implements Fare {         // Business class extends Passenger class and implements Fare interface
     private final double  superTax=12000;
    private double FlightDuration;
    
    public Business(String name, String email, long phoneNumber, int age, String ticketClass, double flightDuration) {
        super(name, email, phoneNumber, age, ticketClass);
        FlightDuration = flightDuration;
    }
    
    public double getFlightDuration() {
        return FlightDuration;
    }

    @Override           // Implementation of the CalculateFare method from the Fare interface
    public double CalculateFare() {
        
        return (baseFare*FlightDuration)+ tax + superTax - discount;
    }


    
}
